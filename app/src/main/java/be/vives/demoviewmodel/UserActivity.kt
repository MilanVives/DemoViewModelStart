package be.vives.demoviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import be.vives.demoviewmodel.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}