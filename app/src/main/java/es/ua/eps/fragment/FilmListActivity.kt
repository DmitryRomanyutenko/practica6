package es.ua.eps.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FilmListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film_list)
    }
}

private fun addFilm() {

    val fds = FilmDataSource.films

    var lastIndexList = fds.lastIndex

    var f = Film()
    f.id = lastIndexList + 1
    f.title = "Regreso al futuro V"
    f.director = "Robert Zemeckis"
    f.imageResId = R.mipmap.ic_launcher
    f.comments = ""
    f.format = Film.Companion.FORMAT_DIGITAL
    f.genre = Film.Companion.GENRE_SCIFI
    f.imdbUrl = "http://www.imdb.com/title/tt0088763"
    f.year = 1985
    fds.add(f)
}

private fun deleteFilm(f: Film) {

    val fds = FilmDataSource.films

    fds.remove(f)
}