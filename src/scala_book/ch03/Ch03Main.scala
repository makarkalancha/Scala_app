package scala_book.ch03

/**
 * User: Makar Kalancha
 * Date: 09/01/2015
 * Time: 16:38
 */
object Ch03Main {
  def main (args: Array[String]) {
    println("------WordlyGreeter")
    val w = new WordlyGreeter("hehe")
    w.greet()
    println("------Dog")
    var pet: Friendly = new Dog
    println(pet.greet())
    println("------Hungry Cat")
    pet = new HungryCat
    println(pet.greet())
    println("------Hungry Dog")
    pet = new HungryDog
    println(pet.greet())
    println("------Exclamatory Dog")
    pet = new Dog with ExclamatoryGreeter
    println(pet.greet())
    println("------Exclamatory Hungry Cat")
    pet = new HungryCat with ExclamatoryGreeter
    println(pet.greet())
    println("------Exclamatory Hungry Dog")
    pet = new HungryDog with ExclamatoryGreeter
    println(pet.greet())
    //    println("------Exclamatory Dog")
    ////    val pup: Friendly = new Dog with ExclamatoryGreeter //correct
    //    val pup = new Dog with ExclamatoryGreeter //correct
    //    println(pup.greet())
  }
}
