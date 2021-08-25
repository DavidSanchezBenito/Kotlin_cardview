package com.example.kotlin_reciclerview

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_layout.view.*


//miAdaptador.ViewHolder => nombre de la clase y luego otra clase que tengo q crear, con el nombre que quiera
//Lo primero que hacemos es decirle a la clase que tendrá un RecyclerAdapter y un ViewHolder.

//once it has been created, we can call it from the main activity
class miAdaptador : RecyclerView.Adapter<miAdaptador.ViewHolder>() {

    //traigo los datos que voy a mostrar
    val titles = arrayOf("David", "Patricio", "Ramon", "Luis","David", "Patricio", "Ramon", "Luis")
    val details = arrayOf("coder", "waiter", "unemployed", "driver", "coder", "waiter", "unemployed", "driver")
    val images = intArrayOf(R.drawable.cara, R.drawable.adulto
    , R.drawable.adulto2, R.drawable.joven, R.drawable.cara, R.drawable.adulto
            , R.drawable.adulto2, R.drawable.joven)


     class ViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {
        //creo variables sin inicializar
         var itemImage : ImageView
        var itemTitle : TextView
        var itemDetail : TextView


         init {
             //execute code whenever an object is created from a class, 
             //cuando el objeto se crea, se ejecuta el constructor, y entonces podemos acceder a las variables
            itemImage = itemView.image
             itemTitle= itemView.txt_title
             itemDetail =itemView.txt_detail
             itemView.setOnClickListener{
        Toast.makeText(itemView.context, "has pulsado en la fila ",Toast.LENGTH_LONG).show()
             }
         }


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//esta f devolverá la clase q he creado

        //le indico la vista creada que va a rellenar
        val layoutInflater = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)  //necesitamos el contexto
        return ViewHolder(layoutInflater)  //le paso el layout inflater creado en la fila de antes.
    }

    override fun getItemCount(): Int {
        return titles.size   //tantas filas como el tamaño del array
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //se encarga de coger cada una de las posiciones de los array  y pasarlas a la clase ViewHolder para que esta pinte todos los valores.
       //asigna en cada celda de datos, los datos del array que va a mostrar
        holder.itemImage.setImageResource(images[position])
        holder.itemDetail.text = details[position]
        holder.itemTitle.text =  titles[position]


    }


}