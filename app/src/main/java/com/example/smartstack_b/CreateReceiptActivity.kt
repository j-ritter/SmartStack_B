package com.example.smartstack_b

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View
import com.example.smartstack_b.databinding.ActivityCreateReceiptBinding

class CreateReceiptActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCreateReceiptBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateReceiptBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.createButton.setOnClickListener {
            createReceipt()
        }

        binding.cancelButton.setOnClickListener {
            finish()  // Close the activity
        }
    }

    private fun createReceipt() {
        // Logic to gather data from fields and create a receipt
        // This is a placeholder function
    }
}