package es.ua.eps.fragment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class FilmAdapter (context: Context?, resource: Int, objects: MutableList<Film>?) :
    ArrayAdapter<Film>(context!!, resource, objects!!) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view: View = convertView?: LayoutInflater.from(this.context)
            .inflate(R.layout.films_list, parent, false)

        val filmTitle = view.findViewById(R.id.filmNameTV) as TextView
        val filmDirector = view.findViewById(R.id.filmDirectorNameTV) as TextView
        val filmIcon = view.findViewById(R.id.iconoIV) as ImageView

        getItem(position)?.let {
            filmTitle.text = it.title
            filmDirector.text = it.director
            filmIcon.setImageResource(it.imageResId)
        }

        return view
    }
}