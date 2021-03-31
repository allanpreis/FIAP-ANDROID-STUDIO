package br.com.fiap.checkpoint01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calculadora.*
import java.text.DecimalFormat

class Calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        btnCalcular.setOnClickListener{
            val valor1 = Valor1.text.toString().toInt()
            val valor2 = Valor2.text.toString().toInt()
            var resultado : Int
            val dec = DecimalFormat("#.0")

            if (rdSoma.isChecked){
                resultado = valor1 + valor2
            }else if (rdSubtracao.isChecked){
                resultado = valor1 - valor2
            }else if (rdMultiplicacao.isChecked){
                resultado = valor1 * valor2
            }else {
                resultado = valor1 / valor2
            }

            Toast.makeText(this,"Resultado: ${resultado}", Toast.LENGTH_LONG).show()

        }

    }
}