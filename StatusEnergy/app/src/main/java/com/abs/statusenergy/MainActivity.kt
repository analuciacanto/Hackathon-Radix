package com.abs.statusenergy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivReligar.setOnClickListener {
            startActivity(Intent(this, ReligarActivity::class.java))
        }

        ivNova.setOnClickListener {
            //startActivity(Intent(this, NovaActivity::class.java))
        }

        ivTrocar.setOnClickListener {
            //startActivity(Intent(this, TrocarActivity::class.java))
        }
    }
}
