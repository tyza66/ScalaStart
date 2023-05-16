package c9_yunsuanfu

/**
 * Author: tyza66
 * Date: 2023/05/16 10:24
 * Github: https://github.com/tyza66
 **/
object Fu {
  def main(args: Array[String]): Unit = {
    //数值运算符和逻辑运算符几乎和java中的相同
    //但是 如果我们使用了==比较字符串 就会发现 scala中的==和equals的含义是一样的 都是比价数值大小
    val s1: String = new String("giao")
    val s2: String = new String("giao")
    println(s1 == s2)
    //但是的但是 我们如果想判断两个对象的地址是否想的的时候 我们就要用到eq表示比较地址的值
    println(s1.eq(s2))

    //判断字符串非空函数
    def isNotEmpty(s: String): Boolean = {
      /*if(s == null){
        return false
      }else if(s == ""){
        return false
      }else{
        return true
      }
      //像这样写的话代码十分冗余*/
      //!((s==null) || (s=="")) //这样的话就可以简单化 咱们还可以继续简化这个公式
      s != null && s.trim != ""
    }

    //赋值运算符和java里面的一样
    //位运算符和其他编程语言中的位运算相同

    //本质上在scala中是没有运算符的 我们使用运算符实际上是在调用方法 但是在scala里面
    //调用对象方法的时候.是可以省略的 并且如果函数的参数只有一个或者没有参数 传递参数用的()可以被省略
    var one: Int = 1.+(2)
    println(one)
  }
}
