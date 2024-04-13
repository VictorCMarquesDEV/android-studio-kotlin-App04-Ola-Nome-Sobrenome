package com.example.app04

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.app04.databinding.ActivityMainBinding

// App 04: Nome e Sobrenome, verificação de string vazia, span

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOla.setOnClickListener {
            val nome = binding.editNome.text.toString().trim()
            val sobrenome = binding.editSobrenome.text.toString().trim()

            if(nome.isEmpty() || sobrenome.isEmpty()){
                binding.textResultado.text = "Nome não inserido"
                Toast.makeText(applicationContext, "Nome não inserido", Toast.LENGTH_SHORT).show()
            } else {
                binding.textResultado.text = "Olá, $nome $sobrenome"
                Toast.makeText(applicationContext, "Olá, $nome $sobrenome", Toast.LENGTH_LONG).show()
            }
        }
    }
}