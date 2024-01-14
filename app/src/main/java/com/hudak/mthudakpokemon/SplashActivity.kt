package com.hudak.mthudakpokemon

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.hudak.mthudakpokemon.view.MainActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val iHome = Intent(this, MainActivity::class.java)

        Handler().postDelayed({
            startActivity(iHome)
        }, 3000)
    }
}