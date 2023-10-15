package org.itc.com

// 1. Write a Scala program to print "Hello, world" and version of the Scala language.
object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
    println("Scala language: "+util.Properties.versionString)
  }
}
 // 2. Write a Scala program to compute the sum of the two given integer values.
// If the two values are the same, then return triples their sum.

object SumOfTwo {
  def test(x:Int, y:Int) : Int =
  {
    if (x == y) (x + y) * 3 else x + y
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test(1, 2));
    println("Result: " + test(2, 2));
  }
}

// 3. Write a Scala program to get the absolute difference between n and 51.
// If n is greater than 51 return triple the absolute difference.
object difference {
  def test(x:Int) : Int =
  {
    val abs_Diff = Math.abs(x - 51)
    if (x > 51) 3 * abs_Diff else abs_Diff
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test(60));
    println("Result: " + test(40));
  }
}

//4. Write a Scala program to check two given integers, and return true if
// one of them is 30 or if their sum is 30.
object check {
  def test(x:Int, y:Int) : Boolean  =
  {
    x == 30 || y == 30 || x + y == 30
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test(30, 0));
    println("Result: " + test(25, 5));
    println("Result: " + test(30, 20));
    println("Result: " + test(25, 20));
  }
}

//5. Write a Scala program to check a given integer and return true if it is within 20 of 100 or 300.
object check_range {
  def test(x:Int) : Boolean  =
  {
    Math.abs(100 - x) <= 20 || Math.abs(300 - x) <= 20
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test(115));
    println("Result: " + test(200));
    println("Result: " + test(250));
    println("Result: " + test(70));
  }
}

//6. Write a Scala program to create a new string where 'if' is added to the front of a given string.
// If the string already begins with 'if', return the string unchanged.
object scalar_basic {
  def test(str: String): String =
  {
    if (str.startsWith("if")) str else "if " + str
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test("if else"));
    println("Result: " + test("else"));
  }
}

//7. Write a Scala program to remove the character in a given position of a given string.
// The given position will be in the range 0...string length -1 inclusive.
object position {
  def test(str: String, n: Int): String =
  {
    str.take(n) + str.drop(n + 1)
  }
  def main(args: Array[String]): Unit = {
    println("Result: " + test("ItunuAladenola", 2));
    println("Result: " + test("ItunuAladenola", 4));
    println("Result: " + test("ItunuAladenola", 10));
  }
}

//8. Write a Scala program to exchange the first and last characters in a given string and return the new string.
object exchange {
  def test(str1: String): String =
  {
    val len = str1.length
    if (len <= 1) str1
    else str1.charAt(len - 1) + str1.substring(1, len - 1) + str1.charAt(0)
  }
  def main(args: Array[String]): Unit = {
    println("Result: " + test("ItunuAladenola"));
    println("Result: " + test("Zichan"));
    println("Result: " + test("Abishek"));
    println("Result: " + test("aLlL"));
  }
}

//9. Write a Scala program to create a new string which is 4 copies of the 2 front characters of a given string.
// If the given string length is less than 2 return the original string.
object FourCopies {
  def test(str1: String): String =
  {
    if (str1.length < 2) str1
    else str1.substring(0, 2) * 4
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test("Python"));
    println("Result: " + test("BigData"));
    println("Result: " + test("ITC"));
    println("Result: " + test("Hi"));
  }
}
// 10. Write a Scala program to create a new string with the last char added at the front and
// back of a given string of length 1 or more.

object LastChar {
  def test(str1: String): String =
  {
    val len = str1.length
    val last = str1.charAt(len - 1)
    last + str1 + last
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test("Summer"));
    println("Result: " + test("Winter"));
    println("Result: " + test("Sp"));
    println("Result: " + test("A"));
  }
}

//11. Write a Scala program to check whether a given positive number is a multiple of 3 or a multiple of 7.
object Multiples {
  def test(n: Int): Boolean =
  {
    n % 3 == 0 || n % 7 == 0;
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test(3));
    println("Result: " + test(14));
    println("Result: " + test(12));
    println("Result: " + test(37));
  }
}

//12. Write a Scala program to create a new string taking the first 3 characters of a given string and
// return the string with the 3 characters added at both the front and back. If the given string length
// is less than 3, use whatever characters are there.
object FirstThree {
  def test(str1: String): String =
  {
    if (str1.length < 3) str1 * 3
    else str1.substring(0, 3) + str1 + str1.substring(0, 3)
  }
  def main(args: Array[String]): Unit = {
    println("Result: " + test("Itunu"));
    println("Result: " + test("rhoda"));
    println("Result: " + test("Jan"));
    println("Result: " + test("FG"));
  }
}

//13. Write a Scala program to check whether a given string starts with 'Sc' or not.
object SC {
  def test(str1: String): Boolean =
  {
    str1.startsWith("Sc")
  }
  def main(args: Array[String]): Unit = {
    println("Result: " + test("Itunu"));
    println("Result: " + test("kemi"));
    println("Result: " + test("JJ"));
    println("Result: " + test("Scandal"));
  }
}

//14. Write a Scala program to check whether one of the given temperatures is
// less than 0 and the other is greater than 100.

object scala_basic14 {
  def test(temp1: Int, temp2: Int): Boolean =
  {
    (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100)
  }
  def main(args: Array[String]): Unit = {
    println("Result: " + test(120, -1));
    println("Result: " + test(-1, 120));
    println("Result: " + test(2, 120));
  }
}

//15. Write a Scala program to check two given integers whether either of them is in the range 100..200 inclusive.
object scala_basic15 {
  def test(x: Int, y: Int): Boolean =
  {
    (x >= 100 && x <= 200) || (y >= 100 && y <= 200);
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test(100, 199));
    println("Result: " + test(250, 300));
    println("Result: " + test(105, 190));
  }
}

