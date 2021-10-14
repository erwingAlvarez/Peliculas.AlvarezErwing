package com.example.peliculasalvarezerwing.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.peliculasalvarezerwing.AdaptadorPeliculas
import com.example.peliculasalvarezerwing.Pelicula
import com.example.peliculasalvarezerwing.R
import com.example.peliculasalvarezerwing.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    var peliculas: ArrayList<Pelicula> = ArrayList()
    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        agregar_peliculas()

        val lv_peliculas: ListView = root.findViewById(R.id.listView_peliculas)
        val adaptador = AdaptadorPeliculas(root.context, peliculas)

        lv_peliculas.adapter = adaptador

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun agregar_peliculas(){
        peliculas.add( Pelicula(1, "Era del hielo","Veinte mil años antes de nuestra era, Scrat, un roedor obstinado, quiebra el banco de hielo y desencadena una nueva Edad de hielo, una gran cohorte de mamíferos se reúnen y empiezan a emigrar hacia el sur, Manny, un mamut solitario y testarudo, se empeña en ir hacia el norte y pronto se unirá a él Sid, un pequeño perezoso locuaz que busca protección.", R.drawable.era))
        peliculas.add( Pelicula(2, "La naranja mecanica","Gran Bretaña, en un futuro indeterminado. Alex (Malcolm McDowell) es un joven hiperagresivo con dos pasiones: la ultraviolencia y Beethoven. Al frente de su banda, los drugos, los jóvenes descargan sus instintos más violentos pegando, violando y aterrorizando a la población.", R.drawable.naranja))
        peliculas.add( Pelicula(3, "Spiderman 2","Han pasado dos años desde que el tranquilo Peter Parker (Tobey Maguire) dejó a su amor de toda la vida, Mary Jane Watson (Kirsten Dunst) y decidió seguir el camino de la responsabilidad como Spider-Man.", R.drawable.spiderman))
        peliculas.add( Pelicula(3, "Star Wars episodio 3","Después de 3 años de intensos enfrentamientos, la Guerra de los Clones está llegando a su fin. El concilio Jedi ordena a Obi Wan que traiga al líder separatista ante la justicia.", R.drawable.stars))

    }
}