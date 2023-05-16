package c10_liucheng

import scala.collection.immutable
import scala.language.postfixOps
import scala.util.control.Breaks

/**
 * Author: tyza66
 * Date: 2023/05/16 11:02
 * Github: https://github.com/tyza66
 **/
object Liucheng {
  def main(args: Array[String]): Unit = {
    //一般编程语言中的流程控制就是靠顺序、分支和循环这三种实现的
    //条件分支if和java中的几乎一样 scala也有if，if..else,和 else if
    //特殊的是scala中的if else分支结构也是有返回值的 返回值是每一个分支条件共同的父类
    var age: Int = 18
    val value: String = {
      if (age < 18) {
        "未成年"
      } else if (age < 40) {
        "老年人"
      } else {
        "死亡"
      }
    }
    val value1: Any = {
      if (age < 18) {
        "未成年"
      } else if (age < 40) {
        "老年人"
      } else {
        96
      }
    }
    println(value)

    //scala中的三元运算符可以这么写 因为在scala中如果代码块的代码只有一行 那么大括号可以省略
    val str: String = if (age < 18) "小孩" else "老人"

    //scala中没有switch的 而是使用模式匹配来处理这种情况
    //scala中的for循环不允许使用外部变量 以这种形式写for循环
    for (i <- 1 to 5) {
      println(i)
    }
    for (i <- 1 until 5) { //不包括5
      println(i)
    }
    //for循环的本质 <-是foreach的意思
    val inclusive: Range.Inclusive = 1 to 5
    println(inclusive.toList) //to方法的返回值是一个集合 他有tostring 方法 还有转换成List的方法
    //每次的i都是一个常量
    for (i <- Array(1, 2, 3)) {
      println(i)
    }

    //循环守卫 只有符合条件的时候才执行
    for (i <- 1 to 10 if i % 2 == 0) {
      println(i)
    }

    //循环步长 步长可以是小数 还可以是负数
    for (i <- 1 to 10 by 5) {
      println(i)
    }

    //嵌套循环
    for (i <- 1 to 3; j <- 1 to 3) {
      println(i, j)
    }

    //引入变量
    for {
      i <- 1 to 4
      j = 2 * i + 3
    } {
      println(j)
    }

    //循环返回值
    val strings: immutable.IndexedSeq[String] = for (i <- 1 to 3) yield {
      println(i)
      "hi" + i
    }
    println(strings)

    //倒序循环 除了用之前的步长来设置还可以用reverse来设置倒序
    for (i <- 1 to 10 reverse) {
      println(i)
    }

    //在scala中如果想使用while循环就不可避免的要使用外部变量 所以我们在scala中一般不实用while循环
    var a = 0
    do {
      println(a)
      a += 1
    } while (a < 10)
    //do..while对比while就是至少执行一次

    //没有break了要想让循环中途停止 只能用判断或者异常 判断的话不会真正的终止循环
    //报错都可以让代码停止 但是异常会导致代码终止 可以补货异常 但是这样就不再简洁
    try{
      throw new RuntimeException
    }catch{
      case e:RuntimeException => println("异常了")
    }

    //我们要中断的循环可以这样写
    Breaks.breakable(
      for (i <- 1 to 10 reverse) {
        println(i)
        if(i==8) Breaks.break()
      }
    )
  }
}
