package br.com.fiap.checkpoint01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculadora.setOnClickListener{view: View? ->
            val intentCalculadora = Intent(this, Calculadora::class.java)
            startActivity(intentCalculadora)
        }

        btnConta.setOnClickListener{view: View? ->
            val intentConta = Intent(this, PlanoConta::class.java)
            startActivity(intentConta)
        }

        btnDev.setOnClickListener{view: View? ->
            val builder = AlertDialog.Builder(this)
            builder
                .setTitle("Desenvolvedores da Aplicação")
                .setMessage("Allan Phyllyp Reis (RM85619)\n" +
                        "Dihogo Cassimiro Teixeira (RM84082)\n" +
                        "Fernando Borgatto Bouman (RM85833)")
                .setPositiveButton("OK", null)
            builder.create().show()
        }
    }
}