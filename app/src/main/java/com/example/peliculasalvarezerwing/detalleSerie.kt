package com.example.peliculasalvarezerwing

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class detalleSerie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_serie)

        val tvse_nombre: TextView = findViewById(R.id.nombre_detalle_serie)
        val tvse_desc: TextView = findViewById(R.id.desc_detalle_serie)
        val tvse_serie: ImageView = findViewById(R.id.ing_serie)

        val bundle = intent.extras

        if (bundle != null){
            var nombre: String? = bundle.getString("nombre")
            var desc: String? = bundle.getString("desc")
            var ing = bundle.getInt("ing")

            tvse_nombre.setText(nombre)
            tvse_desc.setText(desc)
            tvse_serie.setImageResource(ing)

        }
    }
}