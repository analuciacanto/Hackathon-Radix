package com.abs.statusenergy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_religar.*

class ReligarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_religar)

        btNext.setOnClickListener {
            if (tietCep.text.toString().isEmpty()) {
                tietCep.error = "Campo obrigatório."
            }

            if (tietNumber.text.toString().toInt() > 10) {
                startActivity(Intent(this, ResultadoPendenciaActivity::class.java))
            }
        }
    }
}