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

    private lateinit var homeViewModel: HomeViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentHomeBinding.bind(view)
        val data = ArrayList<ModelTransaksi>()
        data.add(ModelTransaksi("Mas Akbar akan mengservice ac pada pukul 14.00"))
        binding.IDRecyclerViewHome.layoutManager = LinearLayoutManager(requireContext())
        binding.IDRecyclerViewHome.adapter = HomeTransaksiAdapter(requireContext(),data)
        binding.imageView3.setOnClickListener {
            signOut()
            findNavController().navigate(R.id.action_navigation_home_to_loginFragment)
        }
        binding.IDImageProfile.setOnClickListener { findNavController().navigate(R.id.action_navigation_home_to_profileFragment) }
    }

    class ModelTransaksi(val txt1: String) {}

}