import scala.io.StdIn.readLine

object Sequences extends App {

  //TODO ask user to enter a sentence
  //Split sentence into words using split , you will will have a sequence of words, we did this on Day 8
  //Generate word length sequence (can use map or yield)
  //Filter only words of length over 5
  //print word lengths for every word
  //print the long words

  //you are allowed to use yield or map/filter

  val userSequence = readLine("Please enter the sequence: ")
  val words = userSequence.split(" ")

  println(words.mkString(","))

  val wordLength = words.map(words => words.length)
  println(wordLength.mkString(","))

  val over5Words = wordLength.filter(n => n>5)
  println(over5Words.mkString(","))


}
