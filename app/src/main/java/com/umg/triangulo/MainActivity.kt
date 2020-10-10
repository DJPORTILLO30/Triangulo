package com.umg.triangulo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    private var bt : Button? = null
    private var A : TextView? = null
    private var B : TextView? = null
    private var hipotenusa : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt = findViewById(R.id.button2) as Button
        A = findViewById(R.id.LadoA) as TextView
        B = findViewById(R.id.LadoB) as TextView
        hipotenusa = findViewById(R.id.Hipotenusa) as TextView

    }

    fun calcular(view : View){
        val la = A?.text.toString().toDouble()
        val lb = B?.text.toString().toDouble()
       val aux = la.plus(lb)
        val hip = sqrt(aux)
        Hipotenusa.setText(hip.toString())

    }

}