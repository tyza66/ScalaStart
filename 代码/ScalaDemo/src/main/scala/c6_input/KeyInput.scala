package c6_input

import scala.io.StdIn

/**
 * Author: tyza66
 * Date: 2023/05/15 14:08
 * Github: https://github.com/tyza66
 **/
object KeyInput {
  def main(args: Array[String]): Unit = {
    println("请输入姓名")
    val name:String = StdIn.readLine()
    println("你是"+name)
    //输出的时候字符串模板如果没有歧义的话可以省略大括号
    println(s"名字是$name")
  }
}
