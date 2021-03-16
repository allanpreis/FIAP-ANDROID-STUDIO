package br.com.fiap.desafio02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSomar.setOnClickListener{view: View? ->
            if(txtValor1.text.trim().isEmpty() && txtValor2.text.trim().isEmpty()){
                Toast.makeText(this,"Informe um número para somar.", Toast.LENGTH_LONG).show()
            } else{
                var valor1 = txtValor1.text.toString().toInt()
                var valor2 = txtValor2.text.toString().toInt()

                var resultado : Int = valor1 + valor2
                var mensagem = "${resultado}"
                Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show()
            }

        }
    }
}