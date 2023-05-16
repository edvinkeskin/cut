package com.example.cut.views

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.fragment.app.FragmentActivity
import com.example.cut.R
import com.example.cut.views.home.MainActivity
import com.example.cut.views.login.LoginActivity

class InitActivity: FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_init)
    }

    public override fun onStart() {
        super.onStart()
        val email = this.getSharedPreferences(
            getString(R.string.email), Context.MODE_PRIVATE)
        val password = this.getSharedPreferences(
            getString(R.string.password), Context.MODE_PRIVATE)
        if (email != null && password != null) {
            startActivity(
                Intent(
                    this,
                    MainActivity::class.java
                ).apply {
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
                })
        } else {
            startActivity(
                Intent(
                    this,
                    LoginActivity::class.java
                ).apply {
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
                })
        }
    }
}