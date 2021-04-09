package com.example.fixin.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fixin.R
import com.example.fixin.databinding.FragmentHomeBinding
import com.example.fixin.lib.Google
import com.google.firebase.auth.FirebaseAuth
import com.squareup.picasso.Picasso
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item

class HomeFragment : Google() {
lateinit var binding: FragmentHomeBinding
    private lateinit var homeViewModel: HomeViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = ArrayList<ModelTransaksi>()
        data.add(ModelTransaksi("Mas Akbar akan mengservice ac pada pukul 14.00"))
        binding.IDRecyclerViewHome.layoutManager = LinearLayoutManager(requireContext())
        binding.IDRecyclerViewHome.adapter = HomeTransaksiAdapter(requireContext(), data)
        binding.IDImageProfile.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_home_to_profileFragment)
        }
        binding.IDHomeBtnFixer.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_home_to_fixerFragment)
        }
        binding.IDHomeBtnFixHouse.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_home_to_fixHouseFragment2)
        }
        binding.IDHomeBtnChat.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_home_to_fixAskFragment)
        }
    }



}