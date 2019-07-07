package com.abs.statusenergy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cvReligar.setOnClickListener {
            startActivity(Intent(this, ReligarActivity::class.java))
        }

        cvNova.setOnClickListener {
            //startActivity(Intent(this, NovaActivity::class.java))
        }

        cvTrocar.setOnClickListener {
            //startActivity(Intent(this, TrocarActivity::class.java))
        }
    }
}
