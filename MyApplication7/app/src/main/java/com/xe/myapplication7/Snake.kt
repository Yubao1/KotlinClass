package com.xe.myapplication7

/**
 * Created by Administrator on 2021/3/7.
 */
sealed class Snake {
    class WaterSnake(): Snake()
    class GrassSnake(): Snake()
    fun sayName() {
        var s:String = "我是" + this.javaClass.name
        println(s)
    }
}