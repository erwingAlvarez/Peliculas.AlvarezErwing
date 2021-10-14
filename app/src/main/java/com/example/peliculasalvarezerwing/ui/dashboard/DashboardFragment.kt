package com.example.peliculasalvarezerwing.ui.dashboard

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
import com.example.peliculasalvarezerwing.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {


    var series: ArrayList<Serie> = ArrayList()
    private lateinit var dashboardViewModel: DashboardViewModel
    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        agregar_series()

        val lv_serie: ListView = root.findViewById(R.id.listView_series)
        val adaptador = AdaptadorSerie(root.context, series)

        lv_serie.adapter = adaptador

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun agregar_series(){
        series.add( Serie(1, "Mr. robot","Mr. Robot es una serie de televisión de género tecno-thriller y drama estadounidense creada por Sam Esmail. Está protagonizada por Rami Malek como Elliot Alderson, un ingeniero de seguridad informática y pirata informático que padece un trastorno de ansiedad social y depresión clínica.", R.drawable.robot))
        series.add( Serie(2, "Dexter","Dexter es una serie de televisión emitida originalmente por la cadena Showtime desde el 1 de octubre de 2006 hasta el 22 de septiembre de 2013. Es protagonizada por Michael C. Hall (como Dexter) y está ambientada en Miami.", R.drawable.dexter))
        series.add( Serie(3, "Breaking bad","un profesor de química con problemas económicos a quien le diagnostican un cáncer de pulmón inoperable. Para pagar su tratamiento y asegurar el futuro económico de su familia comienza a cocinar y vender metanfetamina.", R.drawable.breaking))
        series.add( Serie(3, "Vikings"," Vikings está inspirada en las sagas del vikingo Ragnar Lodbrok, uno de los héroes nórdicos legendarios más conocidos y notorio como el flagelo de Inglaterra y Francia. ", R.drawable.vik))

    }
}