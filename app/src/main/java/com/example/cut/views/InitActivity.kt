package com.example.cut.views

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
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
        val sharedPreferences = this.getSharedPreferences(
            getString(R.string.shared_pref), Context.MODE_PRIVATE)
        val email = sharedPreferences.getString(getString(R.string.email), null)
        val password = sharedPreferences.getString(getString(R.string.password), null)
        Log.v("email", email.toString());
        Log.v("password", password.toString());
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