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
import kotlinx.android.synthetic.main.fragment_buka_jasa_fixer.*

class BukaJasaFixerFragment : Fragment(R.layout.fragment_buka_jasa_fixer) {
     override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
         super.onViewCreated(view, savedInstanceState)
         button_daftarkan_fixer.setOnClickListener {
             val action = BukaJasaFixerFragmentDirections.actionBukaJasaFixerFragmentToFixerAfterRegisterFragment()
             findNavController().navigate(action)
         }
     }

//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
//        val v = inflater.inflate(R.layout.fragment_buka_jasa_fixer, container, false)
//        button = v.findViewById(R.id.button_daftarkan_fixer)
//
//        button.setOnClickListener {
//            val fixerAfterRegisterFragment = FixerAfterRegisterFragment()
//            val fragmentManager = requireActivity().supportFragmentManager
//            val transaction = fragmentManager.beginTransaction()
//            transaction.replace(R.id.nav_host_fragment_container, fixerAfterRegisterFragment)
//            transaction.addToBackStack(null)
//            transaction.commit()
//        }
//        return v
//    }


//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param param1 Parameter 1.
//         * @param param2 Parameter 2.
//         * @return A new instance of fragment BukaJasaFixerFragment.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//                BukaJasaFixerFragment().apply {
//                    arguments = Bundle().apply {
//                        putString(ARG_PARAM1, param1)
//                        putString(ARG_PARAM2, param2)
//                    }
//                }
//    }
}