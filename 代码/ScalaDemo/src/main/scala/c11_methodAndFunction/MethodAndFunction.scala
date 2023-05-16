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
    def sayHello: Unit = {
      println("giaogiao")
    }

    sayHello

    //函数中写不写return 都是用最后一行作为返回值 所以是否return没什么意义

    //可变参数可以用*表示 可变参数一定要放在最后一个
    def sayAny(names: String*): Unit = {
      println(s"any ${names}")
    }

    sayAny("a", "b")

    //参数默认值 不传参数的时候那个值就是默认值
    def sayAny1(names: String = "狗子"): Unit = {
      println(s"any ${names}")
    }

    sayAny1()

    //如果我们想跳过一些参数 就要用到带名参数
    def sayAny2(names: String = "狗子", age: Int): Unit = {
      println(s"any ${names} ${age}")
    }

    sayAny2(age = 10)

    //通常情况下return可以省略 但是有一种特殊的情况
    //就是里面有分支结构的时候
    def sayGiao(name: String): String = {
      if (name == null) {
        return "giao"
      }
      name
    }

    println(sayGiao(null))

    //只有一行代码的时候才可以省略花括号 否则 只会读取到第一行代码

    //如果返回值类型可以推断出来 那么可以省略：后面的返回值类型 比如输入string返回string
    def sayGiao2(name: String) = name

    //如果有return 那么就不能省略返回值类型

    //如果期望没有返回值 那么可以省略掉等号 但是等号和大括号不能同时被省略
    def dadbgsaidgoi(name: String) {
      println("giao")
    }

    dadbgsaidgoi("h")
    //如果不关心名称 只关心逻辑处理，那么函数名和def可以省略 匿名函数
    val function: (String, Int) => String = (name: String, age: Int) => name + "睡觉"
    //匿名函数还可以继续化简
    //参数类型可以省略 可以通过形参推断出来
    val function1 = (name: String, age: Int) => name + "睡觉"
    //通过前面推断后面也行 一般而言都是化简后面的部分
    val function3: (String, Int) => String = (name, age) => name + "睡觉"
    //后面的类型省略后 如果发现后面只有一个参数 那么小括号可以被省略 但是没有参数或者参数数量超过1了的情况下不可以省略 因为()表示的是形参列表
    val function4: String => String = name => name + "睡觉"
    //如果函数不是只有一行 那么大括号不能省略
    val function5: String => String = name => {
      println("giaos")
      name + "睡觉"
    }
    //如果参数只出现一次则参数省略且后面的参数可以用_来代替
    val function6: String => String = _ + "睡觉"

    //简化的函数式编程实现 f(x) = 2x + 4y
    def sum(x: Int, y: Int) = 2 * x + 4 * y
    //继续化简成匿名函数
    val function2: (Int, Int) => Int = (x, y) => 2 * x + 4 * y
    //所有参数只出现一次 并且按照顺序出现 就可以用_
    val function7: (Int, Int) => Int = 2 * _ + 4 * _
    println(function7(1,1))
    //如果化简完之后只剩下一个_则不能化简 就是说最终的表达式只是一个_的时候是不可以的 但是可以取巧 强行等于一个空串
    val function10: String => String = _ + "" //取巧的方法 但是不推荐
    val function11: String => String = s => s
    //嵌套的时候也不能化简

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
