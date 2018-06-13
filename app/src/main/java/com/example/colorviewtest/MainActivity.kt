package com.example.colorviewtest

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
            R.id.box1 -> view.setBackgroundColor(Color.BLUE)
            R.id.box2 -> view.setBackgroundColor(Color.GRAY)

        // Boxes using Android color resources for background
            R.id.box3 -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box4 -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box5 -> view.setBackgroundResource(R.color.myGreen)

        // Buttons using custom colors for background
            R.id.button_red -> view.setBackgroundResource(R.color.myRed)
            R.id.button_yellow -> view.setBackgroundResource(R.color.myYellow)
            R.id.button_green -> view.setBackgroundResource(R.color.myGreen)

            else -> view.setBackgroundColor(Color.DKGRAY)
        }
    }
}
