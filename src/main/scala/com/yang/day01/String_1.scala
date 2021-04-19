package com.yang.day01

object String_1 {

  def main(args: Array[String]): Unit = {
    val a = 20
    val b="hhh"
    printf("整数 %d\n",a)
    printf("字符串 %s\n",b)
    printf("浮点数 %.2f\n",math.Pi)
    val s=s"a = ${a*3},b = $b"
    println(s)
    val d=raw"\n"
    println(d)
  }

}
