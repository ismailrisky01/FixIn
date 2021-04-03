package com.example.fixin.ui.profile

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fixin.databinding.ItemHomeTransaksiBinding
import com.example.fixin.databinding.ItemProfileKeahlianBinding

class ProfileAdapter(context: Context, val data: ArrayList<ModelProfileKeahlian>) :
    RecyclerView.Adapter<ProfileAdapter.ViewHolder>() {
    lateinit var binding: ItemProfileKeahlianBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemProfileKeahlianBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProfileAdapter.ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
val data = data[position]
        holder.binding.IDProfilKeahlian.text = "- "+data.keahlian
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class ViewHolder(val binding: ItemProfileKeahlianBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }
}

class ModelProfileKeahlian(val keahlian: String)