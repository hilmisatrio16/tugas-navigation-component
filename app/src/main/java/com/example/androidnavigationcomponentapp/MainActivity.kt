package com.example.androidnavigationcomponentapp

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.androidnavigationcomponentapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        set color action bar
        supportActionBar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#07BB3B")))

        val navController = findNavController(R.id.fragmentContainerView)

        val appBarConfiguration = AppBarConfiguration(setOf(R.id.homeFragment,R.id.feedFragment, R.id.officialStoreFragment, R.id.wishListFragment, R.id.transaksiFragment))

        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.bottomNavigationView.setupWithNavController(navController)
    }
}