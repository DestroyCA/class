package com.practicum.a4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
    fun main() {

        class Herbivores constructor(val name: String, var weight: Int) {
        }

        val Zebra = Herbivores("Зебра", 340)
        val Giraffe = Herbivores("Жираф", 1100)

        val Herb = listOf(Zebra, Giraffe)

        for (element in Herb) {
            println("Травоядные: ${element.name}. Вес около ${element.weight} кг")
        }


        class Carnivores constructor(val name: String, var weight: Int) {
        }

        val Wolf = Carnivores("Волк", 90)
        val Bear = Carnivores("Медведь", 220)

        val Carn = listOf(Wolf, Bear)

        for (element in Carn) {
            println("Плотоядные: ${element.name}. Вес около ${element.weight} кг")

        }
    }