package caiowilleman.com.github.helloworld

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity (){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //criando um objeto de texto

        val texto = TextView(this)
        texto.text = "BIEL DA O RABO GOSTA DE NOSE GRAB FDP GAY VAI A MERDA"
        setContentView(texto)
    }

}