package com.sundayndu.weatherapp.di

import com.sundayndu.weatherapp.BuildConfig
import com.sundayndu.weatherapp.data.network.WeatherNetworkService
import com.sundayndu.weatherapp.data.repository.WeatherRepoImpl
import com.sundayndu.weatherapp.data.repository.WeatherRepository
import com.sundayndu.weatherapp.utils.Configs.NETWORK_REQUEST_TIMEOUT
import com.sundayndu.weatherapp.utils.TokenInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient())
            .build()
    }

    @Provides
    @Singleton
    fun provideNetworkService(retrofit: Retrofit): WeatherNetworkService {
        return retrofit.create(WeatherNetworkService::class.java)
    }

    @Provides
    @Singleton
    fun provideWeatherRepository(networkService: WeatherNetworkService): WeatherRepository {
        return WeatherRepoImpl(networkService)
    }


    private fun httpClient(): OkHttpClient {
        val httpLoggingInterceptor = HttpLoggingInterceptor().apply {
            setLevel(HttpLoggingInterceptor.Level.BODY)
        }
        return OkHttpClient.Builder()
            .readTimeout(NETWORK_REQUEST_TIMEOUT, TimeUnit.SECONDS)
            .connectTimeout(NETWORK_REQUEST_TIMEOUT, TimeUnit.SECONDS)
            .addInterceptor(TokenInterceptor(BuildConfig.APP_TOKEN))
            .addInterceptor(httpLoggingInterceptor)
            .build()
    }
}