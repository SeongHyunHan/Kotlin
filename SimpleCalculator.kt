/**
 * Created by Seong Hyun Han on 24/06/17.
 * Simple Calculator
 *  - Calculate Basic Operations(Adding, Subtracting, Multiplying, and Dividing)
 *  - No Error Handling Implemented
 */

fun main(args: Array<String>){

    //Declare Variables
    var n1:Double?
    var n2:Double?
    var operation:String?
    var result:Double = 0.0
    var hasResult:Boolean = true

    //getting user input
    print("Enter First Number: ")
    n1 = readLine()!!.toDouble()
    print("Enter Second Number: ")
    n2 = readLine()!!.toDouble()
    print("Enter Operations (+,-,*,/): ")
    operation = readLine()

    when(operation) {
        "+" -> {
            result = n1 + n2
        }
        "-" -> {
            result = n1 - n2
        }
        "/" -> {
            result = n1 / n2
        }
        "*" -> {
            result = n1 * n2
        }
        else -> {
            println("Wrong Operation Input")
            hasResult = false
        }
    }
    if(hasResult){
        println("The Result: $result")
    }



}
