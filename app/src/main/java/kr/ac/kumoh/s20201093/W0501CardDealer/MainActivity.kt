package kr.ac.kumoh.s20201093.W0501CardDealer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kr.ac.kumoh.s20201093.W0501CardDealer.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.btnDeal.setOnClickListener{
            val res = IntArray(5)
            for(i in 0 until res.size) {
                res[i] = resources.getIdentifier(
                    getCardName(Random.nextInt(52)), //string으로 찾음
                    "drawable",
                    packageName
                )
            }
            binding.card1.setImageResource(res[0]) //컴파일타입에 의해 결정
            binding.card2.setImageResource(res[1]) //세로에다 234 만들어놓고 가로에는 1밖에 없음
            binding.card3.setImageResource(res[2])
            binding.card4.setImageResource(res[3])
            binding.card5.setImageResource(res[4])
        }

        //binding.card1.setImageResource(R.drawable.c_10_of_spades)
        //10스페이드로 변경됨
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
            0 -> "ace" //나머지가 0일 때
            in 1..9 ->(c % 13 + 1).toString()
            10 -> "jack"
            11 -> "queen"
            12 -> "king"
            else -> "error"
        }
        Log.i("getCardName() : ", number)

        return "c_${number}_of_${shape}" //실시간으로 사용하는 거
    }
}