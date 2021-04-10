package com.example.fixin.ui.riwayat

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.fixin.R
import com.example.fixin.databinding.ItemRiwayatBinding
import kotlin.collections.ArrayList

class RiwayatAdaper(val context: Context, val data: ArrayList<ModelRiwayat>) :
    RecyclerView.Adapter<RiwayatAdaper.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemRiwayatBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = data[position]
        holder.binding.IDItemRiwayatNama.text = data.nama
        holder.binding.IDItemRiwayatRating.rating = data.rating
        holder.binding.IDItemRiwayatJam.text = data.time
        holder.binding.IDRiwayatInfo.setOnClickListener {
            it.findNavController().navigate(R.id.action_navigation_riwayat_to_fixHouseContentFragment)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class ViewHolder(val binding: ItemRiwayatBinding) : RecyclerView.ViewHolder(binding.root) {

    }
}

class ModelRiwayat(val nama: String, val rating: Float, val time: String)