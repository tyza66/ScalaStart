package c13_collection

/**
 * Author: tyza66
 * Date: 2023/05/19 17:11
 * Github: https://github.com/tyza66
 **/
object Collection8 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 6, 7, 8,-1)
    //集合计算的初级函数
    //求和 sum
    //乘积 product
    //最大值 max
    //最小值 min
    //排序 sorted 默认使用的是快速排序 可以填入一个参数表示排序的顺序
    println(list.sorted(Ordering.Int.reverse))
    println(list.sorted(Ordering[Int].reverse))
    //自定义排序sortBy 自定义排序规则 参数是一个函数 规则中可以是二元组 要以谁排序只要将要依据返回就行了 要倒转就要用柯里化的写法

    //sortWith 参数是两个二元组为参数的函数 相当于满足要求就调换位置

    //这些作为参数的函数可以简写成_
  }
}
