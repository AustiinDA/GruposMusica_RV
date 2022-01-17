package com.dam2.agus.gruposmusica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dam2.agus.gruposmusica.adaptador.AdaptadorItems

class MainActivity : AppCompatActivity() {

     lateinit var rv : RecyclerView

    val strings1 = arrayOf(String)
    val strings2 = arrayOf(String)


    val imagenes = arrayOf(
        R.drawable.aliceinchains, R.drawable.america,
        R.drawable.annpeebles, R.drawable.aphextwin,
        R.drawable.artblakey, R.drawable.beatles,
        R.drawable.billevans, R.drawable.billypaul,
        R.drawable.catstevens, R.drawable.cpv,
        R.drawable.creedenceclearwaterrevival, R.drawable.davidbowie,
        R.drawable.delasoul, R.drawable.ettajames, R.drawable.fatjon,
        R.drawable.fleetwoodmac, R.drawable.gorillaz, R.drawable.jamesbrown,
        R.drawable.jeffbuckley, R.drawable.jorgecafrune, R.drawable.joydivision,
        R.drawable.kamasiwashington, R.drawable.luisalbertoespinetta,
        R.drawable.macdemarco, R.drawable.milesdavis, R.drawable.pattismith,
        R.drawable.pearljam, R.drawable.philcollins, R.drawable.porcupinetree,
        R.drawable.queen, R.drawable.radiohead, R.drawable.rem, R.drawable.rodstewart,
        R.drawable.soundgarden, R.drawable.supertramp, R.drawable.syljohnson,
        R.drawable.tearsforfears, R.drawable.thedoors, R.drawable.tool,
        R.drawable.tryo, R.drawable.u2, R.drawable.vampireweekend, R.drawable.wutang
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv = findViewById(R.id.recyclerView)

        val strings1 = resources.getStringArray(R.array.grupos_musica)
        val strings2 = resources.getStringArray(R.array.genero)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val adaptadorI = AdaptadorItems(this, strings1, strings2, imagenes)
        recyclerView.adapter = adaptadorI
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}