package com.example.colormyviews

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun setListeners(){
        val boxOne : TextView = findViewById(R.id.box_one)
        val boxTwo : TextView = findViewById(R.id.box_two)
        val boxThree : TextView = findViewById(R.id.box_three)
        val boxFour : TextView = findViewById(R.id.box_four)
        val boxFive : TextView = findViewById(R.id.box_five)
        val constrainedLayout: View = findViewById(R.id.constraintlayout)
        val redButton = findViewById<TextView>(R.id.red_button)
        val greenButton = findViewById<TextView>(R.id.green_button)
        val yellowButton = findViewById<TextView>(R.id.yellow_button)

        val clickableViews: List<View> = listOf(boxOne,boxTwo,boxThree,boxFour,boxFive,constrainedLayout,redButton,greenButton,yellowButton)
        for (item in clickableViews){
            item.setOnClickListener { makeColored(it) }
        }
    }
    @SuppressLint("ResourceAsColor")
    private fun makeColored(view: View){
        when(view.id){
            R.id.box_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five -> view.setBackgroundColor(Color.BLUE)
            R.id.red_button -> box_three.setBackgroundColor(R.color.my_red)
            R.id.green_button -> box_four.setBackgroundColor(R.color.my_green)
            R.id.yellow_button -> box_five.setBackgroundColor(R.color.my_yellow)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}