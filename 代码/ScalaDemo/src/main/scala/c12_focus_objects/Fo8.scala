package c12_focus_objects

/**
 * Author: tyza66
 * Date: 2023/05/18 10:56
 * Github: https://github.com/tyza66
 **/
object Fo8 {
  def main(args: Array[String]): Unit = {
    //动态混入 像匿名子类
    val student1 = new Student11 with Young09 {
      override val young = 96
    }

    val ob = new C1
    println(ob.info())
    println(ob.age)
  }
}

//在scala中使用trait来代理接口的概念 特质 = 抽象类 + 接口
trait Age09 {
  //可以有抽象的属性和方法
  val age: Int

  def sayHi(): Unit

  //还可以有具体的属性和方法
  def sayHello(): Unit = println("Hello")
}

trait Young09 {
  val young: Int
}

class Person09 {}

//实现特之类的语法有两种情况
//有父类类情况
class Student09 extends Person09 with Young09 {
  override val young: Int = 96
}

//没有父类的情况 实现的第一个特质 需要用extends 后面的多个要用with 1 with 2
class Student091 extends Age09 with Young09 {
  override val age: Int = 20

  override def sayHi(): Unit = println("hi hi")

  override val young: Int = 96
}

//一个类可以实现多个特质 并且java接口可以直接当作特质来用
class Student092 extends Age09 with Young09 with java.io.Serializable {
  override val age: Int = 96

  override def sayHi(): Unit = println("hi hi hi")

  override val young: Int = 96
}

//动态混入
class Student11 {}

//特质还会冲突 如果两个特质或者继承的特质和父类有同名并且被初始化的属性那么就会冲突 直接报错
//要想解决这个问题可以直接override 那个属性将上面冲突的属性覆盖掉
//但是有不能重写的属性 直接修改属性值没有用 没有案发解决 需要自己避免 一般
//方法冲突的话可以通过重写来解决

//钻石问题
trait A1 {
  val age: Int

  def info(): String = {
    "giao1"
  }
}

trait B1 extends A1 {
  override val age: Int = 96

  override def info(): String = {
    "giao2" + super.info()
  }
}

trait B2 extends A1 {
  override val age: Int = 97

  override def info(): String = {
    "giao3" + super.info()
  }
}

//钻石问题会都走一遍 特质叠加
class C1 extends B1 with B2 {
  override val age: Int = 98

  override def info(): String = {
    "giao4" + super.info()
  }
}

trait D1 {}

trait E1 {
  //没有继承关系中 可以用=>表示当前特质的使用依赖于另一个特质
  _: D1 =>
  //如果这样写的话 实现类后面必须有一个with D1
}
