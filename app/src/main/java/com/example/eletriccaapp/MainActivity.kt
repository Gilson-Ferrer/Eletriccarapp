package com.example.eletriccaapp

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.eletriccaapp.data.carFactory
import com.example.eletriccaapp.domain.Carro
import com.example.eletriccaapp.presentation.adapter.CarAdapter
import com.example.eletriccaapp.presentation.calcularAutonomiaActivity
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    lateinit var btnCalcular : Button
    lateinit var listaCarros: RecyclerView
    lateinit var tabLayout : TabLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView()
        setupListeners()
        setupList()


    }

    fun setContentView(){
        tabLayout = findViewById(R.id.tb_layout)
        btnCalcular = findViewById(R.id.btn_redirect)
        listaCarros = findViewById(R.id.rv_lista_carros)

    }

    fun setupList(){

        val adapter = CarAdapter(carFactory.list)
        listaCarros.adapter = adapter

    }

    fun setupListeners(){
        btnCalcular.setOnClickListener{
        startActivity(Intent(this, calcularAutonomiaActivity::class.java))


        }
    }

}




