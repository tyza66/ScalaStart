package c12_focus_objects

/**
 * Author: tyza66
 * Date: 2023/05/18 10:28
 * Github: https://github.com/tyza66
 **/
object Fo7 {
  def main(args: Array[String]): Unit = {
    val a = Singleton10()
    val b = Singleton10()
    println(a.eq(b))
  }
}

//单例模式
//懒汉式 占用控件内存小 线程不安全
//构造器私有化
class Singleton09 private() {

}

object Singleton09 {
  private var singleton: Singleton09 = null
  //懒汉式就是先是null之后

  def apply(): Singleton09 = {
    if (singleton == null) {
      singleton = new Singleton09
    }
    singleton
  }
}

//饿汉式 没有线程安全问题 写起来简单 占用内存多
class Singleton10 private() {

}

object Singleton10 {
  private var singleton: Singleton10 = new Singleton10

  //懒汉式就是先是null之后
  def apply(): Singleton10 = singleton
}
