package com.yang.day02.high

object High3 {
  def main(args: Array[String]): Unit = {
    val add1=add _
    val add2= (a:Int, b:Int)=>a+b
    add1(10,20)
    add2(10,20)
  }
  def add(a:Int,b:Int)=a+b
}
