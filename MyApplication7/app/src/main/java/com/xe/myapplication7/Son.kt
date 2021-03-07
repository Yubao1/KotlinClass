package com.xe.myapplication7

/**
 * Created by Administrator on 2021/3/7.
 */
class Son: Father() {
    override fun study() {
        var s: String = "我是 Son ，我要学习"
        println(s)
    }
}