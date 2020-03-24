object HelloWorld{
  /*
  对源文件进项编译
  scalac HelloWorld.scala
  HelloWorld$.class HelloWorld.class HelloWorld.scala

  编译以后生成 HelloWorld 文件
  可以 scala HelloWorld

   */
  def main(args:Array[String]): Unit ={
    println("Hello,World!")
  }
}

/*
区分大小写
类名第一个字母大写
方法名的第一个字母小写
程序文件名称应该和对象名称相同

scala 程序从 def main(arg:Array[String]) 开始
 */
