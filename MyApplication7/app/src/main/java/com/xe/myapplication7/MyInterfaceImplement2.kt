package com.xe.myapplication7

/**
 * Created by Administrator on 2021/3/7.
 */
class MyInterfaceImplement2: MyInterface {
    override fun callback() {
        var s: String = "我是 MyInterfaceImplement2 类对象，我实现了 MyInterface 接口的 callback 函数"
        println(s)
    }
}