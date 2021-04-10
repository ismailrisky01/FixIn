package com.example.fixin.ui.fixhouse.detailfixhouse

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fixin.R
import com.example.fixin.databinding.FragmentFixHouseContentBinding
import kotlinx.android.synthetic.main.fragment_fix_house_content.*

class FixHouseContentFragment : Fragment(R.layout.fragment_fix_house_content) {
    lateinit var binding: FragmentFixHouseContentBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFixHouseContentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.IDFixhouseBtnBack.setOnClickListener {
            findNavController().navigate(R.id.action_fixHouseContentFragment_to_fixHouseFragment)
        }
    }
}