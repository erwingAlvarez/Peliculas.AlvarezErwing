package com.example.peliculasalvarezerwing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetallePelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        val tv_nombre: TextView = findViewById(R.id.nombre_detalle)
        val tv_desc: TextView = findViewById(R.id.desc_detalle)
        val tv_pelicula: ImageView = findViewById(R.id.ing_detalle)

        val bundle = intent.extras

        if (bundle != null){
            var nombre: String? = bundle.getString("nombre")
            var desc: String? = bundle.getString("desc")
            var ing = bundle.getInt("ing")

            tv_nombre.setText(nombre)
            tv_desc.setText(desc)
            tv_pelicula.setImageResource(ing)

        }
    }
}