package com.sundayndu.weatherapp

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.sundayndu.weatherapp.data.repository.WeatherRepository
import com.sundayndu.weatherapp.presentation.MainViewModel
import com.sundayndu.weatherapp.utils.ResultState
import com.sundayndu.weatherapp.utils.TestEntities
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runBlockingTest
import kotlinx.coroutines.test.setMain
import org.junit.*
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

@ExperimentalCoroutinesApi
class MainViewModelTest {

    private val testDispatcher = TestCoroutineDispatcher()
    @get:Rule
    val rule = InstantTaskExecutorRule()

    @Mock
    private lateinit var weatherRepository: WeatherRepository
    private lateinit var mainViewModel: MainViewModel
    private val location = "berlin"

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
        Dispatchers.setMain(testDispatcher)
        mainViewModel = MainViewModel(weatherRepository, testDispatcher)
    }

    @After
    fun cleanUp() {
        Dispatchers.resetMain()
        testDispatcher.cleanupTestCoroutines()
    }

    @Test
    fun loadWeather_Valid_updates_weatherResultLiveData() = testDispatcher.runBlockingTest{
        val testData = TestEntities.weatherResponse

        Mockito.`when`(weatherRepository.fetchWeather(location = location))
            .thenReturn(ResultState.Success(data = testData))

        mainViewModel.fetchWeather(location)

        val expected = mainViewModel.weatherListResult.value as ResultState.Success
        Assert.assertEquals(testData, expected.data)
    }

    @Test
    fun loadWeatherData_Error_updates_weatherDetail() = testDispatcher.runBlockingTest{

        Mockito.`when`(weatherRepository.fetchWeather(location))
            .thenReturn(ResultState.Error(error = Throwable("Test error")))

        mainViewModel.fetchWeather(location)

        val expected = mainViewModel.weatherListResult.value as ResultState.Error
        Assert.assertEquals("Test error", expected.error.message)
    }

    @Test
    fun loadWeatherData_Loading_updates_weatherDetail() = testDispatcher.runBlockingTest{
        Mockito.`when`(weatherRepository.fetchWeather(location))
            .thenReturn(ResultState.Loading())

        mainViewModel.fetchWeather(location)

        Assert.assertTrue(mainViewModel.weatherListResult.value is ResultState.Loading)
    }
}