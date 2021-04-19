package com.yang.day02.high

object Closure {
  def main(args: Array[String]): Unit = {
    val f = foo()
    val r = f(10)
    println(r)
  }
//闭包
  def foo() = {
    var a = 10
    (b: Int) => a + b
  }
}
