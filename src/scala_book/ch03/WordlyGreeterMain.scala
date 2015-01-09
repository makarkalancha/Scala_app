package scala_book.ch03

/**
 * User: Makar Kalancha
 * Date: 09/01/2015
 * Time: 15:20
 */
object WordlyGreeterMain{
  def main(args: Array[String]): Unit ={
    val w = new WordlyGreeter("hehe")
    w.greet()
  }
}

class WordlyGreeter (greeting: String){
  def greet(): Unit ={
    val worldlyGreeting = WordlyGreeter.worldify(greeting)
    println(worldlyGreeting)
  }
}

// WordlyGreeter companion object
object WordlyGreeter{
  def worldify(s: String)= s+", world!"
}