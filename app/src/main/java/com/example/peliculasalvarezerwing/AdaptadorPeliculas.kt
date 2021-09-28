package com.example.peliculasalvarezerwing

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AdaptadorPeliculas: BaseAdapter {

    lateinit var context: Context
    var peliculas: ArrayList<Pelicula> = ArrayList()

    constructor(context: Context, peliculas: ArrayList<Pelicula>){

        this.context = context
        this.peliculas = peliculas
    }

    override fun getCount(): Int {
        return peliculas.size
    }

    override fun getItem(p0: Int): Any {
        return peliculas[p0]
    }

    override fun getItemId(p0: Int): Long {
        return peliculas[p0].id.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
       val inflador = LayoutInflater.from(context)
        val visita = inflador.inflate(R.layout.pelicula_view, null )

        val tv_nombre: TextView = visita.findViewById(R.id.tv_nombre)
        val tv_desc: TextView = visita.findViewById(R.id.tv_desc)
        val ing: ImageView = visita.findViewById(R.id.ing_peli)

        var pelicula: Pelicula = peliculas[p0]

        tv_nombre.setText(pelicula.nombre)
        tv_desc.setText(pelicula.desc)
        ing.setImageResource(pelicula.ing)

        return visita

    }
}