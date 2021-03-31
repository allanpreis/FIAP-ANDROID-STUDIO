package br.com.fiap.listatarefas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.text.FieldPosition

class MainActivity : AppCompatActivity() {

    //lista de tarefas
    var tarefas = ArrayList<String>()
    //adapter para o ListView
    var adapter : ArrayAdapter<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, tarefas)
        lstTarefas.adapter = adapter

        fab.setOnClickListener{
            adicionarTarefa()
        }

        lstTarefas.setOnItemClickListener{ parent, view, position, id ->
            var tarefa = parent.adapter.getItem(position).toString()
            atualizarTarefa(tarefa, position)
        }
    }

    fun adicionarTarefa(){

        //Cria um AlertDialog para o usuário inserir uma tarefa
        var builder = AlertDialog.Builder(this)
        builder.setTitle("Nova Tarefa")

        //Adiciona um EditText ao AlertDialog
        val entrada = EditText(this)
        builder.setView(entrada)
        //Tratamento para quando o botão "OK" for acionado
        builder.setPositiveButton("Ok"){dialog, which ->
            tarefas.add(entrada.text.toString())
            adapter?.notifyDataSetChanged()
        }
        builder.setNegativeButton("Cancel", null)
        builder.create().show()
    }

    fun atualizarTarefa(tarefa:String, position: Int){
        var builder = AlertDialog.Builder(this)
        builder.setTitle("Atualizar Tarefa")
        val entrada = EditText(this)
        entrada.setText(tarefa, TextView.BufferType.EDITABLE)
        builder.setView(entrada)

        //Tratamento botão OK
        builder.setPositiveButton("OK"){dialog, which ->
            tarefas[position] = entrada.text.toString()
            adapter?.notifyDataSetChanged()
        }
        builder.setNegativeButton("Cancel", null)

        //Tratamento botão excluir
        builder.setNeutralButton("Excluir"){dialog,which ->
            tarefas.removeAt(position)
            adapter?.notifyDataSetChanged()
        }
        builder.create().show()
    }
}