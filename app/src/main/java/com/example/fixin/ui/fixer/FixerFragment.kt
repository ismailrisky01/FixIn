package com.example.fixin.ui.fixer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.fixin.R
import com.example.fixin.databinding.FragmentFixerBinding
import com.example.fixin.databinding.FragmentProfileBinding


class FixerFragment : Fragment() {
lateinit var binding:FragmentFixerBinding
companion object{
    val keyData = "data"
}
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFixerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val data = ArrayList<ModelFixer>()
        data.add(
            ModelFixer("https://firebasestorage.googleapis.com/v0/b/project3-359bf.appspot.com/o/warung1.jfif?alt=media&token=7dbff520-9342-41e8-ba38-7ce71c237241","Alat Rumah tangga")
        )
        data.add(
            ModelFixer("https://firebasestorage.googleapis.com/v0/b/project3-359bf.appspot.com/o/warung1.jfif?alt=media&token=7dbff520-9342-41e8-ba38-7ce71c237241","Alat Rumah tangga")
        )
        data.add(
            ModelFixer("https://firebasestorage.googleapis.com/v0/b/project3-359bf.appspot.com/o/warung1.jfif?alt=media&token=7dbff520-9342-41e8-ba38-7ce71c237241","Alat Rumah tangga")
        )
        data.add(
            ModelFixer("https://firebasestorage.googleapis.com/v0/b/project3-359bf.appspot.com/o/warung1.jfif?alt=media&token=7dbff520-9342-41e8-ba38-7ce71c237241","Alat Rumah tangga")
        )
        data.add(
            ModelFixer("https://firebasestorage.googleapis.com/v0/b/project3-359bf.appspot.com/o/warung1.jfif?alt=media&token=7dbff520-9342-41e8-ba38-7ce71c237241","Alat Rumah tangga")
        )
        data.add(
            ModelFixer("https://firebasestorage.googleapis.com/v0/b/project3-359bf.appspot.com/o/warung1.jfif?alt=media&token=7dbff520-9342-41e8-ba38-7ce71c237241","Alat Rumah tangga")
        )
        data.add(
            ModelFixer("https://firebasestorage.googleapis.com/v0/b/project3-359bf.appspot.com/o/warung1.jfif?alt=media&token=7dbff520-9342-41e8-ba38-7ce71c237241","Alat Rumah tangga")
        )
        data.add(
            ModelFixer("https://firebasestorage.googleapis.com/v0/b/project3-359bf.appspot.com/o/warung1.jfif?alt=media&token=7dbff520-9342-41e8-ba38-7ce71c237241","Alat Rumah tangga")
        )
        data.add(
            ModelFixer("https://firebasestorage.googleapis.com/v0/b/project3-359bf.appspot.com/o/warung1.jfif?alt=media&token=7dbff520-9342-41e8-ba38-7ce71c237241","Alat Rumah tangga")
        )
        binding.IDFixerRecyclerView.layoutManager = GridLayoutManager(requireContext(),2)
        binding.IDFixerRecyclerView.adapter = FixerAdapter(requireContext(),data)

        binding.IDFixerBtnFilter.setOnClickListener {
            binding.IDFixerFilterPopUp.visibility =View.VISIBLE
            binding.IDFixerFilterPopUpBackground.visibility = View.VISIBLE
        }
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                val bundle = bundleOf(keyData to query)
                findNavController().navigate(
                    R.id.action_fixerFragment_to_fixerPencarianFragment,
                    bundle
                )


                return true

            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return true
            }

        })
        binding.IDFixerFilterPopUpBackground.setOnClickListener {
            binding.IDFixerFilterPopUp.visibility =View.GONE
            binding.IDFixerFilterPopUpBackground.visibility = View.GONE
        }
        binding.IDFixerBtnBack.setOnClickListener {
            findNavController().navigate(R.id.action_fixerFragment_to_navigation_home)
        }

    }
}