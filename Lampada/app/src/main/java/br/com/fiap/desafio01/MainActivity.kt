package br.com.fiap.desafio01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Método sem criar 3 funções sendo uma função para cada botão - INICIO
    fun cliqueBotao(view: View){
        when (view.id){
            R.id.btn1 -> img.setImageResource(R.drawable.p1)
            R.id.btn2 -> img.setImageResource(R.drawable.p3)
            R.id.btn3 -> img.setImageResource(R.drawable.p4)
        }
    }
    //Método sem criar 3 funções sendo uma função para cada botão - FIM

    //Método com 1 função para cada botão - INICIO
//    fun acenderBotao(view: View) {
//        img.setImageResource(R.drawable.p1)
//    }
//
//    fun apagarBotao(view: View) {
//        img.setImageResource(R.drawable.p3)
//    }
//
//    fun quebrarBotao(view: View) {
//        img.setImageResource(R.drawable.p4)
//    }
    //Método com 1 função para cada botão - FIM

}