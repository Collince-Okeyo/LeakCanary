package com.ramgdeveloper.leakcanary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.graphics.drawable.Drawable

class MainActivity : AppCompatActivity() {

    private var myBackground: Drawable? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val textView = TextView(this)
        textView.text = "Memory leaks are not good to applications"
        if (myBackground == null) {
            myBackground = getDrawable(R.drawable.ic_launcher_background)
            //To avoid leak use the code below:
            //mBackground = getApplicationContext().getResources().getDrawable(R.drawable.ic_launcher_background);
        }
        textView.setBackgroundDrawable(myBackground)
        setContentView(textView)
    }
}

