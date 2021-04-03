package com.example.fixin.ui.fixer.filter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fixin.databinding.FragmentFixerFilterPencarianBinding
import com.example.fixin.ui.fixer.FixerFragment

class FixerFilterPencarianFragment : Fragment() {
    lateinit var binding: FragmentFixerFilterPencarianBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFixerFilterPencarianBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val string = arguments?.getString(FixerFragment.keyData)
        Toast.makeText(requireContext(), string, Toast.LENGTH_SHORT).show()
        val data = ArrayList<ModelFixerPencarian>()
        data.add(ModelFixerPencarian("s","a",3))
        data.add(ModelFixerPencarian("s","a",3))
        binding.IDFixerFilterPencarianRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.IDFixerFilterPencarianRecyclerView.adapter = FixerFilterAdapter(requireContext(),data)

    }


}