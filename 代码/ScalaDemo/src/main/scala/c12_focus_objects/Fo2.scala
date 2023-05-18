package c12_focus_objects

import c11_methodAndFunction.Person

/**
 * Author: tyza66
 * Date: 2023/05/18 8:14
 * Github: https://github.com/tyza66
 **/
object Fo2 {
  def main(args: Array[String]): Unit = {
    val person03 = new Person03
    println(person03.name1)
  }
}

//scala的构造器在类签名上 叫做主构造器
class Person03 (name: String){
  println("主构造器被调用")
  //类中的变量不能与构造器中的变量冲突
  val name1: String = name

  //scala中的构造器也是允许重载的 重载的构造器叫做辅助构造器 也叫从构造器
  def this(){
    //辅助构造器有严格的要求 必须在第一行直接或者间接的调用主构造器
    this("lisi")
    println("辅助构造器被调用")
  }
}