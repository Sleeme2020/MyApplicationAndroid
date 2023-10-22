package com.example.myapplication3.work

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.myapplication3.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class mainwork: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainwork)

        val NavView: BottomNavigationView = findViewById(R.id.nav_view)
        val NavController = Navigation.findNavController(this,R.id.nav_host_fragment)

        val AppBarConfig =  AppBarConfiguration(
            setOf(
                R.id.fragment_profile,
                R.id.task_list
            ))

        setupActionBarWithNavController(NavController , AppBarConfig)
        NavView.setupWithNavController(NavController)
    }
}