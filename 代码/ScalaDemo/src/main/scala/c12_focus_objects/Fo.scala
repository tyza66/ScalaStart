package c12_focus_objects

import scala.beans.BeanProperty
import scala.collection.mutable

/**
 * Author: tyza66
 * Date: 2023/05/17 14:13
 * Github: https://github.com/tyza66
 **/
object Fo {
  def main(args: Array[String]): Unit = {
    //scala的面向对象其实是和java的一样的
    /*
    * 包的三大作用（和java里面的一样）
    * 1.区分相同名字的类
    * 2.当类很多时，可以很好的管理类
    * 3.访问范围控制
    * */
    //包对象
    //在scala里面包也是对象 也可以有属性和方法
    println(packagename)
    sayHi("giao")

    //全局导包在最上面 局部导包只有在它以下可以使用
    import scala.collection.mutable.HashMap
    var  h:HashMap[String,String] = new mutable.HashMap[String,String]

    //scala里使用_作为通配符
    import scala.collection.mutable._
    var h2:HashSet[String] = new HashSet[String]
    //取别名在大货号中用=>  导入多个直接在大括号中写多个 要屏蔽某个就给他起别名为下划线
    //直接导入类和直接导入方法是不一样的
    import scala.util.control.Breaks._ //这样是直接导入静态方法 可以直接通过静态方法名调用静态方法
    //大括号中用,分隔 并且可以单独给一些类改名 比如 import scala.util.control.{Breaks => Giao,_} 表示引入上层包中的所有成员并把Break更名为Giao
    //同理 将单独的类取成下划线 就可以屏蔽单个类 import scala.util.control.{Breaks => _,_}
    //new _root_.java.util.HashMap 引入java的绝对路径
    var person0 = new Person02
    person0.setAge(96) //如果是val就没有set方法 只有get方法

    //权限
    //scala中protected受保护权限比java中更严格 同类子类可以访问 但是同包下不能访问
    //private[包名] 增加包访问权限 包名下的其他文件也可以使用
  }
}

//这也是一个包 这是scala都有的写法 和文件夹不对应 独立存在
//使用起来和正常的包一样
package com{

  import c12_focus_objects.com.giao.Inner

  object Outher{
    def main(args: Array[String]): Unit = {
      println("outer")
      //外层调用内层的对象是需要导包的 需要导入依赖
      Inner.main(args)
    }
  }

  package giao{
    object Inner{
      def main(args: Array[String]): Unit = {
        println("inner")
        //Outher.main(args) 不要两个方法互相嵌套 会栈溢出
      }
    }
  }
}
//代码中中定义的包 包对象不可以写在文件中了 要写在这里
//如果出现覆盖的情况 调用内层的
package object com{
  val  packagename = "com"

  def sayHi(name:String): Unit ={
    println(s"Hi ${name}")
  }
}
//scala中一个文件里面可以写多个public类 scala里面的类默认就是public的

class Person02{
  @BeanProperty
  val name:String = "John"
  @BeanProperty
  var age:Int = 10
  //java中的getter和setter封装的意义就在于权限管理的细致 读写权限的分离
  //在这里直接就用val和var实现了读写权限的分离
  //scala里面的public其实底层就是private通过get方法set方法进行的操作
  //为了和一些java的框架进行兼容 可以使用@BeanProperty 声明有bean的特征 自动声明对应的get和set
}