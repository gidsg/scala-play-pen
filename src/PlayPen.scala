import java.io.File
import java.util.Scanner
import scala.collection.mutable.ArrayBuffer
import scala.io.Source
import scala.Predef._

object PlayPen extends App {

 // def sorted


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
    val scores = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
    val bobsScore = scores.getOrElse("Bob", 0)
    println(bobsScore)
    scores("Bob") = 9
    scores("Fred") = 8
    scores += ("Gids" -> 1, "bill" -> 5)
    scores -= "Alice"
    for((k, v) <- scores){
      println(s"$k, $v")
    }

    val tuple = ("Gids", 28, "Finchley")
    (println(tuple._2))
    val (name,age,location)=tuple
    println(name)


    val products =Map("ipod" -> 10, "ipad" -> 20)
 val tenPercentOff= for((k,v) <- products) yield(k, v-v/10)
    println(tenPercentOff.mkString)

    val source = Source.fromFile (new File("/Users/gideongoldberg/Documents/hello.txt"))

      val words = source.mkString.split("\\s+")
    words.mkString
    for (word <- words){
      word
    }
    val wordsWithCount= words.map(word =>  (word, words.count(_ == word)))
    val unique2 = wordsWithCount.distinct
   println(unique2.mkString)

    val wordCount = words.map(word => words.count(_==word))
    println(wordCount.mkString)
    def minmax(values: Array[Int]) ={
      val sorted =values.sorted
      (sorted.head,sorted.last)
    }
   println(minmax(wordCount))
    val tuple2 = (1,2)
    val intArray = Array(1,2,3,4,5)

    def lteqgt(values: Array[Int], v: Int)= {
        val lt = (values.filter(_ < v)).length
        val eq = (values.filter(_ == v)).length
        val gt = (values.filter(_ > v)).length
      (lt,eq,gt)
    }
    println(lteqgt(intArray, 4))

    class Person(val name: String, var age: Int ){
      println(age)
      if(age<0){
      age=0 }
      println(s"Just made a person called $name, $age years old")
      def talk{
       println(s"$name: said Hello!")
      }

    }

    class FullNamePerson(name: String){
   val names = name.split("\\s")
   val firstName = names(0)
   val lastName = names(1)
    }

    val meFN = new FullNamePerson("Gids Goldberg")
    println(meFN.firstName)
    println(meFN.lastName)
    val me = new Person("Gids",-2)


    me.talk
    class BankAccount{
      private var privateBalance = 0
      def deposit(amount: Int){
        privateBalance+=amount
      }
      def withdraw(amount: Int){
        privateBalance-=amount
      }
      def balance = privateBalance
    }
    val ba = new BankAccount
    ba.deposit(5)
    println(ba.balance)
    class Time(val hrs: Int, val min: Int) {
      def before(other: Time): Boolean ={
      val thisTime= (hrs*60)+min
         println(s"This time $thisTime")
      val beforeTime = (other.hrs*60)+other.min
        println(s"before time $beforeTime")
      thisTime < beforeTime
      }
    }
    val myTime = new Time(05,57)
    println(myTime.before(new Time (06,59)))


    class Car(manufacturer: String, modelName: String){
       var licencePlate = ""
      private var modelYear = -1
      def getModelYear=modelYear
      def this(manufacturer: String, modelName: String, licencePlate: String){
       this(manufacturer, modelName)
        this.licencePlate=licencePlate

      }
      def this(manufacturer: String, modelName: String, licencePlate: String, modelYear: Int){
        this(manufacturer, modelName)
        this.licencePlate=licencePlate
        this.modelYear=modelYear

      }
    }
  val myCar =  new Car("foo","bar","baz", 1986)
    println(myCar.licencePlate)
    println(myCar.getModelYear)
    val myCar2 =  new Car("foo","bar","baz")
    println(myCar2.getModelYear)



}







