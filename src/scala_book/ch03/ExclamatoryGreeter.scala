package scala_book.ch03

/**
 * User: Makar Kalancha
 * Date: 09/01/2015
 * Time: 16:42
 */
trait ExclamatoryGreeter extends Friendly{
  override def greet(): String = super.greet()+"!"
}
