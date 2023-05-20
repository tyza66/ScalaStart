package c14_match

/**
 * Author: tyza66
 * Date: 2023/05/20 8:06
 * Github: https://github.com/tyza66
 **/
object Match {
  def main(args: Array[String]): Unit = {
    //匹配基本语法
    val a = 10
    val b = 10
    var c = '+'

    c match {
      case '+' => println("模式匹配")
      case '-' => println("1")
      case _ => println("其他")
    }
    //模式守卫
    var d = 3.14;
    d match{
      case d1:Double if d1 > 0 => d1
      case d1:Double if d1 <= 0 => -d1
    }
  }
}
