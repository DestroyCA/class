package com.practicum.a4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
fun main(args: Array<String>) {

    class Herbivores constructor(val name: String, var weight: Int) {
    }

        val Zebra = Herbivores("Зебра", 340)
        val Giraffe = Herbivores("Жираф", 1100)

    println("Животное: ${Zebra.name}, Вес: ${Zebra.weight}")
    println("Животное: ${Giraffe.name}, Вес: ${Giraffe.weight}")


    class Carnivores constructor(val name: String, var weight: Int) {
    }
        val Wolf = Carnivores("Волк", 90)
        val Bear = Carnivores("Медведь", 220)

    println("Животное: ${Wolf.name}, Вес: ${Wolf.weight}")
    println("Животное: ${Bear.name}, Вес: ${Bear.weight}")

}