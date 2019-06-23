package com.androidmad.ktextensions

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_short.setOnClickListener({
            showShortToast("Show Short Toast using extensions method")
        })

        btn_long.setOnClickListener({
            showLongToast("Show Long Toast using extensions method")
        })

        btn_alert.setOnClickListener({
            showAlert("Android Extensions method", "Show Alert Dialog")
        })

    }

}
