package Tutorials05

object Q03 {
  def main(args: Array[String]): Unit = {

    print("Enter the Number : ")
    val a = scala.io.StdIn.readInt()

    print(sum(a))
  }
  var total=0
  def sum(x: Int): Int = {
     if(x!=0) {
      total = total + x
       sum(x - 1)
     }
    return total
    }
}
