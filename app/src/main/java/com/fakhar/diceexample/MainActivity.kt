package com.fakhar.diceexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
import kotlin.random.Random as Random1

class MainActivity : AppCompatActivity() {

    lateinit var ivDice : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivDice = image_view_dice
        ivDice.setOnClickListener(View.OnClickListener {
            rollDice()
        })
    }

    private fun rollDice() {

        var randomNumber : Int = Random.nextInt(6) + 1

        if(randomNumber == 1)
        {
            ivDice.setImageResource(R.drawable.dice1)
        }
        else if(randomNumber == 2)
        {
            ivDice.setImageResource(R.drawable.dice2)
        }

        else if(randomNumber == 3)
        {
            ivDice.setImageResource(R.drawable.dice3)
        }

        else if(randomNumber == 4)
        {
            ivDice.setImageResource(R.drawable.dice4)
        }

        else if(randomNumber == 5)
        {
            ivDice.setImageResource(R.drawable.dice5)
        }

        else if(randomNumber == 6)
        {
            ivDice.setImageResource(R.drawable.dice6)
        }
    }
}
