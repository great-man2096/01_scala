package com.yang.day02.high

object High4 {
  def main(args: Array[String]): Unit = {
    /*val a=()=>println("aaa")
    foo(a)*/
    foo(()=>{println("匿名函数")})
    xoo((a,b)=>a+b)
    xoo(_ + _)
    xoo(_ * _)
  }
  def foo(f:()=>Unit)={
    f()
  }
  def xoo(add:(Int,Int)=>Int)={
    println(add(10, 100))
  }
}
