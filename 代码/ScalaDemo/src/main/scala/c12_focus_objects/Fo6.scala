package c12_focus_objects

/**
 * Author: tyza66
 * Date: 2023/05/18 10:02
 * Github: https://github.com/tyza66
 **/
object Fo6 {
  def main(args: Array[String]): Unit = {
    //创建对象的方法
    //1.使用构造器
    val person0 = new Person08()
    //2.调用静态方法
    val person01: Person08 = Person08.getPerson()
    Person08.apply()
    //apply方法很特殊 调用的时候可以不写方法名
    val person02: Person08 = Person08()
    //调用类里面的apply方法 是一个对象加一个括号
    person02()
    //系统在集合当中使用的非常广泛
  }
}

class Person08() {
  val name: String = "John"

  def apply(): Unit = {
    println("类中的apply")
  }
}

object Person08 {
  //这样每次都要手写叫什么类就get什么 官方给我们提供了一个方案 替换为apply方法 
  def getPerson(): Person08 = new Person08

  def apply(): Person08 = {
    println("object中的中的")
    new Person08()
  }
}

