package com.yang.day02.high

object High1 {
  def main(args: Array[String]): Unit = {
/*    val function = foo()
    function()*/
    foo(f _)
  }
/*  def foo() ={
    def f()={
      println("aaa")
    }
    f _
  }*/
  def foo(x:()=>Unit)={
    println(x)
    x()
  }
  def f()={
    println("aaa")
  }
}
