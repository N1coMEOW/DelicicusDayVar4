package com.example.ariant4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lkabinet)
    }
    fun next(view: View)
    {
        val intent = Intent(this@MainActivity4, MainActivity3::class.java)
        startActivity(intent)
    }
    fun next1(view: View)
    {
        val intent = Intent(this@MainActivity4, MainActivity2::class.java)
        startActivity(intent)
    }
}