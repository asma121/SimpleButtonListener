package com.example.simplebuttonlistenerbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var button2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button=findViewById(R.id.button)
        button2=findViewById(R.id.button2)

        button.setOnClickListener{
            Toast.makeText(this,"Kotlin code",Toast.LENGTH_LONG).show()
        }
    }
    
    fun showTost(view :View) {
        Toast.makeText(this," XML ",Toast.LENGTH_LONG).show()
    }
}