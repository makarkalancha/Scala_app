package scala_book.ch04

import scala_book.ch04.ChecksumAccumulator.calculate
/**
 * User: Makar Kalancha
 * Date: 12/01/2015
 * Time: 13:51
 */
object Summer {
  def main(args: Array[String]) {
    for(arg <- args){
      println(arg+": "+calculate(arg))
    }
  }
}
