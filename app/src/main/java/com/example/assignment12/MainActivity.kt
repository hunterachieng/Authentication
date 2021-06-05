package com.example.assignment12

import android.content.Intent
import android.net.MailTo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var etEmail:EditText
    lateinit var  etPassword:EditText
    lateinit var btnLogIn:Button
    lateinit var  btnSignUp:Button
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         setContext()
        clickListeners()

    }
    fun setContext (){
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        btnLogIn = findViewById(R.id.btnLogIn)
        btnSignUp = findViewById(R.id.btnSignUp)
    }
    fun clickListeners(){
        btnLogIn.setOnClickListener {
            var message = "Welcome"
            Toast.makeText(baseContext, message.toString(), Toast.LENGTH_LONG).show()
        }

        btnSignUp.setOnClickListener {
            var intent = Intent(baseContext,signUp::class.java)
            startActivity(intent)
        }
    }

}
