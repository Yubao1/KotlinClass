package com.xe.myapplication7

/**
 * Created by Administrator on 2021/3/7.
 */
class Printer {

    /**
     * 这里用 printSpeed 函数对打印速度进行封装，用 private 声明；
     * 不能随便由外部进行随意更改
     */
    private fun printSpeed(num: Int) {
        println("1分钟打印" + num + "张纸")
    }

    fun printPaper() {

        /**
         * 这里对象函数才能调用对象本身的 private 函数，
         * 外部不能调用对象的 private 方法
         */
        printSpeed(10)
    }
}