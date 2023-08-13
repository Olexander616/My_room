package com.example.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment


import com.example.room.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        APP = this
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_fragment)
                    as NavHostFragment
        navController = navHostFragment.navController

     //  navController = Navigation.findNavController(this, R.id.nav_fragment)
    }
}