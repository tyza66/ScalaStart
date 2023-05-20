package c14_match

/**
 * Author: tyza66
 * Date: 2023/05/20 8:06
 * Github: https://github.com/tyza66
 **/
object Match {
  def main(args: Array[String]): Unit = {
    //匹配基本语法
    val a = 10
    val b = 10
    var c = '+'

    c match {
      case '+' => println("模式匹配")
      case '-' => println("1")
      case _ => println("其他")
    }
    //模式守卫
    var d = 3.14;
    //匹配模式也有返回值
    var end = d match {
      case d1: Double if d1 > 0 => d1
      case d1: Double if d1 <= 0 => -d1
      case _ => 0
    }

    println(end)

    //匹配常量
    //匹配变量类型
    def func2(x: Any): Unit = {
      x match {
        case s: String => println("字符串")
        case i: Int => println("整数")
        case d: Double => println("双浮点数")
        case _ => println("其他")
      }
    }

    func2("giao")

    //匹配集合 必须符合
    //除了array会泛型擦除

    //偏函数
    val ints = List(1, 3, 5, 7)
    //复杂的写法
    val pfunc = new PartialFunction[List[Int], Int] {
      //什么条件下调用
      override def isDefinedAt(x: List[Int]) = {
        x match {
          case List(x, y, _*) => true //有俩数的时候使用
          case _ => false
        }
      }
      //偏函数怎么用
      override def apply(v1: List[Int]) = {
        v1 match {
          case List(x, y, _*) => y
        }
      }
    }

    //简单的写法
    val intsToInt: List[Int] => Int = (list: List[Int]) => list match {
      case List(x, y, _*) => y
    }

    val intsToInt2: List[Int] => Int = {
      case List(x, y, _*) => y
    }

    val list = List(List(1, 2, 3, 4), List(1), List(2, 3, 4))
    val ints1: List[Int] = list.collect(pfunc)
    println(ints1)

    val ints2: List[Int] = list.collect({
      case List(x, y, _*) => y
    })
    println(ints2)
    //偏函数的作用就是filter + map
    //如果使用map的话也可以用偏函数简化
  }
}
