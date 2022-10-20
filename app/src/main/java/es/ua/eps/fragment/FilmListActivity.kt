package es.ua.eps.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.Toast

class FilmListActivity : AppCompatActivity(), FilmListFragment.OnItemSelectedListener {

    val PARAM_POSICION = "position"
    var posicionSeleccionada = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film_list)

        // Comprueba si estamos usando el layout dinámico
        if (findViewById<View?>(R.id.fragment_container) != null) {
            // Si se está restaurando, no hace falta cargar el fragmento
            if (savedInstanceState != null) return

            // Creamos el fragmento
            val listFragment = FilmListFragment()
            val dataFragment = FilmDataFragment()

            // Pasamos los extras del intent al fragmento
            //listFragment.arguments = intent.extras

            // Añadimos el fragmento al contenedor
            supportFragmentManager.beginTransaction().add(R.id.fragment_container, listFragment).commit()
        }
    }

    override fun onItemSelected(position: Int) {
        var dataFragment = supportFragmentManager.findFragmentById(R.id.details_fragment) as FilmDataFragment

        Log.i("BUG--", "$dataFragment")

        if (dataFragment != null) {
            // Tipo estático: actualizamos directamente el fragmento
            Log.i("BUG--", "ENTRO IF")
            dataFragment.setDetalleItem(position)
        } else {
            Log.i("BUG--", "ENTRO ELSE")
            Toast.makeText(this@FilmListActivity, "TEST", Toast.LENGTH_SHORT)
            // Tipo dinámico: hacemos transición al nuevo fragmento
            //dataFragment = FilmDataFragment()
            /*val args = Bundle()
            args.putInt(PARAM_POSICION, position)
            dataFragment.arguments = args*/

            /*val t = supportFragmentManager.beginTransaction()
            t.replace(R.id.fragment_container, dataFragment)
            t.addToBackStack(null)
            t.commit()*/
        }
    }
}