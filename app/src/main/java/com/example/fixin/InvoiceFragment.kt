package com.example.fixin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_invoice.*

class InvoiceFragment : Fragment(R.layout.fragment_invoice) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_konfirmasi.setOnClickListener {
//            findNavController().navigate(R.id.)
        }
        button_hubungi_jasa.setOnClickListener {
//            findNavController().navigate(R.id.)
        }
    }


//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
//                              savedInstanceState: Bundle?): View? {
//        // Inflate the layout for this fragment
//        val v = inflater.inflate(R.layout.fragment_invoice, container, false)
//        val buttonKonfirmasi: Button = v.findViewById(R.id.button_konfirmasi)
//        val buttonHubungiJasa: Button = v.findViewById(R.id.button_hubungi_jasa)
//
//        buttonKonfirmasi.setOnClickListener {
//            val invoiceFragment = InvoiceFragment()
//            val fragmentManager = requireActivity().supportFragmentManager
//            val transaction = fragmentManager.beginTransaction()
//            transaction.replace(R.id.nav_host_fragment_container, invoiceFragment)
//            transaction.addToBackStack(null)
//            transaction.commit()
//        }
//
//        buttonHubungiJasa.setOnClickListener {
//            val chatFragment = ChatFragment()
//            val fragmentManager = requireActivity().supportFragmentManager
//            val transaction = fragmentManager.beginTransaction()
//            transaction.replace(R.id.nav_host_fragment_container, chatFragment)
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
//         * @return A new instance of fragment InvoiceFragment.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//                InvoiceFragment().apply {
//                    arguments = Bundle().apply {
//                        putString(ARG_PARAM1, param1)
//                        putString(ARG_PARAM2, param2)
//                    }
//                }
//    }
}