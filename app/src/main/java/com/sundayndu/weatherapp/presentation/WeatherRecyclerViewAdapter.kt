package com.sundayndu.weatherapp.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sundayndu.weatherapp.data.model.WeatherListItem
import com.sundayndu.weatherapp.databinding.WeatherItemBinding
import com.sundayndu.weatherapp.utils.makeUrl

class WeatherRecyclerViewAdapter(
    private val entries: MutableList<WeatherListItem>,
    private val onClick: (WeatherListItem) -> Unit
) : RecyclerView.Adapter<WeatherRecyclerViewAdapter.ViewHolder>() {

    class ViewHolder(private val binding: WeatherItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun toBind(item: WeatherListItem) {
            binding.weatherLocationEntry.text = item.dateText
            binding.timeLabel.text = "${item.main.temp}°"
            // From documentation, the first weather condition in API respond is primary
            binding.weatherSummaryLabel.text = item.weather.firstOrNull()?.description
            Glide.with(binding.root.context)
                .load(makeUrl(item.weather.firstOrNull()?.icon))
                .into(binding.summaryIcon)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = WeatherItemBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.toBind(entries[position])
        holder.itemView.setOnClickListener {
            onClick(entries[position])
        }
    }

    override fun getItemCount(): Int {
        return entries.size
    }

    fun populate(newList: List<WeatherListItem>) {
        entries.clear()
        entries.addAll(newList)
        notifyDataSetChanged()
    }
}