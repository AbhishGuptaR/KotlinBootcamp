package com.example.areacalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView


interface OneDimShape{
    val area:(Int) -> Int
}

interface TwoDimShape{
    val area:(Int,Int) -> Int
}

class Square: OneDimShape{
    override val area = {dim: Int -> dim * dim}
}

class Rectangle: TwoDimShape{
    override val area = {dim1: Int , dim2:Int -> dim1 * dim2}
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sqButton: Button = findViewById(R.id.squareButton)
        sqButton.setOnClickListener { square() }
        val recButton: Button = findViewById(R.id.rectangleButton)
        recButton.setOnClickListener { rectangle() }
    }

    private fun square(){
        val sqLayout : LinearLayout = findViewById(R.id.squareLinear)
        if(sqLayout.visibility == View.GONE){
            sqLayout.visibility = View.VISIBLE
        }else{
            sqLayout.visibility = View.GONE
        }
        val sqText: TextView = findViewById(R.id.areaofSquare)
        sqText.text = Html.fromHtml("length<sup>2</sup>")
        val sqCalc: Button = findViewById(R.id.squareCalculate)
        sqCalc.setOnClickListener { squareFinal()  }
        val sqButton: Button = findViewById(R.id.squareButton)
    }
     private fun squareFinal(){
         val sqValue: EditText = findViewById(R.id.squareLength)
         val sqOutput: TextView = findViewById(R.id.squareArea)
         val len : Int = sqValue.text.toString().toInt()
         val area = Square().area(len)
         sqOutput.text=area.toString()
     }

    private fun rectangle(){
        val recLayout : LinearLayout = findViewById(R.id.rectangleLinear)
        if(recLayout.visibility == View.GONE){
            recLayout.visibility = View.VISIBLE
        }else{
            recLayout.visibility = View.GONE
        }
        val recText: TextView = findViewById(R.id.areaofRectangle)
        recText.text = Html.fromHtml("length * breadth")
        val recCalc: Button = findViewById(R.id.rectangleCalculate)
        recCalc.setOnClickListener { rectangleFinal()  }
    }
    private fun rectangleFinal(){
        val recLength: EditText = findViewById(R.id.rectangleLength)
        val recBreadth: EditText = findViewById(R.id.rectangleBreadth)
        val recOutput: TextView = findViewById(R.id.rectangleArea)
        val len : Int = recLength.text.toString().toInt()
        val br: Int = recBreadth.text.toString().toInt()
        val area = Rectangle().area(len,br)
        recOutput.text=area.toString()
    }

}


