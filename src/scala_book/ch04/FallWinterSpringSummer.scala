package scala_book.ch04

import scala_book.ch04.ChecksumAccumulator.calculate

/**
 * User: Makar Kalancha
 * Date: 12/01/2015
 * Time: 14:01
 */
//object FallWinterSpringSummer extends Application{
object FallWinterSpringSummer extends App{
  for(season <- List("fall","winter","spring","summer")){
    println(season+": "+calculate(season))
  }
}
