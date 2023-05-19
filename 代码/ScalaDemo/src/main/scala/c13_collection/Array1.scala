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
    buffer.append(1,2,3) //添加元素 这里可以输入任意数量的参数
    println(buffer.length)

    buffer.remove(0,2) //删除元素 有两个参数 第一个是从哪个下标开始 第二个是删除的个数
    println(buffer.length)

    buffer.update(0,96) //修改元素 两个参数 第一个是修改的下标 第二个是修改成的值 其实可以直接调用伴生类的apply方法

    //往数组中添加元素 可变的用方法 不可变的用符号 这样不容易混
    var array3:Array[Int] = array2 :+ 1;
    println(array3.toList)

    var buffer3:ArrayBuffer[Int] = buffer :+ 2;
    println(buffer3)
    buffer += 1
    println(buffer.toList)

    //可变数组和不可变数组的相互转换 直接使用to方法就可以

    //定义二位数组
    val array1: Array[Array[Int]] = Array(Array(0, 1), Array(1, 2), Array(2, 3))
    for (elem <- array1) {
      for (elem <- elem) {
        print(elem + "\t")
      }
      println()
    }

    //scala中提供了生成多维数组的方法
    val array4: Array[Array[Int]] = Array.ofDim[Int](3, 4) //表示产生一个三行四列的二维数组
    //里面的值默认都是0
    array4(0)(0) = 96
    for (elem <- array4) {
      for (elem <- elem) {
        print(elem + "\t")
      }
      println()
    }

  }
}
