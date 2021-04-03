package com.example.fixin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_fixer_after_register.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"


class FixerAfterRegisterFragment : Fragment(R.layout.fragment_fixer_after_register) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_menu_utama_fixer.setOnClickListener {
            val action = FixerAfterRegisterFragmentDirections.actionFixerAfterRegisterFragmentToNavigationHome()
            findNavController().navigate(action)
        }
    }
}


//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        // Inflate the layout for this fragment
//        val v = inflater.inflate(R.layout.fragment_fixer_after_register, container, false)
//        val button = v.findViewById(R.id.button_menu_utama_fixer) as Button
//
//        button.setOnClickListener {
//            val homeFragment = HomeFragment()
//            val fragmentManager = requireActivity().supportFragmentManager
//            val transaction: FragmentTransaction = fragmentManager.beginTransaction()
//            transaction.replace(R.id.nav_host_fragment_container, homeFragment)
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
//         * @return A new instance of fragment FixerAfterRegisterFragment.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            FixerAfterRegisterFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }