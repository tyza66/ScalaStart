/**
 * Author: tyza66
 * Github: https://github.com/tyza66
 **/
package object c12_focus_objects {
  val packagename = "c12"

  def sayHi(name:String): Unit ={
    println(s"Hi ${name}")
  }
  //只要是在包的内部 都可以直接调用保对象中的属性
}