//16. Write a Scala program to check whether three given integer values are in the range 20..50 inclusive.
// Return true if 1 or more of them are in the said range otherwise false.

object scala_basic16 {
  def test(x: Int, y: Int, z: Int): Boolean =
  {
    (x >= 20 && x <= 50) || (y >= 20 && y <= 50) || (z >= 20 && z <= 50);
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test(11, 20, 12));
    println("Result: " + test(30, 30, 17));
    println("Result: " + test(25, 35, 50));
    println("Result: " + test(15, 12, 8));
  }
}

//17. Write a Scala program to check whether two given integer values are in the range 20..50 inclusive.
// Return true if 1 or other is in the said range otherwise false.
object scala_basic17 {
  def test(x: Int, y: Int): Boolean =
  {
    (x <= 20 || y >= 50) || (y <= 20 || x >= 50);
  }
  def main(args: Array[String]): Unit = {
    println("Result: " + test(20, 84));
    println("Result: " + test(14, 50));
    println("Result: " + test(11, 45));
    println("Result: " + test(25, 40));
  }
}

//18. Write a Scala program to check whether a string 'yt' appears at index 1 in a given string.
// If it appears return a string without 'yt' otherwise return the original string.
object scala_basic18 {
  def test(str: String): String = {
    if (str.drop(1).startsWith("yt")) str.replaceFirst("yt", "")
    else str
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test("Scala"));
    println("Result: " + test("yytade"));
    println("Result: " + test("ytsues"));
  }
}

//19.Write a Scala program to check the largest number among three given integers.
object scala_basic19 {
  def test(x: Int, y: Int, z: Int): Int = {
    List(x, y, z).max
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test(1,2,3));
    println("Result: " + test(1,3,2));
    println("Result: " + test(1,1,1));
    println("Result: " + test(1,2,2));
  }
}

//20. Write a Scala program to check which number is nearest to the value 100 among two given integers.
// Return 0 if the two numbers are equal.
object scala_basic20 {
  def test(x: Int, y: Int): Int = {
    val x_abs = Math.abs(x - 100)
    val y_abs = Math.abs(y - 100)
    if (x_abs == y_abs) 0
    else if (x_abs < y_abs) x
    else y
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test(78,95));
    println("Result: " + test(95,95));
    println("Result: " + test(99,70));
  }
}

//21. Write a Scala program to check whether two given integers are in the range 40..50 inclusive,
// or they are both in the range 50..60 inclusive.
object scala_basic21 {
  def test(x: Int, y: Int): Boolean = {
    List(x, y).forall { m => m >= 40 && m <= 50 } || List(x, y).forall { n => n >= 50 && n <= 60 }
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test(78,95));
    println("Result: " + test(25,35));
    println("Result: " + test(40,50));
    println("Result: " + test(55,60));
  }
}

//22. Write a Scala program to find the larger value from two positive integer values in the range 20..30
// inclusive, or return 0 if neither is in that range.
object scala_basic22 {
  def test(x: Int, y: Int): Int = {
    val max_of_two = List(x, y).max
    if (max_of_two >= 20 && max_of_two <= 30) max_of_two else 0
  }
  def main(args: Array[String]): Unit = {
    println("Result: " + test(78,95));
    println("Result: " + test(20,30));
    println("Result: " + test(21,25));
    println("Result: " + test(28,28));
  }
}

//23. Write a Scala program to check whether a given character presents in a string between 2 to 4 times.
object scala_basic23 {
  def test(str1: String): Boolean = {
    val count_char = str1.count{ n => n == 'z' }
    count_char >= 2 && count_char <= 4
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test("frizz"));
    println("Result: " + test("zane"));
    println("Result: " + test("Zazz"));
    println("Result: " + test("false"));
  }
}

//24. Write a Scala program to check whether two given positive integers have the same last digit.
object SameLastDigitChecker {
  def test(x: Int, y: Int): Boolean = {
    Math.abs(x % 10) == Math.abs(y % 10);
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test(123, 456));
    println("Result: " + test(12, 512));
    println("Result: " + test(7, 87));
    println("Result: " + test(12, 45));
  }
}
 // OR

object SameLastDigitChecker1 extends App {

  def haveSameLastDigit(a: Int, b: Int): Boolean = {
    // Ensure the numbers are positive
    if(a <= 0 || b <= 0) {
      throw new IllegalArgumentException("Input numbers should be positive")
    }

    // Extract the last digits and compare them
    a % 10 == b % 10
  }

  val num1 = 57
  val num2 = 37

  if(haveSameLastDigit(num1, num2)) {
    println(s"The numbers $num1 and $num2 have the same last digit.")
  } else {
    println(s"The numbers $num1 and $num2 do not have the same last digit.")
  }
}

//25. Write a Scala program to convert the last 4 characters of a given string in upper case.
// If the length of the string has less than 4 then uppercase all the characters.

object last4 {
  def test(str1: String): String = {
    str1.take(str1.length() - 4) + str1.drop(str1.length() - 4).toUpperCase()
  }
  def main(args: Array[String]): Unit = {
    println("Result: " + test("Itunu"));
    println("Result: " + test("Aladenola"));
    println("Result: " + test("Rupali"));
    println("Result: " + test("rupali"));
  }
}

//26. Write a Scala program to create a new string which is n (non-negative integer ) copies of a given string.
object new_string {
  def test(str1: String, n: Int): String = {
    str1 * n;
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test("Muhammud", 2));
    println("Result: " + test("ChrisP",1));
    println("Result: " + test("Ahmed",6));
  }
}






