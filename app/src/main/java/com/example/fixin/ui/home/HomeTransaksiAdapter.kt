package com.example.fixin.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fixin.databinding.ItemHomeTransaksiBinding

class HomeTransaksiAdapter(context: Context, val data: ArrayList<ModelTransaksi>) :
    RecyclerView.Adapter<HomeTransaksiAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemHomeTransaksiBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemHomeTransaksiBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val datas =  data[position]
        holder.binding.IDItemHome.text = datas.txt1

    }

    override fun getItemCount(): Int {
        return data.size
    }
}
class ModelTransaksi(val txt1: String)