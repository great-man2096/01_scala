package com.yang.day01

import java.util.Scanner

import scala.io.StdIn

object Input {
  def main(args: Array[String]): Unit = {
/*    val scanner = new Scanner(System.in)
    println(scanner.nextLine())*/

    val line = StdIn.readLine("请输入账号：")
    println(line)
  }
}
