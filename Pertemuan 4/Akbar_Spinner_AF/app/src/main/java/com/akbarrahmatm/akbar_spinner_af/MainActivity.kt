package com.akbarrahmatm.akbar_spinner_af

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val spnakbar : Spinner = findViewById(R.id.spnakbar)
        val textspn : TextView = findViewById(R.id.txtspn)
        val imgspn : ImageView = findViewById(R.id.imgspn)

        var namahewan = arrayOf<String>("cat", "chicken", "cow", "horse", "sheep")
        var gambarhewan = arrayOf<Int>(R.drawable.cat, R.drawable.chicken, R.drawable.cow, R.drawable.horse, R.drawable.sheep)
        var suarahewan = arrayOf<Int>(R.raw.cat, R.raw.chicken, R.raw.cow, R.raw.horse, R.raw.sheep)
        val arrayAdapter : ArrayAdapter<*>

        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, namahewan)
        spnakbar.setAdapter(arrayAdapter)
        spnakbar.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                textspn.setText(namahewan[position])
                imgspn.setImageResource(gambarhewan[position])
                val suara : MediaPlayer = MediaPlayer.create(applicationContext, suarahewan[position])
                suara.start()
            }
        }
    }
}