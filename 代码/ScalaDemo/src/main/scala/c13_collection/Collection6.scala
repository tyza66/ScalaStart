package c13_collection

/**
 * Author: tyza66
 * Date: 2023/05/19 11:44
 * Github: https://github.com/tyza66
 **/
object Collection6 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3)
    val set = Set(4,5,6)
    //获取集合长度
    val length: Int = list.length
    println(length)
    //获得集合大小
    val size: Int = list.size
    println(size) //长度的大小都是获得集合里面元素的个数
    //循环遍历 foreach
    //迭代器 iterator
    //生成字符串 tostring
    val string: String = list.mkString //直接是元素
    println(string)
    val string2: String = list.mkString("\t") //可以传递参数作为间隔 但是不包括头尾
    println(string2)
    val string3: String = list.mkString("A","\t","B") //可以传递三个参数 开头 分隔 结尾
    println(string3)
    //是否包含
  }
}
