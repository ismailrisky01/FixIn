package com.example.fixin.ui.fixer.filter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.fixin.R
import com.example.fixin.databinding.ItemFixerBinding
import com.example.fixin.databinding.ItemFixerFilterBinding
import com.example.fixin.ui.fixer.FixerAdapter

class FixerFilterAdapter(val context: Context, val data: ArrayList<ModelFixerPencarian>) :
    RecyclerView.Adapter<FixerFilterAdapter.ViewHolder>() {
    lateinit var binding: ItemFixerFilterBinding

    class ViewHolder(val binding: ItemFixerFilterBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.IDFixerFilter.setOnClickListener {

                it.findNavController()
                    .navigate(R.id.action_fixerPencarianFragment_to_profileFragment)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding =
            ItemFixerFilterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return data.size
    }
}

class ModelFixerPencarian(val image: String, val nama: String, val rating: Int)