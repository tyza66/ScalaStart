package c3_var_val

/**
 * Author: tyza66
 * Date: 2023/05/15 12:03
 * Github: https://github.com/tyza66
 **/
object VarAndVal {
  def main(args: Array[String]): Unit = {
    val v : Int = 10 //常量值不能修改
    var v2 : Int = 20 //变量的值可以修改
    var v3 = 10 //c3有类型 根据类型推断而来 变量类型一旦定义就不可以被修改
    //类型推断只能推断固定的类型 比如自动推断只会推断成int不会推断成byte
    //变量声明时必须要写初始值

    //定义一个新的对象 查看默认值是多少
    val person2 = new Person2()
    println(person2.age)
    //常量的引用数据类型 引用是不能被修改的
    val person3 = new Person2
    //person3 = new Person2
    //但是引用数据类型常量的非常量属性是可以被改变的
    person3.age = 1;
  }
}

class Person2{
  //可以使用——表示初始值 但是常量不能用_因为常量的值不能改变了 这样也会获得一个初始值
  var age:Int = _;
}

//函数式编程中尽量使用常量