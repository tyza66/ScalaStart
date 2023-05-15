package c5_print

/**
 * Author: tyza66
 * Date: 2023/05/15 13:29
 * Github: https://github.com/tyza66
 **/
object PrintString {
  def main(args: Array[String]): Unit = {
    //字符串拼接的规则和java中的一模一样
    //但是这里有一个特殊的地方就是我们可以用*10表示输出10次
    println("giao " * 10) //就是相当于10个衔接在一起
    println("giao ".*(10)) //上面的东西本质上就是一个字符串调用了一个方法,并填写了一个参数 只是方法名叫做*
    //格式化输出
    printf("%d 是 %s \n",99,"giao")
    //使用字符串模板 模板${}里面可以直接添加运算
    var a = "hello"
    var b = 96
    val str = s"${a},${b}"
    println(str)
    //长字符串 三个" 默认那个使用|每一行的开头
    val value1 =
      """
       |giao
       |  giao
      """.stripMargin
    println(value1)
  }
}
