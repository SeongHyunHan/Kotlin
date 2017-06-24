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

    //getting user input
    print("Enter First Number: ")
    n1 = readLine()!!.toDouble()
    print("Enter Second Number: ")
    n2 = readLine()!!.toDouble()
    print("Enter Operations (+,-,*,/): ")
    operation = readLine()

    if(operation == "+")
        result = n1 + n2
    else if(operation == "-")
        result = n1 - n2
    else if(operation == "*")
        result = n1 * n2
    else if(operation == "/")
        result = n1 / n2

    println("The Result: " + result)

}
