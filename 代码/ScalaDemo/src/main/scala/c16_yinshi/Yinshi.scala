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
    implicit def changeInt(self:Int) = {
      new MyInt(self)
    }
    val i1 = 10
    val i:Int = i1.myMax(20)
    println(i)
    //如果隐式方法和原来的类中的方法冲突了 那就调用原来的 因为只有第一次编译失败的时候才会调用隐式转换的方法
  }
}

class MyInt(val self:Int){
  def myMax(i:Int):Int = {
    if(i > self) i else self
  }
}
