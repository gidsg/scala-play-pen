import scala.collection.mutable.ArrayBuffer

object PlayPen {

 // def sorted

  def main(args: Array[String]) {
//    println("Hello, world!")
//    for(i <- 1 to 10 by 2){
//      println(s"loop $i")
//    }
//      var a=1
//      while(a <= 3 ){
//      println(s"while $a")
//        a = a + 1
//    }
//
    val res = for (a <- args) yield a.toUpperCase
    println("Arguments: " + res.toString)
//  println(("Hello".take(4).dropRight(1)))
//  def decorate(textToDecorate: String, left: String = "[", right: String = "]") =
//    println(left + textToDecorate + right)
//
//  decorate("hello")
//  decorate(left = "<", textToDecorate =  "Hello", right = ">" )
//  }
//
//  def countdown(startingNumber: Int) {
//    for (i <- startingNumber to 1 by -1) {
//      println("countdown "+ i)
//  }
// }
//    def charToUnicode(stringToConvert: String) {
//
//  val chars = stringToConvert.toCharArray
//    for(char <- chars) {
//      println("char in array is " + char.toLong);
//
//
//    }
//
//  }
//
//  println("Hello" map (i => BigInt(i)) product)
//  def multiply(x:Long, y:Char) = {
//    x*y
//  }
//  println("Fold left example: " + "Hello".foldLeft(1L)(multiply))
//
//  countdown(20)
//  charToUnicode("Hello")
//  val a = Array(2, 3, 5, 7, 9)
//  val result = (for (elem <- a) yield 2 * elem)
//  println("array " + result)
//  for (elem <- result) {
//    println("Yields: "+ elem)
//    }
//  println(result.mkString("Yields: ",", ",""))
//  val myArray=Array(4,7,2)
//  println(myArray.sorted.mkString(""","""))
//  val matrix= Array.ofDim[Int](3,4)
//  matrix(1)(1) = 42
//  println(matrix(1)(1))
//
//  val myArrayOfRandomInts = new Array[Int](10);
//
//  for(i <- 0 until myArrayOfRandomInts.length){
//    myArrayOfRandomInts(i) = scala.util.Random.nextInt(10);
//  }
//
//  for(value <- myArrayOfRandomInts ) {
//    println(value);
//  }
//  println("random number "+(scala.util.Random.nextInt(10)))
     val arraySequence = Array(1,2,3,4,5)
  val grouped = arraySequence.grouped(2).toList.reverse.flatten.reverse
    println(grouped)
//    for(pair <- grouped) {
//
//      //println(pair.reverse)

    val posNeg = Array(-2,5,-3,1,2)
   // val sorted = posNeg.sorted
    val posThenNeg = ArrayBuffer[Int]()
    val posNumbers = for (item <- posNeg if item > 0 ) {
   // println(item)
    posThenNeg += item
    }
    val negNumbers = for (item <- posNeg if item < 0 ) {
      posThenNeg += item
    }

    println (posThenNeg.mkString("",",",""))
    val posNeg2 = Array(-2,5,5,-3,1,2)
     val unique = posNeg2.distinct
    println(unique.mkString)

   // println(sorted.mkString)
    val timezones = java.util.TimeZone.getAvailableIDs()
    //println(timezones.mkString("",",",""))
    val americaTimezones = for(timezone <- timezones if timezone.startsWith("America/")) yield timezone.drop(8)
  val sorted = americaTimezones.toList
    println(sorted.sorted.mkString("",",",""))
    val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
    val bobsScore = scores.getOrElse("Bob", 0)
    println(bobsScore)
    for((k, v) <- scores){
      println(s"$k, $v")
    }

  }





}