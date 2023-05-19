package c13_collection

/**
 * Author: tyza66
 * Date: 2023/05/19 11:27
 * Github: https://github.com/tyza66
 **/
object Collection5 {
  def main(args: Array[String]): Unit = {
    //元组的长度本身不可变 可以存放不同数据类型的元素
    //如果使用list存放存什么元素 那调用的时候没法得到对应的类型
    //Tuple就可以
    val tuple = new Tuple2[String, Int]("hello", 96)
    //这样写还是比较费劲的 所以用下面这样写比较好
    val tuple1: (String, Int, Int) = ("helo", 8, 9)
    val value: String = tuple._1

    //元组和map的关系
    //创建map的时候那个() 会被默认当作二元组
    val stringToInt = Map(("hello", 1), ("hello", 2))
    //map和list完成了相互转化
    //map转换完之后里存的就是二元组
  }
}
