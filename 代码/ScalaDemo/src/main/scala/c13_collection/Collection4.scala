package c13_collection

import scala.collection.mutable

/**
 * Author: tyza66
 * Date: 2023/05/19 10:42
 * Github: https://github.com/tyza66
 **/
object Collection4 {
  def main(args: Array[String]): Unit = {
    //Map本质是HashMap
    val map = Map("hello" -> 1,"world" ->2)
    println(map)
    //倾向于写这种结构
    val map2 = Map((1,96),(2,96))
    println(map2)

    for (elem <- map2) {
      val key = elem._1
      val value = elem._2
      println(s"$key => $value")
    }
    //基本数据类型 表示不存在 存在返回Some 不存在返回None
    val maybeInt: Option[Int] = map2.get(2)
    println(maybeInt)
    //获得值不用强转 直接get
    maybeInt.get
    //这样调用就会出现问题 如果没货得到就不能get
    val value1:Int = map.get("hello").get
    maybeInt.getOrElse(10) //传入一个名调用 如果没有值的话就用这个值
    //上面那个太长了 我们可以直接在map中拿值的时候使用这个方法
    val i: Int = map.getOrElse("hello1", 1) //也是不存在就返回默认值

    //可变map
    val stringToInt: mutable.Map[String, Int] = mutable.Map(("giao", 1), ("giao2", 2))
    //增加的时候 如果原来的键的位置有值的话 就会覆盖
    val maybeInt1: Option[Int] = stringToInt.put("giao", 2)
    println(maybeInt1)
    println(stringToInt)
    //删除
    val maybeInt2: Option[Int] = stringToInt.remove("giao2")
    println(maybeInt2)
    println(stringToInt)
    //修改整的活和put是一样的
    stringToInt.update("giao", 3)
    //查
    stringToInt.getOrElse("giao",4)

    //特殊用法 只有key肯定存在的时候才能这样用
    stringToInt("giao")
  }
}
