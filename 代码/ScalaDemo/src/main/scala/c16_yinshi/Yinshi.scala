package c16_yinshi

/**
 * Author: tyza66
 * Date: 2023/05/20 18:56
 * Github: https://github.com/tyza66
 **/
object Yinshi {
  def main(args: Array[String]): Unit = {
    //当编译器第一次编译失败的时候，会在当前的环境中查找能让代码编译通过的方法，用于将类型进行隐式转换，实现第二次编译
    //隐式函数
    //将当前作用域下的所有传入值的类型隐式转换成返回值的类型
    /*implicit def changeInt(self:Int) = {
      new MyInt(self)
    }*/
    val i1 = 10
    val i:Int = i1.myMax(20)
    println(i)
    //如果隐式方法和原来的类中的方法冲突了 那就调用原来的 因为只有第一次编译失败的时候才会调用隐式转换的方法

    //隐式参数
    val list = List(1,2,3)
    val sorted: List[Int] = list.sorted

    //默认参数
    def sayHi(name:String = "giao"):Unit ={
      println("Hi " + name)
    }
    sayHi()

    //隐式参数
    //默认参数
    implicit val s:String = "giao2"
    def sayHi2(implicit name:String = "giao"):Unit ={
      println("Hi " + name)
    }
    //调用时填写括号调用参数默认值 不写括号调用的是隐式参数值
    sayHi2
  }
  //直接加implicit定义隐式类 会自动类型转换
  implicit class MyInt2(val self:Int){
    def myMax(i:Int):Int = {
      if(i > self) i else self
    }
  }
  //默认是当前作用域
  //隐式类写到包对象里面作用域就可以包括一整个包
  //优先级从小范围到大范围 先找当前区域的 再找包的
}

class MyInt(val self:Int){
  def myMax(i:Int):Int = {
    if(i > self) i else self
  }
}


