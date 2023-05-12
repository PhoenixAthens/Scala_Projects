package LearningScala_BOOK

object Lesson1_Primitive_Reference {
  def main(args:Array[String]):Unit={
    val num1:Int = 23
    val num2:Double = 12389e-2
    val flag:Boolean = true
    var letter:Char = 'a'
    val num:Int = letter
    val numToDouble:Double = num.toDouble
    val name:String = "Julia"
    val tuple = ("Hello",1,2,true)
    println(tuple._1)
    println(tuple._2)
    val unitType:Unit ="Hello"//this no matter what you assign, returns "()"
    println(unitType)


  }
}
