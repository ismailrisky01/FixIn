package com.example.fixin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_register.*


class RegisterFragment : Fragment(R.layout.fragment_register) {
//    val registerLayout: ConstraintLayout? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_register, container, false)
//        registerLayout = v!!.findViewById(R.layout.registerLayout)

        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_buat_akun.setOnClickListener {
//            val action = RegisterFragmentDirections.actionRegisterFragmentToNavigationHome(signUp(usernameSignUp, emailSignUp, passwordSignUp))
            val action = RegisterFragmentDirections.actionRegisterFragmentToNavigationHome()
            findNavController().navigate(action)
        }
    }

    private fun signUp(username: String, email: String, password: String) {
        if(username.trim().equals(null)) {
            Toast.makeText(context, "Username cannot be empty", Toast.LENGTH_SHORT).show()
//            Snackbar.make(,"Username cannot be empty", Snackbar.LENGTH_SHORT).show()
//            Snackbar.make(view, "Username", Snackbar.LENGTH_SHORT).show()
        }else if(email.trim().equals(null)) {
            Toast.makeText(context, "Email cannot be empty", Toast.LENGTH_SHORT).show()
        }else if(password.trim().equals(null)) {
            Toast.makeText(context, "You should fulfill your password", Toast.LENGTH_SHORT).show()
        }else if(username.trim().equals(null) && email.trim().equals(null)) {
            Toast.makeText(context, "Error 404", Toast.LENGTH_SHORT).show()
        }else if(email.trim().equals(null) && password.trim().equals(null)) {
            Toast.makeText(context, "Error 404", Toast.LENGTH_SHORT).show()
        }else if(username.trim().equals(null) && password.trim().equals(null)) {
            Toast.makeText(context, "Error 404", Toast.LENGTH_SHORT).show()
        }else if(username.trim().equals(null) && email.trim().equals(null) && password.trim().equals(null)) {
            Toast.makeText(context, "Error 404", Toast.LENGTH_SHORT).show()
        }
    }


//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        val v = inflater.inflate(R.layout.fragment_register, container, false)
//        val btn: Button = v.findViewById(R.id.button_buat_akun)
//
//        btn.setOnClickListener {
//            val homeFragment = HomeFragment()
//            val fragmentManager = requireActivity().supportFragmentManager
//            val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
//            fragmentTransaction.replace(R.id.nav_host_fragment_container, homeFragment)
//            fragmentTransaction.addToBackStack(null)
//            fragmentTransaction.commit()
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
//         * @return A new instance of fragment RegisterFragment.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            RegisterFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }
}