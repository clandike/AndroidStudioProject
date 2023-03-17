package com.example.myfirstapp

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myfirstapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cat = MyAnimals("Knopa","Knopa the cat likes to eat", 1)
        val duck = MyAnimals("Jack", "Jack the duck likes to swim", 2)
        val dog = MyAnimals("Freddy","Freddy the dog likes to run", 3)

        with(binding) {

            name1.text = cat.name
            desc1.text = cat.desc

            name2.text = duck.name
            desc2.text = duck.desc

            name3.text = dog.name
            desc3.text = dog.desc

            val intent = Intent(this@MainActivity, SecondActivity::class.java)

            binding.button1.setOnClickListener {
                intent.putExtra(KEY_ANIMAL, cat)
                startActivity(intent)
                Toast.makeText(this@MainActivity, "Button pressed", Toast.LENGTH_SHORT).show()
            }

            binding.button2.setOnClickListener {
                intent.putExtra(KEY_ANIMAL, duck)
                startActivity(intent)
                Toast.makeText(this@MainActivity, "Button pressed", Toast.LENGTH_SHORT).show()
            }

            binding.button3.setOnClickListener {
                intent.putExtra(KEY_ANIMAL, dog)
                startActivity(intent)
                Toast.makeText(this@MainActivity, "Button pressed", Toast.LENGTH_SHORT).show()
            }
        }
    }
    companion object {

        const val KEY_ANIMAL = "key_animal"
    }
}


