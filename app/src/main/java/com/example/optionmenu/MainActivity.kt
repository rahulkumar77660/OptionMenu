package com.example.optionmenu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var background:LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        background= findViewById<LinearLayout>(R.id.back)as LinearLayout
        val toolbar= findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
      menuInflater.inflate(R.menu.menu,menu)
       return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item!!.itemId) {
            R.id.blueColor -> background.setBackgroundColor(Color.parseColor("#0000FF"))
            R.id.redColor -> background.setBackgroundColor(Color.parseColor("#FF0000"))
            R.id.greenColor -> background.setBackgroundColor(Color.parseColor("#00FF00"))
            R.id.clickme -> Toast.makeText(this@MainActivity,"shown always on the action bar",Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)

    }
}