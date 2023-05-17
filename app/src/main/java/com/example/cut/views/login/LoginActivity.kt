package com.example.cut.views.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.cut.R
import com.example.cut.databinding.ActivityLoginBinding

class LoginActivity: FragmentActivity(R.layout.activity_login) {

    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.loginFragment) as NavHostFragment
        navController = navHostFragment.navController
    }
}