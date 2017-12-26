package io.hatoff.codewars

import org.scalatest.FunSuite

class DuplicateEncoderTest extends FunSuite {
  
  import DuplicateEncoder.duplicateEncode

  val basicExamples = Seq(
    ("din", "((("),
    ("recede", "()()()"),
    ("Success", ")())())"),
    ("(( @", "))(("),
    ("CodeWarrior", "()(((())())"),
  )

  basicExamples.foreach { case (decoded, encoded) => assert(duplicateEncode(decoded) == encoded)}

}
