package c12_focus_objects

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
