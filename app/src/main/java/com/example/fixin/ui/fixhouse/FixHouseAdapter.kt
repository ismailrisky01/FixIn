package com.example.fixin.ui.fixhouse

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.fixin.R
import com.example.fixin.databinding.ItemFixerFilterBinding
import com.example.fixin.databinding.ItemFixhouseBinding


class FixHouseAdapter(val context: Context, val data: ArrayList<ModelFixhouse>) :
    RecyclerView.Adapter<FixHouseAdapter.ViewHolder>() {
    lateinit var binding: ItemFixhouseBinding

    class ViewHolder(val binding: ItemFixhouseBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding =
            ItemFixhouseBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return data.size
    }
}

class ModelFixhouse(val image: String, val nama: String, val rating: Int,val alamat:String,val keterangan_buka :Boolean,val no_hp :String)