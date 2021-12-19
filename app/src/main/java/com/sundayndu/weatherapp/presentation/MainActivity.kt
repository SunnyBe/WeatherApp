package com.sundayndu.weatherapp.presentation

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.dialog.MaterialDialogs
import com.sundayndu.weatherapp.R
import com.sundayndu.weatherapp.data.model.WeatherListItem
import com.sundayndu.weatherapp.data.model.WeatherResponse
import com.sundayndu.weatherapp.databinding.ActivityMainBinding
import com.sundayndu.weatherapp.databinding.WeatherDetailBinding
import com.sundayndu.weatherapp.utils.Configs
import com.sundayndu.weatherapp.utils.ResultState
import com.sundayndu.weatherapp.utils.interpretTemp
import com.sundayndu.weatherapp.utils.makeUrl
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()
    private val weatherRecyclerAdapter: WeatherRecyclerViewAdapter =
        WeatherRecyclerViewAdapter(mutableListOf(), ::weatherSelection)

    private lateinit var detailDialog: AlertDialog

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.weatherList.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = weatherRecyclerAdapter
        }
        binding.locationEntry.setText(Configs.DEFAULT_LOCATION)
        mainViewModel.fetchWeather(binding.locationEntry.text.toString())
        mainViewModel.weatherListResult.observe(this, ::processResultState)

        binding.locationEntryContainer.setEndIconOnClickListener {
            mainViewModel.fetchWeather(binding.locationEntry.text.toString())
        }
    }

    private fun processResultState(resultState: ResultState<WeatherResponse>) {
        when (resultState) {
            is ResultState.Success -> {
                presentLoadingView(false)
                updateList(resultState.data)
            }
            is ResultState.Error -> {
                presentLoadingView(false)
                presentErrorView(resultState.error.message)
            }
            is ResultState.Loading -> {
                presentLoadingView(true)
                resultState.data?.let {
                    updateList(it)
                }
            }
        }
    }

    private fun updateList(weatherResponse: WeatherResponse) {
        binding.titleText.text = "${weatherResponse.city.name}, ${weatherResponse.city.country}"
        weatherRecyclerAdapter.populate(weatherResponse.list)
    }

    private fun presentErrorView(cause: String? = "") {
        Log.e(javaClass.simpleName, cause?:"")
        MaterialAlertDialogBuilder(this)
            .setTitle("Failed")
            .setMessage("Failed to fetch data, check entries and try again!")
            .setPositiveButton(resources.getString(R.string.ok)) { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }

    private fun presentLoadingView(toShow: Boolean = false) {
        if (toShow) {
            // Todo add loading view
            Toast.makeText(this, "Loading... ", Toast.LENGTH_SHORT).show()
        } else {
            // Todo hide loading view
        }
    }

    private fun weatherSelection(weather: WeatherListItem) {
        // Render weather detail
        val detailBinding = WeatherDetailBinding.inflate(layoutInflater, binding.root, false)
        detailBinding.apply {
            weatherLocationEntry.text = weather.dateText
            timeLabel.text = "${weather.main.temp}°"
            weatherSummaryLabel.text = weather.weather.firstOrNull()?.description
            weatherTimedList.text = interpretTemp(weather.main.temp)
            Glide.with(binding.root.context)
                .load(makeUrl(weather.weather.firstOrNull()?.icon))
                .into(summaryIcon)
        }
        detailDialog = MaterialAlertDialogBuilder(this)
            .setView(detailBinding.root)
            .show()
    }

    override fun onDestroy() {
        super.onDestroy()
        if (::detailDialog.isInitialized && detailDialog.isShowing) detailDialog.dismiss()
    }
}