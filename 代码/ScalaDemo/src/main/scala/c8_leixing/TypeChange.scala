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

    //进行强制类型转换的时候 scala中使用的是完全面对对象的方法
    val l1: Long = 150
    val i1: Int = l1.toInt
    val s1: String = l1.toString
    //注意使用的时候 方法调用的优先级比运算符的优先级高
    //数值类型转换成String类型的时候 可以使用toString方法 也可以借助自动类型转换和空串相加
    //string类型转换成其他类型的时候 调用转换方法的时候不能直接转换两步
    val int: Int = "12.3".toDouble.toInt
    println(int)
    //强制类型转换会强行截断
    val i: Int = 130
    val byte: Byte = i.toByte
    println(byte)
  }
}
