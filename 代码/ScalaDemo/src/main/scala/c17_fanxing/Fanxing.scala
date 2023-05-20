package c17_fanxing

/**
 * Author: tyza66
 * Date: 2023/05/20 19:18
 * Github: https://github.com/tyza66
 **/
object Fanxing {
  def main(args: Array[String]): Unit = {
    //逆变和协变

  }
}

class Father{}
class Son extends Father{}

class MyList[T]{}//T表示不变 没有父子关系
class MyList2[+T]{}//+T表示协变 保留泛型的父子关系
class MyList3[-T]{}//+T表示逆变 反转父子关系

//泛型上限 泛型里面只能是father和father的子类 使用多
class MyList4[T <: Father]{}

//泛型下限 没有用
class MyList5[T >: Father]{}

//上下文限定