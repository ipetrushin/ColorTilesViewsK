package com.example.colortilesviewsk

import android.R.attr.x
import android.R.attr.y
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

// тип для координат
data class Coord(val x: Int, val y: Int)
class MainActivity : AppCompatActivity() {

    lateinit var tiles: Array<Array<View>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //tiles = Array(4) { Array(4) { View(this) } }
        tiles = arrayOf(
            arrayOf(findViewById(R.id.t00), ),
            arrayOf(),
            arrayOf(),
            arrayOf()
        )
        // TODO: заполнить массив для всех тайлов

        // TODO: заполнить поле случайными цветами

    }

    fun getCoordFromString(s: String): Coord {
        // TODO: реализовать функцию, получающую из
        // строки вида "12" координаты Coord(1,2)
        // TODO: сообщать в лог координаты
        return Coord(0,0) // вернуть полученные координаты
    }
    fun changeColor(view: View) {
        val brightColor = resources.getColor(R.color.bright)
        val darkColor = resources.getColor(R.color.dark)
        val drawable = view.background as ColorDrawable
        if (drawable.color ==brightColor ) {
            view.setBackgroundColor(darkColor)
        } else {
            view.setBackgroundColor(brightColor)
        }
    }

    fun onClick(v: View) {
        val coord = getCoordFromString(v.getTag().toString())
        changeColor(v)

        for (i in 0..3) {
            changeColor(tiles[coord.x][i])
            changeColor(tiles[i][coord.y])
        }

        // TODO: проверить раскраску поля на предмет победы
    }

    fun checkVictory() {
        // TODO: проверка победы
    }

    fun initField() {
        // TODO: заполнение поля случайными плитками (тёмный/светлый)
    }


}