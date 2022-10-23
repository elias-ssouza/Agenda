package com.example.agenda.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.agenda.data.EventCard
import com.example.agenda.databinding.CalendarItemBinding

class EventCardAdapter :
    ListAdapter<EventCard, EventCardAdapter.ViewHolder>(DiffCallback()) {

    var listenerShare: (View) -> Unit = {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = CalendarItemBinding.inflate(inflater, parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ViewHolder(
        private val binding: CalendarItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: EventCard) {
            binding.tvEvent.text = item.event
            binding.tvPlace.text = item.place
            binding.tvDate.text = item.date
            binding.tvHour.text = item.hour

        }
    }

}

class DiffCallback : DiffUtil.ItemCallback<EventCard>() {
    override fun areItemsTheSame(oldItem: EventCard, newItem: EventCard) = oldItem == newItem
    override fun areContentsTheSame(oldItem: EventCard, newItem: EventCard) =
        oldItem.id == newItem.id
}