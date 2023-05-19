package c13_collection

import scala.collection.immutable.Queue
import scala.collection.mutable

/**
 * Author: tyza66
 * Date: 2023/05/20 7:53
 * Github: https://github.com/tyza66
 **/
object Collection10 {
  def main(args: Array[String]): Unit = {
    val queue = Queue(1,2,3,4,5)
    val ints: Queue[Int] = queue.enqueue(6)//直接放进不不行 必须要有东西接收
    val dequeue: (Int, Queue[Int]) = queue.dequeue //返回的元组第一个是弹出来的值 第二个是剩下的元组

    //推荐使用可变队列
    val ints1: mutable.Queue[Int] = mutable.Queue(1, 2, 3, 4)
    ints1.enqueue(96) //可变队列里面是直接变的
    println(ints1)
    ints1.dequeue()
    println(ints1)
  }
}
