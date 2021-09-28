package com.example.peliculasalvarezerwing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    var peliculas: ArrayList<Pelicula> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        agregar_peliculas()

        val adaptador: AdaptadorPeliculas = AdaptadorPeliculas(this, peliculas)

        val listView: ListView = findViewById(R.id.listView)

        listView.adapter =  adaptador

    }

    fun agregar_peliculas(){
        peliculas.add( Pelicula(1, "Era del hielo","Veinte mil años antes de nuestra era, Scrat, un roedor obstinado, quiebra el banco de hielo y desencadena una nueva Edad de hielo, una gran cohorte de mamíferos se reúnen y empiezan a emigrar hacia el sur, Manny, un mamut solitario y testarudo, se empeña en ir hacia el norte y pronto se unirá a él Sid, un pequeño perezoso locuaz que busca protección.", R.drawable.era))
        peliculas.add( Pelicula(2, "La naranja mecanica","Gran Bretaña, en un futuro indeterminado. Alex (Malcolm McDowell) es un joven hiperagresivo con dos pasiones: la ultraviolencia y Beethoven. Al frente de su banda, los drugos, los jóvenes descargan sus instintos más violentos pegando, violando y aterrorizando a la población.", R.drawable.naranja))
        peliculas.add( Pelicula(3, "Spiderman 2","Han pasado dos años desde que el tranquilo Peter Parker (Tobey Maguire) dejó a su amor de toda la vida, Mary Jane Watson (Kirsten Dunst) y decidió seguir el camino de la responsabilidad como Spider-Man.", R.drawable.spiderman))
        peliculas.add( Pelicula(3, "Star Wars episodio 3","Después de 3 años de intensos enfrentamientos, la Guerra de los Clones está llegando a su fin. El concilio Jedi ordena a Obi Wan que traiga al líder separatista ante la justicia.", R.drawable.stars))




    }
}