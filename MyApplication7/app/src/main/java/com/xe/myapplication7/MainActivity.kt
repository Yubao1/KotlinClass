package com.xe.myapplication7

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by Administrator on 2021/3/7.
 */
class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test1()
        test2()
        test3()
        test4()
        test5()
        test6()
        test7()
        test8()
        test9()
    }

    /**
     * 测试印章类
     */
    fun test9() {
        var snake: Snake = Snake.GrassSnake()
        var snake2: Snake = Snake.WaterSnake()
        var list:List<Snake> = listOf(snake,snake2)
        for (snakes: Snake in list) {
            snakes.sayName()
        }
    }

    /**
     * 测试单例模式
     */
    fun test8() {

        /**
         * 这里因为定义了是单例模式的类，
         * 所以调用的时候只需要类名调用就可以了
         */
        Singleton.action()

        /**
         * 这里会报错，因为是单例模式，不能再实例化一个类对象了
         */
//        var singleton: Singleton = Singleton()
    }

    /**
     * 测试委托和代理
     */
    fun test7() {
        var company: Company = Singer()

        /**
         * 这里原本是 Singer 去实现函数，但是它使用了委托，
         * 所以由 SingerAssistant 代理去实现函数
         */
        company.sign()
    }

    /**
     * 测试多态
     */
    fun test6() {

        /**
         * 向上转型
         */
        var myInterface: MyInterface = MyInterfaceImplement()
        var myInterface2: MyInterface = MyInterfaceImplement2()
        var list: List<MyInterface> = listOf(myInterface,myInterface2)
        for (myInterface: MyInterface in list) {

            /**
             * 这里虽然是同一接口函数，但是却是 MyInterfaceImplement 和 MyInterfaceImplement2 函数具体的代码
             */
            myInterface.callback()
        }
    }

    /**
     * 测试接口
     */
    fun test5() {
        var myInterfaceImplement: MyInterfaceImplement = MyInterfaceImplement()
        myInterfaceImplement.callback()
    }


    /**
     * 测试抽象类
     */
    fun test4() {
        var son: Son = Son()
        son.study()
    }

    /**
     * 测试重写
     */
    fun test3() {
        var student: Student = Student("小二",21)

        /**
         * 这里调用的是 Student 本身的，而不是 Person 的
         */
        student.dream()
    }

    /**
     * 测试继承
     */
    fun test2() {
        var student: Student = Student("小二",21)
        student.eat()
    }


    /**
     * 测试封装
     */
    fun test1() {
        var printer: Printer = Printer()
        printer.printPaper()
    }
}