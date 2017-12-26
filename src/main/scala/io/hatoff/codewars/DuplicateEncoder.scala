package io.hatoff.codewars

object DuplicateEncoder {

  def duplicateEncode(word: String): String = {
    word.toLowerCase.map(char => if(word.toLowerCase.count(_ == char) == 1) "(" else ")").mkString
  }

}
