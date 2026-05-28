package com.example.examen2drhr

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var tvMessage: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        tvMessage = findViewById(R.id.tvMessage)

        btnLogin.setOnClickListener {
            val user = etUsername.text.toString().trim()
            val pass = etPassword.text.toString().trim()

            when {
                user.isEmpty() || pass.isEmpty() -> {
                    tvMessage.text = "Por favor, llena todos los campos."
                }
                user == "admin" && pass == "1234" -> {
                    tvMessage.text = "Bienvenido $user!"
                }
                else -> {
                    tvMessage.text = "Credenciales incorrectas, intenta de nuevo."
                }
            }
        }

        btnLogin.setOnClickListener {
            val user = etUsername.text.toString().trim()
            val pass = etPassword.text.toString().trim()

            when {
                user.isEmpty() || pass.isEmpty() -> {
                    tvMessage.text = "Por favor, llena todos los campos."
                }
                user == "admin" && pass == "1234" -> {
                    tvMessage.text = "Bienvenido $user!"
                }
                else -> {
                    tvMessage.text = "Credenciales incorrectas, intenta de nuevo."
                }
            }
        }
    }
}
