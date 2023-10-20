package com.example.eletriccaapp.data

import com.example.eletriccaapp.domain.Carro

object carFactory {
    val list = listOf<Carro>(
        Carro(
            id =1,
            preco = "275,000.00",
            bateria = "190 Kw/h",
            potencia = "250 cv",
            recarga = "32 min",
            urlPhoto = "www.google.com"),

        Carro(
            id =2,
            preco = "254,000.00",
            bateria = "260 Kw/h",
            potencia = "300 cv",
            recarga = "23 min",
            urlPhoto = "")
        ,

        Carro(
            id =2,
            preco = "122,000.00",
            bateria = "160 Kw/h",
            potencia = "200 cv",
            recarga = "45 min",
            urlPhoto = "www.google.com")
    )
}