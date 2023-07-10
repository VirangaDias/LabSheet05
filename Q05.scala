package Tutorials05

object Q05 {
  def main(args:Array[String]): Unit = {
    print("Enter the number : ")
      var a=scala.io.StdIn.readInt()
print(sum(a))
  }
  var total=0

  def sum(b:Int): Int = {
    if(b%2==0 && b>0) {
        total=total+b
    sum(b-2)
    }else{
      if(b%2!=0) {
        sum(b - 1)
      }else {
        return total
      }
    }
  }
}
