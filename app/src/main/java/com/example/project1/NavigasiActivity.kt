package com.example.project1

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.util.Log
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.project1.databinding.ActivityNavigasiBinding
import com.example.project1.ui.login.LoginActivity
import com.example.project1.util.Pref

class NavigasiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNavigasiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNavigasiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_navigasi)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_dashboard,
                R.id.navigation_notifications,
                R.id.navigation_keranjnag
            )
        )
        //setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        navView.setOnNavigationItemSelectedListener {
            if (it.itemId == R.id.navigation_notifications) {
                val s = Pref(this)
                if (s.getISlogin()) {
                    Log.d("TAG", "Sudah Login")
                } else {
                    startActivity(Intent(this, LoginActivity::class.java))
                    Log.d("TAG", "Belum login pindah ke hal login")
                }
            } else {
                Log.d("TAG", "onCreate yg lain" + it.itemId)
                navController.navigate(it.itemId)
            }
            return@setOnNavigationItemSelectedListener true
        }
    }
}



