package com.yang.day01

object String_2 {
  def main(args: Array[String]): Unit = {
    val s=
      """
        |adgfasdfg
        |asdrgadfg
        |埃斯佩哦房管局阿斯蒂芬
        |太强了吧
        |""".stripMargin
    println(s)
    var date="2021-04-18"
    val sql=
      s"""
        |select
        |*
        |from gmall
        |where date='$date'
        |""".stripMargin
    println(sql)
  }
}
