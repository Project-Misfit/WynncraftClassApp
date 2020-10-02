package com.example.timefighter.wynncraftclassapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var archerButton: ImageButton
    private lateinit var assassinButton: ImageButton
    private lateinit var mageButton: ImageButton
    private lateinit var shamanButton: ImageButton
    private lateinit var warriorButton: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        archerButton=findViewById(R.id.archerButton)
        assassinButton=findViewById(R.id.asssassinButton)
        mageButton=findViewById(R.id.mageButton)
        shamanButton=findViewById(R.id.shamanButton)
        warriorButton=findViewById(R.id.warriorButton)

        archerButton.setOnClickListener{
            val intent= Intent( this,FirstActivity::class.java)
            startActivity(intent)
        }

        assassinButton.setOnClickListener{
            val intent= Intent( this,SecondActivity::class.java)
            startActivity(intent)
        }

        mageButton.setOnClickListener {
            val intent= Intent( this,ThirdActivity::class.java)
            startActivity(intent)
        }

        shamanButton.setOnClickListener {
            val intent= Intent( this,FourthActivity::class.java)
            startActivity(intent)
        }

        warriorButton.setOnClickListener {
            val intent= Intent( this,FifthActivity::class.java)
            startActivity(intent)
        }
    }
}