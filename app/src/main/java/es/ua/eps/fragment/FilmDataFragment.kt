package es.ua.eps.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class FilmDataFragment : Fragment() {

    val fds = FilmDataSource.films

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_film_data, container, false)
    }

    public fun setDetalleItem(id: Int) {

        val film = fds[id]

        val filmName: TextView? = activity?.findViewById(R.id.filmDataTextTexView)
        filmName?.text = film.title

        val filmDirector: TextView? = activity?.findViewById(R.id.dRZTV)
        filmDirector?.text = film.director

        val filmYear: TextView? = activity?.findViewById(R.id.year1985TV)
        filmYear?.text = film.year.toString()

        val filmGenre: TextView? = activity?.findViewById(R.id.genreTV)
        filmGenre?.text = selectGenre(film.genre)

        val filmFormat: TextView? = activity?.findViewById(R.id.formatTV)
        filmFormat?.text = selectFormat(film.format)
    }

    private fun selectGenre(id : Int): String {
        if (id == 0) return "Acción"
        else if (id == 1) return "Comedía"
        else if (id == 2) return "Drama"
        else if (id == 3) return "Sci-Fi"
        else return "Terror"
    }

    private fun selectFormat(id : Int): String {
        return when (id) {
            0 -> "DVD"
            1 -> "Blu-ray"
            else -> "Digital"
        }
    }
}