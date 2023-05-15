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
  }
}
