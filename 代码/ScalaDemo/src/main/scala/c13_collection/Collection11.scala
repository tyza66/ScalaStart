package c13_collection

/**
 * Author: tyza66
 * Date: 2023/05/20 8:00
 * Github: https://github.com/tyza66
 **/
object Collection11 {
  def main(args: Array[String]): Unit = {
    val inclusive: Range.Inclusive = 1 to 100
    //单一线程打印
    inclusive.foreach(i => println(Thread.currentThread().getName + i))

    //并行集合 多线程打印
    inclusive.par.foreach(i => println(Thread.currentThread().getName + "  "+i))
    //执行出去是乱序的 线程的个数是电脑的核数
  }
}
