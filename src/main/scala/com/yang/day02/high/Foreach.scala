package com.yang.day02.high

object Foreach {
  def main(args: Array[String]): Unit = {
    val arr1 = Array(30, 40, 50, 60, 10, 20)
   /* foreach(arr1, a => {
      println(a)
    })*/
    foreach(arr1,println)
  }

  def foreach(arr: Array[Int], op: Int => Unit) = {
    for (i<-arr){
      op(i)
    }
  }
}
