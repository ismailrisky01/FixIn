package com.example.fixin.ui.riwayat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fixin.databinding.FragmentRiwayatBinding

class RiwayatFragment : Fragment() {

    lateinit var binding: FragmentRiwayatBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentRiwayatBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data = ArrayList<ModelRiwayat>()
        data.add(ModelRiwayat("Ismail",4.0f,"20 Maret 2000"))
        data.add(ModelRiwayat("Ismail",4.5f,"20 Maret 2000"))
        data.add(ModelRiwayat("Ismail",4f,"20 Maret 2000"))
        Toast.makeText(requireContext(), "Halllo", Toast.LENGTH_SHORT).show()
        binding.IDRiwayatRecyclerview.layoutManager = LinearLayoutManager(requireContext())
        binding.IDRiwayatRecyclerview.adapter = RiwayatAdaper(requireContext(),data)
    }

}