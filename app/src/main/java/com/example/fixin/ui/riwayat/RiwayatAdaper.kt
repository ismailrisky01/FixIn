package com.example.fixin.ui.riwayat

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fixin.databinding.ItemRiwayatBinding
import java.util.*
import kotlin.collections.ArrayList

class RiwayatAdaper(val data: ArrayList<ModelRiwayat>) :
    RecyclerView.Adapter<RiwayatAdaper.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemRiwayatBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class ViewHolder(val binding: ItemRiwayatBinding) : RecyclerView.ViewHolder(binding.root) {

    }
}

class ModelRiwayat(val nama: String, val rating: String, val time: Date)