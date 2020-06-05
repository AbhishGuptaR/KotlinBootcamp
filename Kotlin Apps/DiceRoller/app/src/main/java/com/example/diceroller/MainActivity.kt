package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar

lateinit var diceImage: ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.diceImage)
        val rollButton: Button = findViewById(R.id.rollButton)
        rollButton.setOnClickListener { rollDice() }
        val countUP: Button = findViewById(R.id.countUpButton)
        countUP.setOnClickListener { countUP() }
        val resetButton: Button = findViewById(R.id.resetButton)
        resetButton.setOnClickListener { reset() }
    }
    private fun rollDice(){
        val numberText: TextView = findViewById(R.id.mainText)
        val randomInt = (1..6).random()
        numberText.text=randomInt.toString()
        diceImage(randomInt)
        Toast.makeText(this,"Dice Rolled",Toast.LENGTH_SHORT).show()
    }
    private fun countUP(){
        val numberText: TextView = findViewById(R.id.mainText)
        if(numberText.text.toString() == "Roll Dice!"){
            numberText.text = "1"
            diceImage(1)
        }
        else{
            var countUpNumber = numberText.text.toString().toInt()
            if(countUpNumber< 6)
            countUpNumber++
            diceImage(countUpNumber)
            numberText.text = countUpNumber.toString()
        }
    }
    private fun reset(){
        val numberText: TextView = findViewById(R.id.mainText)
        numberText.text="0"
        diceImage(0)
    }
    private fun diceImage(number: Int){
        val drawableResource = when(number){
            0 -> R.drawable.empty_dice
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }
}