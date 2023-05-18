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
    var student0 = new Student05("狗子输入法",18) //先运行父类的主构造器 再调用父类的辅助构造器 再调用子类的主构造器 子类的的辅助构造器
  }
}

//scala的构造器在类签名上 叫做主构造器
class Person03 (name: String){
  println("主构造器被调用")
  //类中的变量不能与构造器中的变量冲突
  var name1: String = name
  var age1:Int = _

  //scala中的构造器也是允许重载的 重载的构造器叫做辅助构造器 也叫从构造器
  def this(){
    //辅助构造器有严格的要求 必须在第一行直接或者间接的调用主构造器
    this("lisi")
    println("辅助构造器被调用")
  }
  def this(name:String,age:Int){
    //间接调用主构造器
    this()
    this.age1 = age
  }
  //在scala中 运行之前不会像java那样把类都加载一遍 而是顺序去执行一遍 所以不能在既定的调用顺序存在时更改构造器定义的顺序 构造器之间只能后面的调用前面的 不能反过来去调用
}

//构造器参数
//如果使用val或者var来修饰 直接会将参数作为属性来使用
class Person04(val name:String,var age: Int) {

}

//样例类 主构造器的参数默认修饰是val 如果需要var需要手动修饰
case class Student04(name:String,var age: Int){

}

class Person05(){
  println("父类构造器")
  var name:String = _

  def this(name:String)={
    this()
    println("父类的辅助构造器")
    this.name = name
  }
}

//在scala中继承的本质是和java中不一样的
//scala中继承的本质就是继承父类的一个构造器
//可以选择继承父类的有参构造器 但是在继承父类有参构造器的时候子类的主构造器的参数必须等于或多于父类辅助构造器的参数 并且名字也要是一样的
class Student05(name:String) extends Person05(name:String){
  println("子类的主构造器")

  def this(name:String,age:Int) = {
    this(name)
    println("子类的辅助构造器")
  }
}
