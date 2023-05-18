package c12_focus_objects

/**
 * Author: tyza66
 * Date: 2023/05/18 12:33
 * Github: https://github.com/tyza66
 **/
object Fo9 {
  def main(args: Array[String]): Unit = {
    val son1: Father14 = new Son14
    if (son1.isInstanceOf[Son14]) {
      val son11: Son14 = son1.asInstanceOf[Son14]
      son11.sayHi()
    }
    //类模板 反射里面的
    val value:Class[Son14] = classOf[Son14]
  }
}

class Father14 {}

class Son14 extends Father14 {
  def sayHi(): Unit = {
    println("giao")
  }
}
