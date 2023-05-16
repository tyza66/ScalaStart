package c11_methodAndFunction

/**
 * Author: tyza66
 * Date: 2023/05/16 12:41
 * Github: https://github.com/tyza66
 **/
object MethodAndFunction {
  def main(args: Array[String]): Unit = {
    //简单定义一个函数
    def sayHi(name: String): Unit = {
      println(s"Hi ${name}")
    }

    sayHi("giao")
    //调用方法
    var person: Person = new Person
    person.sayHi("giao2")
    Person.sayHello("giao3")

    //我们可以再任何地方声明函数 并且函数支持嵌套
    //但是函数不能重载和重写
    //定义函数可以不使用() 但是如果调用没使用()定义的变量不可以使用()调用
    def sayHello:Unit = {
      println("giaogiao")
    }
    sayHello

    //函数中写不写return 都是用最后一行作为返回值 所以是否return没什么意义

    //可变参数可以用*表示 可变参数一定要放在最后一个
    def sayAny(names:String*):Unit = {
      println(s"any ${names}")
    }
    sayAny("a","b")

    //参数默认值 不传参数的时候那个值就是默认值
    def sayAny1(names:String = "狗子"):Unit = {
      println(s"any ${names}")
    }
    sayAny1()

    //如果我们想跳过一些参数 就要用到带名参数
    def sayAny2(names:String = "狗子",age:Int):Unit = {
      println(s"any ${names} ${age}")
    }
    sayAny2(age = 10)
  }
}

class Person {
  //定义类中的方法
  def sayHi(name: String): Unit = {
    println(s"Hi ${name}")
  }
}

object Person {
  //静态方法
  def sayHello(name: String): Unit = {
    println(s"Hello ${name}")
  }
}
