package io.hatoff.codewars

object RotateAgainstClockwise {

  import scala.annotation.tailrec

  @tailrec def rotate(matrix : List[List[Int]], times: Int) : List[List[Int]] = {
    (matrix, times % 4) match {
      case (null, _)  => null
      case (m, 0)     => m
      case (m, _) if m.forall(_.isEmpty) => m
      case (m, t)     => rotate(m.transpose.reverse, t - 1)
    }
  }
  
}