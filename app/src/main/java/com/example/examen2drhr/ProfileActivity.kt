package com.example.examen2drhr

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    private lateinit var etName: EditText
    private lateinit var etEmail: EditText
    private lateinit var btnSaveProfile: Button
    private lateinit var tvProfileMessage: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        etName = findViewById(R.id.etName)
        etEmail = findViewById(R.id.etEmail)
        btnSaveProfile = findViewById(R.id.btnSaveProfile)
        tvProfileMessage = findViewById(R.id.tvProfileMessage)

        btnSaveProfile.setOnClickListener {
            val name = etName.text.toString().trim()
            val email = etEmail.text.toString().trim()

            when {
                name.isEmpty() || email.isEmpty() -> {
                    tvProfileMessage.text = "Por favor, completa todos los campos."
                }
                else -> {
                    tvProfileMessage.text = "Perfil guardado: $name, $email"
                }
            }
        }
    }
}
