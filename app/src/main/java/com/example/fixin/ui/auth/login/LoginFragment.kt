package com.example.fixin.ui.auth.login

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.fixin.R
import com.example.fixin.databinding.FragmentLoginBinding
import com.example.fixin.lib.Google
import com.example.fixin.lib.IOnBackPressed
import com.google.firebase.auth.FirebaseAuth

class LoginFragment : Google(), IOnBackPressed {
    lateinit var binding: FragmentLoginBinding
    val user = FirebaseAuth.getInstance().currentUser
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (user != null) {
            findNavController().navigate(R.id.action_loginFragment_to_navigation_home)
        } else {
            initUI()
        }

    }

    private fun initUI() {
        binding.IDLoginTxtDaftar.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }
        binding.btnLogin.setOnClickListener {
            signIn()
        }
        binding.IDLoginBtnLogin.setOnClickListener {
            val email = binding.IDLoginEdtEmail.text.toString()
            val password = binding.IDLoginEdtPassword.text.toString()
            if (email == "" && password == "") {
                Toast.makeText(requireContext(), "Please fill Email and Password", Toast.LENGTH_SHORT)
                    .show()
            } else {
                FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(requireActivity()) { task ->
                        if (task.isSuccessful) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d("LoginFragment", "signInWithEmail:success")
                            findNavController().navigate(R.id.action_loginFragment_to_navigation_home)
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w("LoginFragment", "signInWithEmail:failure", task.exception)
                            Toast.makeText(
                                requireContext(), "Authentication failed.",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }

            }

        }
    }

    override fun onBackPressed(): Boolean {
        return false
    }


}