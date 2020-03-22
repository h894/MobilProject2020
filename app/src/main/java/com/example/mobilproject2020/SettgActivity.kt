package com.example.mobilproject2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.jetbrains.anko.toast

class SettgActivity : AppCompatActivity() {

    private val navItemsel = BottomNavigationView.OnNavigationItemSelectedListener{ menuItem ->
        when {
            menuItem.itemId == R.id.set_tap -> {
                val intent = Intent(applicationContext, SettgActivity::class.java)
                startActivity(intent)
                return@OnNavigationItemSelectedListener true
            }
            menuItem.itemId == R.id.start -> {
                toast("Starts apps")
                return@OnNavigationItemSelectedListener true
            }
            menuItem.itemId == R.id.stat_tap -> {
                val intent = Intent(applicationContext, Stats::class.java)
                startActivity(intent)
                return@OnNavigationItemSelectedListener true
            }
            menuItem.itemId == R.id.home -> {
                val intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
                return@OnNavigationItemSelectedListener true
            }
            else -> {
                return@OnNavigationItemSelectedListener false
            }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settg)

        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bot_nav_set) as BottomNavigationView
        bottomNavigationView.setOnNavigationItemSelectedListener(navItemsel)
    }
}
