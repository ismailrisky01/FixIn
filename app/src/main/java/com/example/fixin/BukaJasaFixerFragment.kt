package com.example.fixin

import android.graphics.Path
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.fixin.databinding.FragmentBukaJasaFixerBinding
import kotlinx.android.synthetic.main.fragment_buka_jasa_fixer.*

class BukaJasaFixerFragment : Fragment() {
    lateinit var binding: FragmentBukaJasaFixerBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBukaJasaFixerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.IDFixerBukaJasaButton.setOnClickListener {
            findNavController().navigate(R.id.action_bukaJasaFixerFragment_to_fixerAfterRegisterFragment2)
        }
        binding.IDFxerBukaJasaBtnBack.setOnClickListener {
            findNavController().navigate(R.id.action_bukaJasaFixerFragment_to_fixerFragment)
        }
    }


}