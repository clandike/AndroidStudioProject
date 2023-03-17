package com.example.myfirstapp

import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            val animal = intent.getParcelableExtra<MyAnimals>(MainActivity.KEY_ANIMAL)

            if(animal?.name == "Freddy")
            {
                textView.text = "This is Freddy. He is friendly and likes to play ball. Freddie also really likes to beat forwards. He is the best at this among other dogs. "
                image1.visibility = android.view.View.VISIBLE
            }
            else if(animal?.name == "Knopa")
            {
                textView.text = "This is Knopa. She is a very lazy cat. I think she is a pro among other cats at being lazy. Her two favorite things are playing with a ball and sleeping. She probably sleeps all day"
                image2.visibility = android.view.View.VISIBLE
            }
            else if(animal?.name == "Jack")
            {
                textView.text = "This is Jack. He is very playful. Jack really likes to swim in water bodies. In fact, he is a very good swimmer and has his own pond."
                image3.visibility = android.view.View.VISIBLE
            }
            //val figure = intent.getParcelableExtra<Figure>(MainActivity.KEY_FIGURE)

            //val text1 = intent.getStringExtra(MainActivity.KEY_TEXT1)
            //binding.textView.text = figure?.name.toString()
        }
    }
}