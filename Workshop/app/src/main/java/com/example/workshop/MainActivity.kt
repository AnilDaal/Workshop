package com.example.workshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
     fun replaceFrag(fragment: Fragment){
        val fragManager = supportFragmentManager
        val fragTrans = fragManager.beginTransaction()
        fragTrans.replace(R.id.container,fragment)
        fragTrans.commit()
    }
}