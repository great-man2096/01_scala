package com.yang.day01

object VarValDemo1 {
  def main(args: Array[String]): Unit = {
    //定义变量
    var a: Int = 10
    a = 20
    println(a)
    //定义常量
    val b:Int = 10
    println(b)
    //scala中尽量用常量，在声明时要赋值
    var c: Int = 10
    val ` ` =10
    println(` `)
  }
}
