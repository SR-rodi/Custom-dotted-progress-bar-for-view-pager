package com.example.dottedprogressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.dottedprogressbar.databinding.ActivityMainBinding
import com.example.dottedprogressbar.view.mediator.ProgressBarLayoutMediator

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    private val list = listOf("Один","Два","Три","Четыре")

    private val adapter by lazy { TestAdapter(list) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(LayoutInflater.from(applicationContext))

        binding.pager.adapter = adapter
        ProgressBarLayoutMediator(binding.progressBar,binding.pager).attach()

        setContentView(binding.root)
    }
}