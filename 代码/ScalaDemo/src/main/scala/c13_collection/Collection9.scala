package c13_collection

/**
 * Author: tyza66
 * Date: 2023/05/19 19:22
 * Github: https://github.com/tyza66
 **/
object Collection9 {
  def main(args: Array[String]): Unit = {
    //集合的高阶函数
    //过滤
    val list = List(1, 2, 3, 4, 5)
    //参数是一个方法 返回值为真就保留假就不要
    println(list.filter(_ == 2))
    //转化、映射 转换结构 转换成的结构根据返回的值的类型
    list.map((i: Int) => i * 2)

    //扁平化 就是集合中嵌套集合的时候我们要给里面的集合分开
    val list2: List[List[Int]] = List(List(1, 2, 3, 4), List(3, 4, 5, 6))
    val list3: List[Int] = list2.flatten //元素必须是可以拆分的集合才能调用扁平化
    println(list3)
    //字符串可以看作char的数组
    val strings: List[String] = List("giao giao", "giao")
    println(strings.flatten)

    //分组
    val tuples = List(("a", 10), ("b", 11), ("c", 12), ("d", 13), ("a", 100), ("b", 110), ("c", 120), ("d", 130))
    val stringToTuples: Map[String, List[(String, Int)]] = tuples.groupBy((tuple: (String, Int)) => tuple._1)
    println(stringToTuples)

    //规约 合并 reduce返回结果类型和当前类型一致
    val ints: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    //第一个元素作为第一次规约调用的初始值
    println(ints.reduce((res: Int, elem: Int) => (res + elem * 2)))

    //折叠 fold 可以指定初始值
    println(ints.fold(0)((res: Int, elem: Int) => (res + elem * 2)))

    //改变数据类型
    val tuple: (String, Int) = ints.foldLeft(("sum:elem*2", 0))((res: (String, Int), elem: Int) => {
      (res._1, res._2 + elem *2)
    })
    println(tuple)
    //reduceRight是个坑 不要用
  }
}
