package com.example.fixin.ui.auth.register

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.fixin.R
import com.example.fixin.databinding.FragmentRegisterBinding
import com.google.firebase.auth.FirebaseAuth


class RegisterFragment : Fragment(R.layout.fragment_register) {
lateinit var binding: FragmentRegisterBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(inflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
binding.IDRegisterBtn.setOnClickListener {
    val username = binding.IDRegisterEdtUsername.text.toString()
    val email = binding.IDRegisterEdtEmail.text.toString()
    val password = binding.IDRegisterEdtPassword.text.toString()
    signUp(username,email, password)
}

    }

    private fun signUp(username: String, email: String, password: String) {
        if(username.trim().equals(null)) {
            Toast.makeText(context, "Username cannot be empty", Toast.LENGTH_SHORT).show()
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
        }else{
            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(requireActivity()) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        Log.d("RegisterFragemnt", "createUserWithEmail:success")
                        findNavController().navigate(R.id.action_registerFragment_to_navigation_home)
                    } else {
                        // If sign in fails, display a message to the user.
                        Log.w("RegisterFragemnt", "createUserWithEmail:failure", task.exception)
                        Toast.makeText(requireContext(), "Authentication failed.",
                            Toast.LENGTH_SHORT).show()
                    }
                }
        }
    }


}