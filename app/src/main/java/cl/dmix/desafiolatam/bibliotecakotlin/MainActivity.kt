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
        
    }
}