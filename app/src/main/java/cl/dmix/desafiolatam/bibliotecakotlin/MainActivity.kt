package cl.dmix.desafiolatam.bibliotecakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var libro1 = LibrosEscolares("El rey David",
            123456789, 1991,
            "MixEditorial", 150,
            20000, "David Mix",false)
        var libro2 = LibrosEscolares("Clases de Kotlin",
            2345687891, 2020, "FuentesEditorial",
            85,8000, "Cristian",true)
        var libro3 = LibrosEscolares("Android instead of IOS",
            3456878912, 2010,
            "Los PRO", 10, 1000,"Anónimo", true)
        val libro4 = LibrosEscolares("Estructuras de datos y algoritmos en JAVA",
            456789123, 2000, "Java4Dummyes", 1500,
            80000, "Uncle Bob", false)

        libro1.imprimir()
        libro2.imprimir()
        libro3.imprimir()
        libro4.imprimir()
        
    }
}