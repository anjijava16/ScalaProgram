package com.iwinner.scala.rd


object WordCount {

  def add(x:Int,y:Int){
    
    
     x+y;
    
  }
  
  
   def addInt( a:Int, b:Int ) : Int = {
      var sum:Int = 0
      sum = a + b
      return sum
   }
   
   
  def main(args: Array[String]) {

    println("Welcome to SCALA") 

    var id = 100 
    println("Input values is" + id) 

    var id1 = 12d 
    println("Inser value is " + id1) 

    
    var str = "10" 
    println("Input String is " + str) 

    // Converting into the Integer from String 
    println("Conver into the Integer :::>>>"+str.toInt) 
    

    // String variables
    var name="anjaiah M" 
    println("Input name is "+name) 
    
    var inputMessage="Welcome to Scala Progrma is running into the Java Complier "+name 
    
    println(inputMessage)
   
    println("Add From 2 result is "+addInt(10, 20));
    
    

  }
}