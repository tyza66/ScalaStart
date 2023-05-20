package c15_yichang

import java.sql.SQLException

/**
 * Author: tyza66
 * Date: 2023/05/20 18:24
 * Github: https://github.com/tyza66
 **/
object Yichang {
  def main(args: Array[String]): Unit = {
    //跟Java里面的异常有一点区别
    try{
      1/0
    }catch{
      case e: ArithmeticException => println("算数异常")
      case e: Exception => println("其他异常")
    }
    //scala中没有编译时异常

    //在java里运行时异常的子类可以不写在throws里面
    //throw new ArithmeticException()
    //不是运行时异常的子类必须在方法上标记throws
    throw new SQLException()
    //scala中都是运行时异常 写在方法上面的注解上
  }
  @throws(classOf[NumberFormatException]) //跟java里面throws一样
  def f11()={
    "abc".toInt
  }
}
