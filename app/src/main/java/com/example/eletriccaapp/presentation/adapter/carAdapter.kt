package com.example.eletriccaapp.presentation.adapter

import android.view.LayoutInflater
import android.widget.TextView
import com.example.eletriccaapp.R
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.eletriccaapp.domain.Carro

class CarAdapter (private val carros: List<Carro>): RecyclerView.Adapter<ViewHolder>(){

    // cria uma nova view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.carro_item, parent, false)
        return ViewHolder(view)
    }


    //Pega o conteudo da view e troca pela informaçãode um item de uma lista

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.preco.text = carros[position].preco
        holder.bateria.text =carros[position].bateria
        holder.potencia.text = carros[position].potencia
        holder.recarga.text =carros[position].recarga
    }

// pega a quantidade de carros na lista

    override fun getItemCount(): Int = carros.size

}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view){
    val preco: TextView
    val bateria : TextView
    val potencia : TextView
    val recarga : TextView
    val favorito: ImageView
    init {

        view.apply {
            preco = findViewById(R.id.tv_preco_value)
            bateria = findViewById(R.id.tv_bateria_value)
            potencia = findViewById(R.id.tv_potencia_value)
            recarga = findViewById(R.id.tv_recarga_value)
            favorito = findViewById(R.id.iv_favorito)
        }

    }
}