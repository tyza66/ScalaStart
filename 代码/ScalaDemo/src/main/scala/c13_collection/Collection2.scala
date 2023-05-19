package c13_collection

import scala.collection.mutable.ListBuffer

/**
 * Author: tyza66
 * Date: 2023/05/19 8:34
 * Github: https://github.com/tyza66
 **/
object Collection2 {
  def main(args: Array[String]): Unit = {
    //不可变集合List 使用伴生类对象的apply方法
    //scala中的不可变集合中的数和长度都是不可改变的
    val ints = List(1, 2, 3, 4)
    ints.foreach(println)
    //添加元素
    var ints2: List[Int] = ints :+ 96
    ints2.foreach(println)

    //使用头插法添加元素
    var ints3: List[Int] = 96 :: ints2
    ints3.foreach(println)

    //集合之间合并
    var ints4: List[Int] = ints3 ::: ints2

    //空集合
    val nil: Nil.type = Nil
    val list96 = 1 :: 2 :: 3 :: Nil
    val list97 = 1 :: 2 :: 3 :: List()

    //可变集合ListBuffer
    val ints1 = new ListBuffer[Int]
    val ints5: ListBuffer[Int] = ListBuffer(1, 2, 3, 4)
    ints1.append(1)
    println(ints1)
    ints1.remove(0)
    ints5.update(0,800)
    println(ints5)
  }
}
