package com.example.fixin.ui.fixask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fixin.R
import com.example.fixin.databinding.FragmentFixAskBinding


class FixAskFragment : Fragment() {

    lateinit var binding: FragmentFixAskBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFixAskBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data = ArrayList<ModelFixask>()
        data.add(ModelFixask("Ismail", "Dataa"))
        data.add(ModelFixask("Ismail", "Dataa"))
        data.add(ModelFixask("Ismail", "Dataa"))
        binding.IDFixaskRecyclerview.layoutManager = LinearLayoutManager(requireContext())
        binding.IDFixaskRecyclerview.adapter = FixaskAdapter(requireContext(), data)
        binding.IDFixaskBtnBack.setOnClickListener {
            findNavController().navigate(R.id.action_fixAskFragment_to_navigation_home)

        }
    }


}