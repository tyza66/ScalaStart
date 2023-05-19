package c13_collection

/**
 * Author: tyza66
 * Date: 2023/05/19 12:11
 * Github: https://github.com/tyza66
 **/
object Collection7 {
  def main(args: Array[String]): Unit = {
    //集合的衍生
    val list = List(1, 2, 3, 4, 5)
    val list2 = List(3, 5, 7, 9,11)
    //获取集合的头 //但是第一个位置没有值的集合仍然报错
    println(list.head)
    //获取集合的尾 （除了第一个以外的集合）
    println(list.tail)
    //集合最后一个数据
    println(list.last)
    //集合初始数据（不包括最后一个值的集合）
    println(list.init)
    //反转
    println(list.reverse)
    //取前/后n个元素
    println(list.take(2))
    println(list.takeRight(2))
    //去掉前、后n个元素
    println(list.drop(1))
    println(list.dropRight(1))
    //并集
    println(list.union(list2))
    //交集
    println(list.intersect(list2))
    //差集
    println(list.diff(list2))
    //拉链 如果其中一个集合里面值的数量不够那么就取短的
    println(list.zip(list2))
    //滑窗
    val iterator: Iterator[List[Int]] = list.sliding(3)
    for (elem <- iterator) {
      println(elem.product)
    }
    //滑窗里面还可以设置一个步长 末尾不够一组的话会直接变成一个小组
  }
}
