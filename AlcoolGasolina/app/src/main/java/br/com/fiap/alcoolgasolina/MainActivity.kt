package br.com.fiap.alcoolgasolina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //================ Código sem o kotlinx - INICIO ================
//        var btnCalcular = findViewById<Button>(R.id.btnCalcular)
//
//        //Função que implementa o evento de clique do Botão
//        btnCalcular.setOnClickListener { view: View? ->
//            var txtAlcool = findViewById<EditText>(R.id.txtPrecoAlcool)
//            //Declaração implicita do tipo das variaveis
//            var precoAlcool = txtAlcool.text.toString().toDouble()
//            var txtGasolina = findViewById<EditText>(R.id.txtPrecoGasolina)
//            var precoGasolina = txtGasolina.text.toString().toDouble()
//
//            //Declaração explicita do tipo das variaveis
//            var resultado : Double = precoAlcool / precoGasolina
//            var mensagem = ""
//            if(resultado > 0.7){
//                mensagem = "Gasolina"
//            }else if (resultado < 0.7){
//                mensagem = "Álcool"
//            }else {
//                mensagem = "Indiferente"
//            }
//            Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show()
//        }
        //================ Código sem o kotlinx - FIM ================


        //================ Código com o kotlinx - INICIO ================
        //Função que implementa o evento de clique do Botão
//        btnCalcular.setOnClickListener { view: View? ->
//            //Declaração implicita do tipo das variaveis
//            var precoAlcool = txtPrecoAlcool.text.toString().toDouble()
//            var precoGasolina = txtPrecoGasolina.text.toString().toDouble()
//
//            //Declaração explicita do tipo das variaveis
//            var resultado : Double = precoAlcool / precoGasolina
//            var mensagem = ""
//            if(resultado > 0.7){
//                mensagem = "Gasolina"
//            }else if (resultado < 0.7){
//                mensagem = "Álcool"
//            }else {
//                mensagem = "Indiferente"
//            }
//            Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show()
//        }
        //================ Código com o kotlinx - FIM ================

        //================ Passando o resultado para próxima Activity - INICIO ================
        btnCalcular.setOnClickListener { view: View? ->
            //Declaração implicita do tipo das variaveis
            var precoAlcool = txtPrecoAlcool.text.toString().toDouble()
            var precoGasolina = txtPrecoGasolina.text.toString().toDouble()

            //Declaração explicita do tipo das variaveis
            var resultado : Double = precoAlcool / precoGasolina
            var mensagem = ""
            if(resultado > 0.7){
                mensagem = "Gasolina"
            }else if (resultado < 0.7){
                mensagem = "Álcool"
            }else {
                mensagem = "Indiferente"
            }
            //Instancia do objeto Intent apontando para a ResultadoActivity
            var intentResultado = Intent(this, ResultadoActivity::class.java)
            //Armazena pelo conjunto de chave-valor
            intentResultado.putExtra("msg", mensagem)
            //Disparo da Intent para carregar a nova tela (ResultadoActivity)
            startActivity(intentResultado)

        }
        //================ Passando o resultado para próxima Activity - FIM ================
    }
}