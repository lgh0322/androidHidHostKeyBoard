package com.example.androidkeyboard
import com.example.androidkeyboard.R


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val keyboardStatusDetector=
        KeyboardStatusDetector()
        keyboardStatusDetector.keyboardVisible=false
        keyboardStatusDetector.registerActivity(this)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        Log.e("fuck",keyCode.toString())
        return super.onKeyDown(keyCode, event)
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        Log.e("fuck2",keyCode.toString())
        return super.onKeyUp(keyCode, event)
    }


}