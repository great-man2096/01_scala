package com.yang.day01

object IfDemo {

  def main(args: Array[String]): Unit = {
    val a = 10
    if(a %2 == 0){
      printf(s"$a 是偶数")
    }
    val m = 10
    val n = 20
    val max = if (m > n) m else n
    println(max)

    var x=10
    x=40
    println(x)


  }
}
