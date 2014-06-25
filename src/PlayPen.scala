object PlayPen {
  def main(args: Array[String]) {
    println("Hello, world!")
    for(i <- 1 to 10 by 2){
      println(s"loop $i")
    }
      var a=1
      while(a <= 3 ){
      println(s"while $a")
        a = a + 1
    }

    val res = for (a <- args) yield a.toUpperCase
    println("Arguments: " + res.toString)
  println(("Hello".take(4).dropRight(1)))
  def decorate(textToDecorate: String, left: String = "[", right: String = "]") =
    println(left + textToDecorate + right)

  decorate("hello")
  decorate(left = "<", textToDecorate =  "Hello", right = ">" )
  }

  def countdown(startingNumber: Int) {
    for (i <- startingNumber to 1 by -1) {
      println("countdown "+ i)
  }
 }
    def charToUnicode(stringToConvert: String) {

  val chars = stringToConvert.toCharArray
    for(char <- chars) {
      println("char in array is " + char.toLong);


    }

  }

  println("Hello" map (i => BigInt(i)) product)
  def multiply(x:Long, y:Char) = {
    x*y
  }
  println("Fold left example: " + "Hello".foldLeft(1L)(multiply))

  countdown(20)
  charToUnicode("Hello")
  val a = Array(2, 3, 5, 7, 9)
  val result = (for (elem <- a) yield 2 * elem)
  println("array " + result)
  for (elem <- result) {
    println("Yields: "+ elem)
    }
  println(result.mkString("Yields: ",", ",""))
}