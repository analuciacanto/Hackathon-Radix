package com.abs.statusenergy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.fotoapparat.Fotoapparat
import kotlinx.android.synthetic.main.activity_camera.*

class CameraActivity : AppCompatActivity() {

    lateinit var fotoapparat: Fotoapparat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)

        fotoapparat = Fotoapparat(this, cameraView)

        ivCamera.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        fotoapparat.start()
    }

    override fun onStop() {
        super.onStop()
        fotoapparat.stop()
    }
}
