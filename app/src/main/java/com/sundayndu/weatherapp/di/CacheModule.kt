package com.sundayndu.weatherapp.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class CacheModule {

//    @Provides
//    fun provideWeatherDatabase(@ApplicationContext context: Context): WeatherDatabase {
//        return Room.databaseBuilder(context, WeatherDatabase::class.java, Configs.DB_NAME)
//            .build()
//    }
}