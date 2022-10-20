package es.ua.eps.fragment


import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ListView
import androidx.fragment.app.ListFragment

class FilmListFragment : ListFragment() {

    val fds = FilmDataSource.films

    var callback: OnItemSelectedListener? = null

    // Interfaz definida por nosotros que debe implementar
    // la actividad contenedora
    interface OnItemSelectedListener {
        fun onItemSelected(position: Int)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        // Comprueba que la actividad implemente la interfaz definida
        // y guarda una referencia en la variable "callback"
        callback = try {
            context as OnItemSelectedListener
        } catch (e: ClassCastException) {
            throw ClassCastException(context.toString()
                    + " debe implementar OnItemSelectedListener")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        listAdapter = FilmAdapter(requireActivity(), R.layout.films_list, fds)
    }

    override fun onListItemClick(l: ListView, v: View, position: Int, id: Long) {
        super.onListItemClick(l, v, position, id)
        Log.i("BUG--", "antes de petar")
        callback?.onItemSelected(position)
    }
}