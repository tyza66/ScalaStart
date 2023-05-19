package c13_collection

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
    val maybeInt: Option[Int] = map2.get(3)
    println(maybeInt)
    //获得值不用强转 直接get
    maybeInt.get
    //这样调用就会出现问题 如果没货得到就不能get
    val value1:Int = map.get("hello1").get
    maybeInt.getOrElse(10) //传入一个名调用 如果没有值的话就用这个值
    //上面那个太长了 我们可以直接在map中拿值的时候使用这个方法
    val i: Int = map.getOrElse("hello", 1)
  }
}
