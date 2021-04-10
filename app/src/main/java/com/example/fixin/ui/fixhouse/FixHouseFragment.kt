package com.example.fixin.ui.fixhouse

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fixin.R
import com.example.fixin.databinding.FragmentFixHouseBinding
import com.example.fixin.databinding.FragmentFixerBinding


class FixHouseFragment : Fragment() {
    lateinit var binding: FragmentFixHouseBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFixHouseBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val data = ArrayList<ModelFixhouse>()
        data.add(ModelFixhouse("sa", "asa", 4, "as", true, "as"))
        data.add(ModelFixhouse("sa", "asa", 4, "as", true, "as"))
        data.add(ModelFixhouse("sa", "asa", 4, "as", true, "as"))
        binding.IDFixhouseRecyclerview.layoutManager = LinearLayoutManager(requireContext())
        binding.IDFixhouseRecyclerview.adapter = FixHouseAdapter(requireContext(), data)

        binding.IDFixhouseAddBengkel.setOnClickListener {
            findNavController().navigate(R.id.action_fixHouseFragment_to_bukaFixHouseFragment)
        }
        binding.IDFixhouseBtnBack.setOnClickListener {
            findNavController().navigate(R.id.action_fixHouseFragment_to_navigation_home )
        }
    }
}