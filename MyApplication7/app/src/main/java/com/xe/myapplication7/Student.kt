package com.xe.myapplication7

/**
 * Created by Administrator on 2021/3/7.
 */
class Student(name: String,age: Int): Person(name,age) {

    override fun dream() {
        var s:String = "我叫" + name + "，今年" + age + "岁，我都梦想是去做生意。"
        println(s)
    }

}