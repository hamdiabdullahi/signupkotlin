package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import com.google.android.material.textfield.TextInputEditText

class SignupActivity : AppCompatActivity() {
    lateinit var etName: TextInputEditText
    lateinit var etPhoneNumber: TextInputEditText
    lateinit var etEmail: TextInputEditText
    lateinit var etPassword:TextInputEditText
    lateinit var btnb:Button
    lateinit var spGender:Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        sigup()
        onClick()
    }
    fun sigup(){
        etName=findViewById(R.id.etName)
        etPhoneNumber=findViewById(R.id.etPhoneNumber)
        etEmail=findViewById(R.id.etEmail)
        etPassword=findViewById(R.id.etPassword)
        btnb=findViewById(R.id.btnb)
        spGender=findViewById(R.id.spGender)
        var Gender= arrayOf("Male","Female","Other")
        var GenderAdapter=ArrayAdapter(baseContext,android.R.layout.simple_spinner_item,Gender)
        GenderAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spGender.adapter=GenderAdapter
    }
   fun onClick(){
        btnb.setOnClickListener{
            var BACK=Intent(baseContext,MainActivity::class.java)
            startActivity(BACK)
        }
    }
}