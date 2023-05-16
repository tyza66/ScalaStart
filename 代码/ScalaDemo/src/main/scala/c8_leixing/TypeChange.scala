package c8_leixing

/**
 * Author: tyza66
 * Date: 2023/05/16 9:27
 * Github: https://github.com/tyza66
 **/
object TypeChange {
  def main(args: Array[String]): Unit = {
    //scala中的类型转换也是按照 精度/容量 大小进行转换的
    var b:Byte = 10
    val s:Short = 20
    //多个不同精度的数值进行运算的时候会自动转换成精度最大的数值 赋值的时候是特例
    val d:Double = b + s + 3.14
    //把精度大的变量类型赋值给精度小的就会报错 反之就会自动类型转换
    //byte，short 和char之间不会发生自动转换
    //byte,short,char之间可以运算 运算前先转换成int了
  }
}
