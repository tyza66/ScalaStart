package c12_focus_objects

/**
 * Author: tyza66
 * Date: 2023/05/18 9:34
 * Github: https://github.com/tyza66
 **/
object Fo4 {
  def main(args: Array[String]): Unit = {
    var o:Person07 = new Student07
    //在java里面调用的是父类的 方法调用子类的
    //在scala里面属性和方法都是调用子类的
    println(o.name)
    o.sayHi()
  }
}

class Person07(){
  val name: String = "John"
  def sayHi(): Unit ={
    println("hi person")
  }
}

class Student07() extends Person07(){
  override val name: String = "student"

  override def sayHi(): Unit = {
    println("hi student")
  }
}
