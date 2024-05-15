package com.deora.kluckynumberappliction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1: Button =findViewById(R.id.btn)
        val txt: TextView=findViewById(R.id.textView)
        val editTxt:EditText=findViewById(R.id.edit_Text)

        b1.setOnClickListener() {
            var username = editTxt.text
            //Explicit Intents
            var i: Intent = Intent(this, MainActivity2::class.java)
            //passing the user Name
            i.putExtra("name", username)
            startActivity(i)


        }}


    }
