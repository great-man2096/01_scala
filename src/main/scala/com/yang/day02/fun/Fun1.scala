package com.yang.day02.fun

object Fun1 {
  def main(args: Array[String]): Unit = {
    add(10, 20)
    foo
    foo("foo...")
    println(foo(2))
    println(isOdd(4))
  }
  def add(a: Int, b: Int) {
    println(a + b)
  }
  def foo = {
    println("foo...")
  }
  def foo(s:String) ={
    println(s)
  }
  def foo(a: Int) = {
    var b = a
    b += 1
    b
  }
  def isOdd(a: Int) = {
     if(a % 2 == 1){
         "是"
     }else{
         false
     }
 }
/*  def add(a:Int, b:Int): Unit  = {
    a + b
    ""
}*/
}
