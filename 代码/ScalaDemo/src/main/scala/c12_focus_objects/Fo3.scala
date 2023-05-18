package c12_focus_objects

/**
 * Author: tyza66
 * Date: 2023/05/18 9:13
 * Github: https://github.com/tyza66
 **/
object Fo3 {
  def main(args: Array[String]): Unit = {
    val student:Person16 = new Student06
    student.sayHi()
    student.sayHello()
  }
}

//一般的类里面不可以包含抽象的属性和方法  需要将类改成抽象类
abstract class Person16{
  val name: String  //定义成员但是不给=和属性值就是抽象成员
  var age: Int
  var age1: Int = 1 //这样的属性是不可以被重写的  因为var变量是不抽象的 因为它本身就能改 重写它是没啥意义的
  val age2: Int = 2 //这样的属性是可以被重写的
  def sayHi():Unit
  def sayHello():Unit = {
    println("Hello")
  }
}

//抽象类在使用的时候必须去继承它 并且实现抽象成员和抽象方法
class Student06 extends Person16{
  //java里面根本没有重写属性的说法 但是因为scala中的属性自带封装自带方法
  override val name: String = "giao" //重写非抽象方法的时候需要使用override关键字 但是重写抽象方法的时候可写可不写
  override var age: Int = 96

  //???是占位符 相当于什么都没写
  override def sayHi(): Unit = {
    println("hi")
  }

  override def sayHello(): Unit = {
    super.sayHello() //子类调用父类的方法的时候就使用super方法
    println("Hello1")
  }
}
//scala中属性和方法是动态绑定的 而java中只有方法为动态绑定的
