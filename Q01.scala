package Tutorials05

object Q01 {
  def main(args:Array[String]): Unit = {
    print("Enter the number : ")
    val a=scala.io.StdIn.readInt()

    prime(a)
    if (prime(a)) {
      print("True")
    } else {
      print("False")

    }
  }
def prime(a:Int,b:Int=2):Boolean={
  b match{
    case b if a==b =>true
    case b if a%b==0 =>false
    case b if b>=a/2 =>true
    case _=>prime(a,b+1)
  }

}
}
