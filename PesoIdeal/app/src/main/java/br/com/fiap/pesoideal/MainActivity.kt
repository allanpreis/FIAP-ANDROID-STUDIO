package br.com.fiap.pesoideal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnMsg.setOnClickListener{
            if (campoValido()){
                val altura = txtAltura.text.toString().toDouble()
                var peso : Double
                val dec = DecimalFormat("#.0")

                if (rbMasculino.isChecked){
                    peso = (72.7*altura) - 58
                }else {
                    peso = (62.1 * altura ) - 44.7
                }
                Toast.makeText(this,"Seu peso ideal é ${dec.format(peso)} kg", Toast.LENGTH_LONG).show()
           }
        }
    }

    fun campoValido() : Boolean{
        if (!(rbMasculino.isChecked || rbFemenino.isChecked) || txtAltura.text.trim().isEmpty()){
            Toast.makeText(this,"Preencha todos os campos", Toast.LENGTH_LONG).show()
            return false
        }
        return true
    }
}

