package c1_HelloWorld

/**
 * Author: tyza66
 * Date: 2023/05/15 8:58
 * Github: https://github.com/tyza66
 **/
object HelloScala { //object中所有的属性和方法默认都是静态的
  //scala中没有静态的关键字 使用伴生对象表示静态的属性和方法
  def main(args: Array[String]): Unit = {//这里面没有void 我们用Unit表示没有返回值
    System.out.println("Hello!")
    println("Hello,World!")
  }
}

//如果写一个同名类 这个类叫做伴生类 这俩加起来算一个java里面的类
//换句话说object里面的都是静态的 class里面不是静态的
//如果单独存在一个的话 这个对象就叫单例对象 如果都有就叫伴生对象
class HelloScala{

}

//使用scala代码的时候 会先编译成class文件