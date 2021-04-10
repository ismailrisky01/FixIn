package com.example.fixin

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fixin.databinding.FragmentBukaJasaFixerBinding
import com.example.fixin.databinding.FragmentFixerAfterRegisterBinding
import kotlinx.android.synthetic.main.fragment_fixer_after_register.*


class FixerAfterRegisterFragment : Fragment(R.layout.fragment_fixer_after_register) {
lateinit var binding:FragmentFixerAfterRegisterBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
       binding = FragmentFixerAfterRegisterBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.IDFixerAfterRegisterButton.setOnClickListener {
            findNavController().navigate(R.id.action_fixerAfterRegisterFragment_to_navigation_home2)
        }
    }

}




