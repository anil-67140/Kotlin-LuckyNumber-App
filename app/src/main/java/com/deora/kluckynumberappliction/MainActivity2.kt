package com.deora.kluckynumberappliction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val text1:TextView=findViewById(R.id.text1)
        val luckyTxT:TextView=findViewById(R.id.luckyNumTxt)
        val shareBtn:Button=findViewById(R.id.button)

        var user_name=receiveUserName()
        Toast.makeText(this, ""+user_name, Toast.LENGTH_SHORT).show()

        var random_num=generateRandomNum()
        luckyTxT.setText(""+random_num)
        shareBtn.setOnClickListener(){
            shareData(user_name,random_num)
        }


    }
    fun receiveUserName():String{
        var bundle:Bundle?=intent.extras
        var username= bundle?.get("name").toString()
        return username
    }
    fun generateRandomNum():Int{
        val random= Random.nextInt(1000)
        return random
    }

    fun shareData(username:String,num:Int){
        var i = Intent(Intent.ACTION_SEND)
        i.setType("text/plain")
        i.putExtra(Intent.EXTRA_SUBJECT,"$username is lucky today ")
        i.putExtra(Intent.EXTRA_TEXT,  "lucky number is $num")
        startActivity(i)
    }

}