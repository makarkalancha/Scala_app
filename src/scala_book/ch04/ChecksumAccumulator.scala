package scala_book.ch04

import scala.collection.mutable.Map
/**
 * User: Makar Kalancha
 * Date: 12/01/2015
 * Time: 13:30
 */
class ChecksumAccumulator {
  private var sum = 0;
  def add(num: Byte){
    sum+=num
  }

  def checksum():Int={
    ~(sum & 0xFF)+1
  }
}

object ChecksumAccumulator{
  private val cache = Map[String, Int]()
  def calculate(s: String): Int ={
    if(cache.contains(s)){
      cache(s)
    } else{
      val acc = new ChecksumAccumulator
      for(c <- s){
        acc.add(c.toByte)
      }
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
  }
}
