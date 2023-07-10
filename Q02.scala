package Tutorials05

object Q02 {
  def main(args:Array[String]): Unit = {
    print("Enter the number : ")
    val a = scala.io.StdIn.readInt()


    primeSeq(a)
  }
    def prime(a: Int, b: Int = 2): Boolean = {
      b match {
        case b if a == b => true
        case b if a % b == 0 => false
        case b if b >= a / 2 => true
        case _ => prime(a, b + 1)
      }
    }

      def primeSeq(c:Int) {
        var y=0
        for (a <- 2 to c) {
          y=y+1
         if (prime(y)){
           println(y)
         }
        }
      }


}
