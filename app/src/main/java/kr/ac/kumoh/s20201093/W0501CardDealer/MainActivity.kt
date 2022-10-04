package kr.ac.kumoh.s20201093.W0501CardDealer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20201093.W0501CardDealer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root) //이 상태에서는 하트3

        binding.card1.setImageResource(R.drawable.c_10_of_spades)
        //10스페이드로 변경됨
    }
}