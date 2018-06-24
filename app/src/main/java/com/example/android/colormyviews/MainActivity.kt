package com.example.android.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (child in 0 until parentConstraintLayout.childCount) {
            addOnClickListener(parentConstraintLayout.getChildAt(child))
        }
    }

    /**
     * Adds onClickListener to each view in layout hierarchy
     */
    fun addOnClickListener(view: View) {
        view.setOnClickListener {
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
            R.id.boxOneText -> view.setBackgroundColor(Color.BLUE)
            R.id.boxTwoText -> view.setBackgroundColor(Color.GRAY)

        // Boxes using Android color resources for background
            R.id.boxThreeText -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.boxFourText -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.boxFiveText -> view.setBackgroundResource(android.R.color.holo_orange_light)

        // Buttons using custom colors for background
            R.id.redButton -> boxThreeText.setBackgroundResource(R.color.colorMyRed)
            R.id.yellowButton -> boxFourText.setBackgroundResource(R.color.colorMyYellow)
            R.id.greenButton -> boxFiveText.setBackgroundResource(R.color.colorMyGreen)

            else -> view.setBackgroundColor(Color.DKGRAY)
        }
    }
}