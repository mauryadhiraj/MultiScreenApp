package com.data.multiscreenapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val tvOrder=findViewById<TextView>(R.id.tvOrder)

        val orderOfCustomer=intent.getStringExtra(MainActivity.KEY)

        tvOrder.text="Order Placed: "+ (orderOfCustomer).toString()
    }
}