package es.ua.eps.fragment

object FilmDataSource {
    val films: MutableList<Film> = mutableListOf<Film>()

    init {
        var f = Film()
        f.id = 0
        f.title = "Regreso al futuro"
        f.director = "Robert Zemeckis"
        f.imageResId = R.mipmap.ic_launcher
        f.comments = ""
        f.format = Film.Companion.FORMAT_DIGITAL
        f.genre = Film.Companion.GENRE_SCIFI
        f.imdbUrl = "http://www.imdb.com/title/tt0088763"
        f.year = 1985
        films.add(f)

        var f2 = Film()
        f2.id = 1
        f2.title = "Regreso al futuro II"
        f2.director = "Robert Zemeckis"
        f2.imageResId = R.mipmap.ic_launcher
        f2.comments = ""
        f2.format = Film.Companion.FORMAT_DIGITAL
        f2.genre = Film.Companion.GENRE_SCIFI
        f2.imdbUrl = "https://www.imdb.com/title/tt0096874/"
        f2.year = 1989
        films.add(f2)

        var f3 = Film()
        f3.id = 2
        f3.title = "Regreso al futuro III"
        f3.director = "Robert Zemeckis"
        f3.imageResId = R.mipmap.ic_launcher
        f3.comments = ""
        f3.format = Film.Companion.FORMAT_DIGITAL
        f3.genre = Film.Companion.GENRE_SCIFI
        f3.imdbUrl = "https://www.imdb.com/title/tt0099088/"
        f3.year = 1990
        films.add(f3)

        var f4 = Film()
        f4.id = 3
        f4.title = "Los cazafantasmas"
        f4.director = "Ivan Reitman"
        f4.imageResId = R.mipmap.ic_launcher
        f4.comments = ""
        f4.format = Film.Companion.FORMAT_DIGITAL
        f4.genre = Film.Companion.GENRE_SCIFI
        f4.imdbUrl = "https://www.imdb.com/title/tt0087332/"
        f4.year = 1984
        films.add(f4)
    }
}