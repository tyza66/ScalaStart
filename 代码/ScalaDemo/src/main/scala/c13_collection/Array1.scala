package c13_collection

import scala.collection.mutable.ArrayBuffer

/**
 * Author: tyza66
 * Date: 2023/05/18 15:10
 * Github: https://github.com/tyza66
 **/
object Array1 {
  def main(args: Array[String]): Unit = {
    val array = new Array[Int](4)
    array(0) = 100
    //scala中的数组是和java中的数组对应的
    for (elem <- array) {
      println(elem)
    }
    //调用apply方法
    val array2: Array[Int] = Array(1, 2, 3, 4)
    //迭代器遍历数组
    val iterator: Iterator[Int] = array2.iterator
    while (iterator.hasNext) {
      var i: Int = iterator.next
      println(i)
    }
    //类型转换 以为数组没有实现toString方法所以需要转换一下类型再输出 习惯性转换型List
    println(array2.toList)

    //函数式打印
    def myPrinter(i: Int): Unit = println(i * 2)

    array2.foreach(myPrinter _)
    array2.foreach((i: Int) => println(i * 3))

    array2.foreach(println)

    //可变长度数组 里面参数的大小只是底层结构的长度大小 默认是16
    val buffer:ArrayBuffer[Int] = new ArrayBuffer[Int](2)
    buffer.append(1)
    println(buffer.length)
  }
}
