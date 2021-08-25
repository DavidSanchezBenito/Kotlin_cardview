package com.example.kotlin_reciclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

/*
https://www.youtube.com/watch?v=J2nuk1Q_bNs
crea tu propio RecyclerView desde cero utilizando la librería de CardView para tener una interfaz amigable y agradable para el usuario.

 */
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        iniRecicler()   //funcion para crear el adaptardor y rellenar el ReciclerView

    }

    private fun iniRecicler() {
        val adaptorCreado = miAdaptador()
        //llamo al recycler del main con su id:
        reciclerView.layoutManager = LinearLayoutManager(this)
        reciclerView.adapter = adaptorCreado
    }
}