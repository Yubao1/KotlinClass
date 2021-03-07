package com.xe.myapplication7

/**
 * 定义一个类，名叫 Person
 */
open class Person {

    /**
     * 定义一个 String 类型的属性 name
     */
    var name: String? = null

    /**
     * 定义一个 Int 类型的属性 age
     */
    var age: Int = 0
    constructor(name: String,age: Int) {
        this.name = name
        this.age = age
    }

    /**
     * 定义一个函数，名叫 eat
     */
    fun eat() {
        var s:String = "我叫" + name + "，今年" + age + "岁，现在正在吃饭"
        println(s)
    }

    open fun dream() {
        var s:String = "我叫" + name + "，今年" + age + "岁，我都梦想是让生活变得美好。"
        println(s)
    }

}