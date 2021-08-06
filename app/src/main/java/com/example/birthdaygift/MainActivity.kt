package com.example.birthdaygift

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun CreatCard(view: View) {
        var Naam = findViewById<EditText>(R.id.nameTxt)
        val msgPass = Naam.text.toString()
        val intent = Intent(this,CardActivity::class.java)
        intent.putExtra(CardActivity.NAME_EXTRA,msgPass)
        startActivity(intent)
//       var Naam = findViewById(R.id.nameTxt) as EditText
//
//        Toast.makeText(this,"name is $Naam",Toast.LENGTH_LONG).show()

    }
}