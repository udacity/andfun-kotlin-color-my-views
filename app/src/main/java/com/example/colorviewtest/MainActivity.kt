package com.example.colorviewtest

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textview_one.setOnClickListener {
            makeColored(it)
        }
        textview_two.setOnClickListener {
            makeColored(it)
        }
        textview_three.setOnClickListener {
            makeColored(it)
        }
        textview_four.setOnClickListener {
            makeColored(it)
        }
        textview_five.setOnClickListener {
            makeColored(it)
        }
        button_one.setOnClickListener {
            makeColored(it)
        }
        button_two.setOnClickListener {
            makeColored(it)
        }
        button_three.setOnClickListener {
            makeColored(it)
        }
    }

    /**
     * Sets the background color of a view depending on it's resource id.
     * This is a way of using one click handler to do similar operations on a group of views.
     *
     * Demonstrates three different ways of setting colors.
     *     * Using a color constant from the Color class.
     *     * Using an Android color resource
     *     * Using a custom color defined in color.xml
     */
    fun makeColored(view: View) {
        when (view.id) {

        // Boxes using Color class colors for background
            R.id.textview_one -> view.setBackgroundColor(Color.BLUE)
            R.id.textview_two -> view.setBackgroundColor(Color.GRAY)

        // Boxes using Android color resources for background
            R.id.textview_three -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.textview_four -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.textview_five -> view.setBackgroundResource(android.R.color.holo_orange_light)

        // Buttons using custom colors for background
            R.id.button_one -> textview_three.setBackgroundResource(R.color.myRed)
            R.id.button_three -> textview_four.setBackgroundResource(R.color.myYellow)
            R.id.button_two -> textview_five.setBackgroundResource(R.color.myGreen)

            else -> view.setBackgroundColor(Color.DKGRAY)
        }
    }
}