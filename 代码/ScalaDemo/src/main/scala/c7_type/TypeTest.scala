package c7_type

/**
 * Author: tyza66
 * Date: 2023/05/15 14:26
 * Github: https://github.com/tyza66
 **/
object TypeTest {
  def main(args: Array[String]): Unit = {
    //java是命令式编程语言 每句话必须是一个命令
    //而scala是一门函数式编程语言 没必要每一句都是一个命令
    10 //任意代码都表示一个代码块 这个10就相当于我们调用了一个有返回值的方法 但是没有接受这个返回值
    //代码块默认使用最后一行返回的结果作为代码块的返回值
    val i: Int = {
      println("giao")
      10
    }
    //代码块没有返回值的话还要接收的值就得用的Unit
    val unit:Unit = {
      10
      println("giao2")
    }
    //Byte的范围是-128到127
    var i1 :Byte = 127
    var i2 :Byte = (126+1) //这样编译的时候不会报错 因为是常量 编译器自动就识别了
    var i3 :Int = 1
    //var i4 :Byte = (126+i3) 这样编译的时候就会报错 因为编译的时候编译器根本不知道i1的值
    //2200000000 直接写的数值默认会被识别成int 而不是long long需要在后面加上L、
    val l :Long = 2200000000L
    //如果数值运算超过了Int 需要提前自己改成Long
    val i5 :Int = 1500000000 + 1500000000
    println(i5) //返回的值是有下标越界后剩下那些位的值 是错误的
  }
}
