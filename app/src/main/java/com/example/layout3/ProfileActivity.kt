package com.example.layout3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layout3.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var viewBinding:ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val extras = intent.extras
        val data = extras!!["text"] as String //!!null이 아니라 무조건 넘어옴

        viewBinding.textView.text = data
    }
}