package com.example.aboutmeapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.aboutmeapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("Abhishek Gupta")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.myName = myName
        //val doneButton: Button = binding.nickDone
        binding.nickDone.setOnClickListener { setNickname(it) }
        //val nicknameTextView: TextView = findViewById(R.id.nicknameTextView)
        binding.nicknameTextView.setOnClickListener{ updateNickname(it) }
    }
    private fun setNickname(view: View){
        //val nickName : EditText = findViewById(R.id.nickName)
        //val setName : TextView = findViewById(R.id.nicknameTextView)
        //binding.nicknameTextView.text = binding.nicknameTextView.text.toString()
        myName?.nickname = binding.nicknameTextView.text.toString()
        //val doneButton: Button = findViewById(R.id.nickDone)
        binding.nickName.visibility = View.GONE
        binding.nickDone.visibility = View.GONE
        binding.nicknameTextView.visibility = View.VISIBLE
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken,0)
    }
    private fun updateNickname(view: View){
        //val nickName : EditText = findViewById(R.id.nickName)
        //val doneButton: Button = findViewById(R.id.nickDone)
        //val setName : TextView = findViewById(R.id.nicknameTextView)
        binding.nickName.visibility = View.VISIBLE
        binding.nickDone.visibility = View.VISIBLE
        binding.nicknameTextView.visibility = View.GONE
        binding.nickName.requestFocus()
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(binding.nickName,0)
    }
}