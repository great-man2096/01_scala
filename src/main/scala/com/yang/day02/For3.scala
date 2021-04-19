package com.yang.day02

import scala.io.StdIn
import scala.util.control.Breaks._

object For3 {
  def main(args: Array[String]): Unit = {
    val n = StdIn.readInt()
    var isPrime=true
    breakable{
      for(i <- 2 until n) {
        if (n % i == 0) {
          isPrime = false
          break
        }
      }
    }
    if(isPrime) {
      println(s"$n 是质数")
    }else{
      println(s"$n 不是质数")
    }

}}
