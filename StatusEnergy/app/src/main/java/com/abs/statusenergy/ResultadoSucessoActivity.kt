package com.abs.statusenergy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_resultado_sucesso.*


class ResultadoSucessoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_sucesso)

        btNext.setOnClickListener {
            startActivity(Intent(this, DocumentosActivity::class.java))
        }
    }
}
