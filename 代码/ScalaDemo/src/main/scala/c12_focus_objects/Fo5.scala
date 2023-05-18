package c12_focus_objects

/**
 * Author: tyza66
 * Date: 2023/05/18 9:50
 * Github: https://github.com/tyza66
 **/
object Fo5 {
  def main(args: Array[String]): Unit = {
    //如果我们new一个抽象类 那么就会默认创建一个匿名子类  匿名子类就相当于是这个抽象类的实现类了
    //匿名子类默认使用多态 多态无法调用子类独有的属性和方法
    //匿名子类中多余的方法这样就无法在外部被调用
    var a = new Ao {
      override var age: Int = 96

      override def sayHi(): Unit = {
        println("hi 匿名子类")
      }
    }
    a.sayHi()


  }
}
//在使用抽象类的时候我们可以直接用你匿名子类调用抽象类
abstract class Ao {
  var age:Int
  def sayHi()
}
