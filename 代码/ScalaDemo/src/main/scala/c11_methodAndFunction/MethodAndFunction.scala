package c11_methodAndFunction

import scala.annotation.tailrec

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
    println(function7(1, 1))
    //如果化简完之后只剩下一个_则不能化简 就是说最终的表达式只是一个_的时候是不可以的 但是可以取巧 强行等于一个空串
    val function10: String => String = _ + "" //取巧的方法 但是不推荐
    val function11: String => String = s => s
    //嵌套的时候也不能化简

    //高阶函数的三种用法
    /*
    * 1.函数可以作为值进行传递
    * 2.函数可以作为参数进行传递
    * 3.函数可以做为函数返回值进行返回
    * */

    //函数作为值传递
    def function12(s: String): String = {
      println("giao")
      s
    }

    val stringToString: String => String = function12 _
    stringToString("xx")
    //函数可以作为参数进行传递
    val function8: (Int, Int) => Int = (x: Int, y: Int) => x + y

    def function13(x: Int, y: Int, f: (Int, Int) => Int): Int = {
      f(x, y)
    }
    //这样可以调用 并且这个参数可以是匿名函数
    println(function13(1, 2, function8))
    //传递的内容可以是直接传递一个函数表达式
    println(function13(1, 2, _ + _))

    //函数可以作为函数返回值返回
    //如果我们想实现这样一个场景：先调用这个函数并且向里面传递一个参数 处理完这个逻辑之后还想继续向这个函数中传递参数
    //所以我们需要获得第一次调用返回的function再进行第二次的处理
    def sumXY(x: Int) = {
      def sumY(y: Int): Int = {
        x + y
      }
      //需要将内部定义的函数作为结果返回
      sumY _
    }

    var func = sumXY(1)
    println(func(5))
    println(sumXY(9)(6)) //这样是两级的调用写在了一起
    //上面那个函数还可以继续化简 这里可以选择任意方向的返回值推断
    def sumXY2(x: Int) = {
      def sumY(y: Int) = x + y

      sumY _
    }

    //继续化简的话 还可以直接写一个匿名函数返回去
    def sumXY3(x: Int): Int => Int = y => x + y

    //继续化简 还可以用下划线代表匿名函数中的变量
    def sumXY4(x: Int): Int => Int = x + _

    //其实并不推荐对高阶函数进行过分的化简 这样会大大降低代码的可读性 推荐写成定义函数的形式

    //函数柯里化写法 柯里化就是把一个形参列表的多个参数打散成多个形参列表 柯里化的底层就是用函数嵌套实现的 作者帮我们实现完了
    def fun9(c: Char)(s: String)(i: Int): Boolean = {
      println("" + c + s + i)
      false
    }

    fun9('a')("giao")(96)

    //闭包 一个函数访问到了它的外部变量的值 那么这个函数所属的环境称作闭包
    //将外部的变量打包成一个常量 放在内部函数中 这样就可以减少依赖关系 可以减少压栈
    //定义一个相加函数
    def xxSum(x: Int, y: Int): Int = x + y

    //我们频繁使用这个函数的时候就很难受 于是我们可以写一个确定的逻辑 比如我们都想加10 就可以在逻辑中写死10 不用传入参数了
    //但是这两种模式中 要么泛用性更强 要么适用性更强
    //通过闭包可以实现这样一种平衡
    def xxSumxx(x: Int) = {
      def sumY(y: Int): Int = x + y

      sumY _
    }
    //这样就可以先产生一个初始化完成的内层函数

    //递归 递归慢
    def fun31(n: Int): Long = {
      if (n == 1) {
        1
      } else {
        fun31(n - 1) * n
      }
    }

    println(fun31(5))

    //尾递归优化 最后递归调用的函数最后一行只有自身的函数 没有其他值
    @tailrec //这个注解可以检查是不是尾递归 不是的话就会报错
    def fun32(n: Int, res: Long = 1): Long = {
      if (n == 1) {
        res
      } else {
        fun32(n - 1, res * n)
      }
    }

    println(fun32(5))

    //控制抽象
    def sayHiHi(name: String): Unit = {
      println(s"hi hi $name")
    }
    //值调用
    sayHiHi({
      println("giao1")
      "giao2"
    })

    //名调用 不是将代码块的结果作为参数传入函数中 而是将代码块整个传入到函数中 使用一次代码块就会计算一次、运行一次
    def sayHiHi1(name: => String): Unit = {
      println("giao3")
      println(s"hi hi $name")
    }

    sayHiHi1({
      println("giao1")
      "giao2"
    })

    //惰性函数 不会立刻计算 会在需要用到这个值的时候再进行计算
    def xxxx(x: Int, y: Int): Int = {
      println("a")
      x + y
    }

    lazy val lazz = xxxx(1, 3)

    println("b")
    println("xxxx " + lazz)
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
