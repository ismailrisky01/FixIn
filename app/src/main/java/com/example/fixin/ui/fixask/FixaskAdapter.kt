package com.example.fixin.ui.fixask

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fixin.databinding.ItemFixaskBinding
import com.example.fixin.databinding.ItemFixerBinding
import com.example.fixin.ui.fixer.FixerAdapter

class FixaskAdapter(val context: Context, val data: ArrayList<ModelFixask>):RecyclerView.Adapter<FixaskAdapter.ViewHolder>() {
    lateinit var binding: ItemFixaskBinding
    class ViewHolder(val binding:ItemFixaskBinding):RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding =
            ItemFixaskBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return data.size
    }
}

class ModelFixask(val nama:String,val isi:String)