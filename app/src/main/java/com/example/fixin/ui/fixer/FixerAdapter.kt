package com.example.fixin.ui.fixer

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fixin.databinding.ItemFixerBinding
import com.example.fixin.databinding.ItemHomeTransaksiBinding
import com.example.fixin.ui.home.HomeTransaksiAdapter
import com.squareup.picasso.Picasso

class FixerAdapter(val context: Context, val data:ArrayList<ModelFixer>):RecyclerView.Adapter<FixerAdapter.ViewHolder>() {
    lateinit var  binding:ItemFixerBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
         binding =
            ItemFixerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
val data = data[position]
        val targer = holder.binding.IDFixerImage
        Picasso.get().load(data.image).into(targer)
        holder.binding.IDFixerText.text = data.nama_kategori
    }

    override fun getItemCount(): Int {
       return data.size
    }

    class ViewHolder(val binding:ItemFixerBinding):RecyclerView.ViewHolder(binding.root) {

    }
}
class ModelFixer(val image:String,val nama_kategori:String)