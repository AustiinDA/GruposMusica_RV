package com.dam2.agus.gruposmusica.adaptador

import androidx.recyclerview.widget.RecyclerView
import android.content.Context;
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import com.dam2.agus.gruposmusica.R

class AdaptadorItems(
    private val context: Context,
    val imagenes: Int,
    val datos1: String,
    val datos2: String

) : RecyclerView.Adapter<AdaptadorItems.MiViewHolder>() {


    class MiViewHolder : RecyclerView.ViewHolder {
    }


}


