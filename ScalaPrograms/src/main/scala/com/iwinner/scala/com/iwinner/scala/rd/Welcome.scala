package com.iwinner.scala.rd

object Welcome {

  def addInt(a: Int, b: Int): Int = {
    var sum: Int = 0
    sum = a + b
    return sum
  }

  def main(args: Array[String]): Unit = {

    var x=10.toString();
    println(x)
    println(x);
    
    //println(addInt(10, 20));
   /* var status=myService("Anjaiah");
    
    println(status);
*/
  }

  def testImpl(b: Int): Int = {
    var id = 10;
    return id
  }

  def ims(c: Int): Int = {

    var id = 20;

    return id;
  }
  
  def myService(name:String):String={
    var status="Completed my Message by"+name;
    return status;
  }
}