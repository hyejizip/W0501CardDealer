package kr.ac.kumoh.s20201093.W0501CardDealer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kr.ac.kumoh.s20201093.W0501CardDealer.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root) //이 상태에서는 하트3

        //binding.card1.setImageResource(R.drawable.c_10_of_spades)
        //10스페이드로 변경됨

        getCardName(29)

        binding.card1.setImageResource(R.drawable.c_10_of_spades)
    }
    private fun getCardName(c: Int) : String {
        //int 하나 받고, 리턴값 String
        Log.i("getCardName() : ", c.toString())
        val shape = when (c/13){
            0 -> "spades"
            1 -> "diamonds"
            2 -> "hearts"
            3 -> "clubs"
            else -> "error"
        }
        Log.i("getCardName() : ", shape)

        val number = when (c % 13) {
            in 1..9 ->(c % 13 + 1).toString()
            else -> "error"
        }
        Log.i("getCardName() : ", number)

        return "c_ace_od_spades"
    }
}