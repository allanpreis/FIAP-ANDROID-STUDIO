package br.com.fiap.checkpoint01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_plano_conta.*

class PlanoConta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plano_conta)

        btnCalcularConta.setOnClickListener{view: View? ->
            var local = txtLocal.text.toString().toDouble() // 0.04/min
            var celular = txtCelular.text.toString().toDouble() //0.20/min
            var assinatura = txtAssinatura.text.toString().toDouble()

            var mensagemCelular : Double = celular*0.04
            var mensagemLocal : Double = local*0.20
            var total : Double = assinatura + mensagemCelular + mensagemLocal
            var mensagem = "Assinatura: " + "R$"+assinatura + "\nChamada Local: " + "R$"+mensagemCelular + "\nChamada Local: " + "R$"+mensagemLocal + "\n\nValor Total: " + "R$"+total

            //Instancia do objeto Intent apontando para a ResultadoActivity
            var intentResultado = Intent(this, Resultado::class.java)
            //Armazena pelo conjunto de chave-valor
            intentResultado.putExtra("msg", mensagem)
            //Disparo da Intent para carregar a nova tela (ResultadoActivity)
            startActivity(intentResultado)
        }
    }
}