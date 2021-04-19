package com.yang.day02

object For1 {
  def main(args: Array[String]): Unit = {
    val a="abcde"
    for(c<-a){
      println(c)
    }
    val i = 1.to(100)
    for(d<-i){
      println(d)
    }
  }
}
