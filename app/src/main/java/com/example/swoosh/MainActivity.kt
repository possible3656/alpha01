package com.example.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
//import kotlinx.android.synthetic.main.activity_main.*
import  android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)


            getStarted.setOnClickListener {
                val leagueIntent = Intent(this,activity_league::class.java)
                startActivity(leagueIntent)
            }
            }

}
