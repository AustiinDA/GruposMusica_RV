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
    private val s1: Array<String>,
    private val s2: Array<String>,
    private val images: Array<Int>
) : RecyclerView.Adapter<AdaptadorItems.ItemViewHolder>() {


    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemImage: ImageView = itemView.findViewById(R.id.imageLogo)
        var itemTitle: TextView = itemView.findViewById(R.id.nombre_grupo)
        var itemDetail: TextView = itemView.findViewById(R.id.genero_grupo)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.mis_filas, parent, false)
        return ItemViewHolder(v)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.itemTitle.text = s1[position]
        holder.itemDetail.text = s2[position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return images.size
    }

}




