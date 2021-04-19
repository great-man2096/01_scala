package com.yang.day02.high

object Reduce {
  def main(args: Array[String]): Unit = {
    val arr = Array(3, 4, 5, 6, 1, 2)
    println(reduce(arr, _ * _))
  }
  def reduce(arr:Array[Int],op:(Int,Int)=>Int)={
    var x=arr(0)
    for (elem <- 1 until arr.length){
      x=op(x,arr(elem))
    }
    x
  }
}
