package com.akbarrahmatm.a2112500851_intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_implicit : Button = findViewById(R.id.implicit_intent)
        val btn_explicit : Button = findViewById(R.id.explicit_intent)

        btn_explicit.setOnClickListener{
            intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        btn_implicit.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://student.budiluhur.ac.id"))
            startActivity(intent)
        }

    }
}