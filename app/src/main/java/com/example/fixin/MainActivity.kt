package com.example.fixin

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.fixin.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        val navController = findNavController(R.id.nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration(
            setOf(R.id.navigation_home, R.id.navigation_riwayat, R.id.navigation_chat)
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        binding.navView.setupWithNavController(navController)
        navController.addOnDestinationChangedListener { _, destination, _ ->
            if (destination.id==R.id.navigation_home||destination.id==R.id.navigation_riwayat||destination.id==R.id.navigation_chat)
            {
                binding.navView.visibility = View.VISIBLE
            }else{
                binding.navView.visibility = View.GONE
            }
//            when (destination.id) {
//                R.id.profileFragment -> binding.navView.visibility = View.GONE
//                R.id.navigation_home -> binding.navView.visibility = View.VISIBLE
//                R.id.loginFragment -> binding.navView.visibility = View.GONE
//                R.id.fixerFragment -> binding.navView.visibility = View.GONE
//            }
        }

    }

}