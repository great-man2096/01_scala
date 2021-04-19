package com.yang.day02.loop

object For2 {
  def main(args: Array[String]): Unit = {
    for (elem <- 1 to 100 if elem%2==1 ) {
      println(elem)
    }
  }
}
