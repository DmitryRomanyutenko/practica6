package es.ua.eps.fragment


import android.os.Bundle
import android.view.View
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.ListFragment

class FilmListFragment : ListFragment() {

    val fds = FilmDataSource.films

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        listAdapter = FilmAdapter(requireActivity(), R.layout.films_list, fds)
    }

    override fun onListItemClick(l: ListView, v: View, position: Int, id: Long) {
        super.onListItemClick(l, v, position, id)
        cambiarDatos(position)
    }
}