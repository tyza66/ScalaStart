package c4_biaoshifu

/**
 * Author: tyza66
 * Date: 2023/05/15 13:02
 * Github: https://github.com/tyza66
 **/
object Biaoshifu {
  def main(args: Array[String]): Unit = {
    //通常使用和Java里面的一样的驼峰命名法 不能用数字开头
    //这里面特殊的就是使用操作位作为标识符命名 但是不能在中间出现运算符和空格
    val ++ :Int = 10
    println(++ + 1)
    //使用``包裹的变量名可以是关键字
    var `if` :Int = 99
    println(`if`)
    //可以使用Int作为变量名 因为Int是一个预定义字符 但不是关键字
    var Int : String = "GIAO"
    println(Int)
  }
}
