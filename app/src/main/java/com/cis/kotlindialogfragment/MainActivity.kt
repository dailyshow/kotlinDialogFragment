package com.cis.kotlindialogfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener { view ->
            val dialog = DialogFragment()
            dialog.isCancelable = false
            dialog.show(supportFragmentManager, "tag")
        }
    }
}
