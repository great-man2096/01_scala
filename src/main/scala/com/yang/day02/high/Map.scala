package com.yang.day02.high

object Map {
  def main(args: Array[String]): Unit = {
    val arr = Array(3, 4, 5, 6, 1, 2)
    val f = map(arr,x=>x*x)
    Foreach.foreach(f,println)
  }
  def map(arr:Array[Int],op:Int=>Int)={
    for (elem <- arr)  yield op(elem)
  }
}
