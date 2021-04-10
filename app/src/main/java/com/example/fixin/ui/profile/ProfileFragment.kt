package com.example.fixin.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fixin.R
import com.example.fixin.databinding.FragmentHomeBinding
import com.example.fixin.databinding.FragmentProfileBinding
import com.example.fixin.lib.Google
import com.example.fixin.ui.auth.login.LoginFragment


class ProfileFragment : Google() {
    lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data = ArrayList<ModelProfileKeahlian>()
        data.add(ModelProfileKeahlian(("Service Ac")))
        data.add(ModelProfileKeahlian("Perawatan helikpter"))
        data.add(ModelProfileKeahlian("Cuci kendaraan"))
        binding.IDProfilRecyclerKeahlian.layoutManager = LinearLayoutManager(requireContext())
        binding.IDProfilRecyclerKeahlian.adapter = ProfileAdapter(requireContext(), data)
        binding.IDProfileBtnLogOut.setOnClickListener {
            signOut()
            val navOption = NavOptions.Builder().setPopUpTo(R.id.loginFragment,true).build()
            findNavController().navigate(R.id.action_profileFragment_to_loginFragment,null,navOption)

        }
        binding.IDProfileBtnBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}

