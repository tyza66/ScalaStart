package c13_collection

import scala.collection.immutable.HashSet
import scala.collection.mutable

/**
 * Author: tyza66
 * Date: 2023/05/19 9:47
 * Github: https://github.com/tyza66
 **/
object Collection3 {
  def main(args: Array[String]): Unit = {
    //不可变集合Set 一般我们直接用半生类的apply方法去生成set集合 无序不可重复
    val set = Set(1,1,1,2,54,156,46,465,165)
    println(set)
    //这个set就是HashSet 但是这个是常规情况下 数多的时候
    println(set.isInstanceOf[HashSet[Int]])
    //数少的时候不是HashSet 少于等于4个元素就会创建特殊的set

    //创建可变set 一般用包名区分 不同的地方就是可以动态的添加删除元素
    val ints: mutable.Set[Int] = mutable.Set(1, 2, 3, 4, 5)
    //添加元素
    ints.add(96) //添加的时候 会返回一个布尔类型的值 是否加入成功 就是是否原来有 有的话就会添加失败返回false
    //删除元素
    ints.remove(2)
    println(ints) //因为set是无序的 删除里面传入的参数是要删除的值 也会返回一个布尔值

    //判断是否存在
    ints.contains(1) //判断是否包含1并且返回布尔值
  }
}
