package com.yang.day02.loop

object For4 {
  def main(args: Array[String]): Unit = {
    /*for(i<-1 to 9){
      for(j<-1 to i){
        print(s"$j * $i = ${j*i}\t")
      }
      println()
    }*/
   /* for(i<-1 to 9;j<-1 to i){
      print(s"$j * $i = ${j*i}\t")
      if(i==j) println()
    }*/
    //得到一个序列：1 4 9 16 ... 100*100
    val ints = for (elem <- 1 to 100) yield elem * elem
    println(ints)
    //"abcd" => "AaBbCcDd"
    val seq = for (c <- "abcd") yield c.toString.toUpperCase + c
    println(seq.mkString(""))
    println("abcd".map(a => a.toString.toUpperCase + a).mkString(""))
  }
}
