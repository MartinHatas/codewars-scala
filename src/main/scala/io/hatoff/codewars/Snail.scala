package io.hatoff.codewars

object Snail {

  def snail(xs: List[List[Int]]): List[Int] = xs match {
      case List(last) => last
      case head :: tail => head ++ snail(tail.transpose.reverse)
  }

}
