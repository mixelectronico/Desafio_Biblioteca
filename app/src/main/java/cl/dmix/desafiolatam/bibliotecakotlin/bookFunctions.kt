package cl.dmix.desafiolatam.bibliotecakotlin

import android.util.Log

fun LibrosEscolares.precioFormateado(price : Int):String{
    return "$ ${price.toString()}"
}

fun LibrosEscolares.imprimir(){
    Log.d("IMPRESORA", this.toString())
}