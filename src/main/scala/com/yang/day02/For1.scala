package com.yang.day02

object For1 {
  def main(args: Array[String]): Unit = {
    val a="abcde"
    for(c<-a){
      println(c)
    }
    val i = 1 to 100
    for(d<-i){
      println(d)
    }

    for (elem <- 1 to(100, 2)) {
      println(elem)
    }
    for (elem2 <- 1 to 100 by 2) {
      println(elem2)
    }
    for (elem <- 100 to 1 by -1) {
      println(elem)
    }
  }
}
