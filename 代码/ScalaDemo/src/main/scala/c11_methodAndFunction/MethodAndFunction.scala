package c11_methodAndFunction

/**
 * Author: tyza66
 * Date: 2023/05/16 12:41
 * Github: https://github.com/tyza66
 **/
object MethodAndFunction {
  def main(args: Array[String]): Unit = {
    //简单定义一个函数
    def sayHi(name:String):Unit ={
      println(s"Hi ${name}")
    }
    sayHi("giao")
  }
}
