package com.example.assignment12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class signUp : AppCompatActivity() {

    lateinit var etName:EditText
    lateinit var spGender:Spinner
    lateinit var etemail:EditText
    lateinit var etPhone: EditText
    lateinit var etPassword: EditText
    lateinit var btnSignUp:Button
    lateinit var btnLogIn:Button
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        setContexts()
        eventListener()

    }
    fun setContexts(){
        etName = findViewById(R.id.etName)
        spGender = findViewById(R.id.spGender)
        etemail = findViewById(R.id.etemail)
        etPhone = findViewById(R.id.etPhoneNumber)
        etPassword = findViewById(R.id.etpassword)
        btnSignUp = findViewById(R.id.btnsignUp)
        btnLogIn = findViewById(R.id.btnlogIn)
        val genders = arrayOf("Male", "Female","Binary","Other")
        var adapter = ArrayAdapter<String>(baseContext,android.R.layout.simple_spinner_item, genders)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spGender.adapter = adapter
    }
    fun eventListener(){
        btnSignUp.setOnClickListener {
            var name = etName.text.toString()
            var gender = spGender.selectedItem.toString()
            var email = etemail.text.toString()
            var phone = etPhone.text.toString()
            var password = etPassword.text.toString()
            var user = User(name,gender, email,phone,password)
            var message = "You are now a member"
            Toast.makeText(baseContext, user.toString(), Toast.LENGTH_LONG).show()
//            Toast.makeText(baseContext, message.toString(), Toast.LENGTH_LONG).show()
        }
        btnLogIn.setOnClickListener {
            var intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
data class  User(
    var name:String,
    var gender:String,
    var email:String,
    var phone:String,
    var password:String)