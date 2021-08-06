package com.example.birthdaygift

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CardActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA =  "Name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)

       val name = intent.getStringExtra(NAME_EXTRA)
        var bdayboy = findViewById<TextView>(R.id.bdayboy).apply {
            text = "Happy BirthDay\n $name"
        }


    }
}