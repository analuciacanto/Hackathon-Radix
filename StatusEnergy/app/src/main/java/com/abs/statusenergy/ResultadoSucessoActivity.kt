package com.abs.statusenergy

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_resultado_sucesso.*


class ResultadoSucessoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_sucesso)

        ivIdentidade.setOnClickListener {
            requestCameraPermission()
        }

        ivFoto.setOnClickListener {
            requestCameraPermission()
        }
    }

    private fun requestCameraPermission() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.CAMERA),
                1
            )
        } else {
            startActivity(Intent(this, CameraActivity::class.java))
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            1 -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                } else {
                    Toast.makeText(
                        this@ResultadoSucessoActivity,
                        "Você precisa conceder a permissão para acessar a tela.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                return
            }
        }
    }
}
