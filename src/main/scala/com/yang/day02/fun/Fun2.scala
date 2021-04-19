package com.yang.day02.fun

object Fun2 {
  def main(args: Array[String]): Unit = {
    println(add(c=1,a=30))
    println(add(c = 100, a = 10, b = 20))

  }
  def add(a:Int,b:Int=3,c:Int)=a + b + c

}
