package com.example.peliculasalvarezerwing.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.peliculasalvarezerwing.*
import com.example.peliculasalvarezerwing.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

    var peliculas: ArrayList<Pelicula> = ArrayList()

    private lateinit var notificationsViewModel: NotificationsViewModel
    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
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
        peliculas.add( Pelicula(1, "Spiderman 2","Han pasado dos años desde que el tranquilo Peter Parker (Tobey Maguire) dejó a su amor de toda la vida, Mary Jane Watson (Kirsten Dunst) y decidió seguir el camino de la responsabilidad como Spider-Man.", R.drawable.spiderman))
        peliculas.add( Pelicula(2, "Star Wars episodio 3","Después de 3 años de intensos enfrentamientos, la Guerra de los Clones está llegando a su fin. El concilio Jedi ordena a Obi Wan que traiga al líder separatista ante la justicia.", R.drawable.stars))

        peliculas.add( Pelicula(3, "Mr. robot","Mr. Robot es una serie de televisión de género tecno-thriller y drama estadounidense creada por Sam Esmail. Está protagonizada por Rami Malek como Elliot Alderson, un ingeniero de seguridad informática y pirata informático que padece un trastorno de ansiedad social y depresión clínica.", R.drawable.robot))
        peliculas.add( Pelicula(4, "Dexter","Dexter es una serie de televisión emitida originalmente por la cadena Showtime desde el 1 de octubre de 2006 hasta el 22 de septiembre de 2013. Es protagonizada por Michael C. Hall (como Dexter) y está ambientada en Miami.", R.drawable.dexter))


    }
}