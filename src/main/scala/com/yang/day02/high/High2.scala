package com.yang.day02.high

object High2 {
  def main(args: Array[String]): Unit = {
    f(10)
    foo(10)
    val d: Int => Int = (a: Int) => a * a
    println(d(10))
  }
  //方法
  def foo(a:Int)=println(a)
  //函数
  def f = foo _
}
