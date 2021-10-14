package com.example.peliculasalvarezerwing

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.BaseAdapter

class AdaptadorSerie: BaseAdapter {

    lateinit var context: Context
    var series: ArrayList<Serie> = ArrayList()

    constructor(context: Context,series : ArrayList<Serie>){

        this.context = context
        this.series = series
    }

    override fun getCount(): Int {
        return series.size
    }

    override fun getItem(p0: Int): Any {
        return series[p0]
    }

    override fun getItemId(p0: Int): Long {
        return series[p0].id.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val inflador = LayoutInflater.from(context)
        val visita = inflador.inflate(R.layout.serie_view, null )

        val tv_nombre_serie: TextView = visita.findViewById(R.id.tv_nombre_serie)
        val tv_desc_serie: TextView = visita.findViewById(R.id.tv_desc_serie)
        val ing_serie: ImageView = visita.findViewById(R.id.ing_serie)

        var serie: Serie = series[p0]

        tv_nombre_serie.setText(serie.nombre)
        tv_desc_serie.setText(serie.desc)
        ing_serie.setImageResource(serie.ing)

        visita.setOnClickListener{

            val intent: Intent = Intent(context, DetallePelicula:: class.java)

            intent.putExtra("nombre", serie.nombre)
            intent.putExtra("desc", serie.desc)
            intent.putExtra("ing", serie.ing)


            context.startActivity(intent)
        }

        return visita

    }
}