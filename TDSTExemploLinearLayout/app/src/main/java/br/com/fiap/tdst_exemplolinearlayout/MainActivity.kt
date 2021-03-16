package br.com.fiap.tdst_exemplolinearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cliqueBotao(view: View) {

        //Verifição seu o campo está sendo preenchido (validando a estrada inválida de  ".trim()") - INICIO
        if (txtNome.text.trim().isEmpty()){
            Toast.makeText(this,"Informe um nome.", Toast.LENGTH_LONG).show()
        //Verifição seu o campo está sendo preenchido (validando a estrada inválida de  ".trim()") - FIM
        }else{
            val msg = "Olá ${txtNome.text}"

            //Mensagem na tela sem alert
            //Toast.makeText(this, msg,Toast.LENGTH_LONG).show()

            //Mensagem utilizando o Alert
            exibirMensagem("Saudação", msg)
        }

    }

    //Mensagem utilizando o Alert - INICIO
    fun exibirMensagem(titulo: String, mensagem: String){
        val builder = AlertDialog.Builder(this)
        builder
            .setTitle(titulo)
            .setMessage(mensagem)
            .setPositiveButton("Ok", null)
        builder.create().show()
    }
    //Mensagem utilizando o Alert - FIM

}