package com.yang.day02.high


object Filter {
  def main(args: Array[String]): Unit = {
    val arr1 = Array(3, 4, 5, 6, 1, 2)
    val ints = filter(arr1, _ % 2 == 0)
    val ints1 = filter(arr1, _ > 3)
    Foreach.foreach(ints,println)
    print("===================================")
    println()
    Foreach.foreach(ints1,println)
  }
  def filter(arr:Array[Int],op:Int=>Boolean)={
    for (i<-arr if op(i)) yield i
  }
}
