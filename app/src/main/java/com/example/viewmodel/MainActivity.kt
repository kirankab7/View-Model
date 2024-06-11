package com.example.viewmodel

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // view model instance
        var viewModel = ViewModelProvider(this).get(SimpleViewModel::class.java)

        // setting text view
        binding.textView.text = viewModel.number.toString()

        //handling button click event
        binding.button.setOnClickListener {
            viewModel.addOne()
            binding.textView.text = viewModel.number.toString()
        }
    }
}