//Yuen Shan Tsang (A00270323)
//JAV-1001 - 11354 - App Development for Android - 202301 - 001
//Lab 1 - Variables and Logic

/* This program allows the user to convert between different forms of measurement.
It first collects a numeric value from the user and stores it in a variable.
Then collects the current unit of measurement and determine the appropriate conversion in either direction
At last it displays the new result.
*/

fun main(){
    //Get a numeric value from the user
    print("Please enter a numeric value: ")
    val number = readLine()!!.toFloat()

    print("Please enter the unit of measurement: ")
    val measurementUnit = readLine()

    var result: String
    when (measurementUnit) {
        "km" -> result = "$number$measurementUnit = ${0.62*number}mi"
        "mi" -> result = "$number$measurementUnit = ${1.61*number}km"

        "cm" -> result = "$number$measurementUnit = ${0.39*number}in"
        "in" -> result = "$number$measurementUnit = ${2.54*number}cm"

        "kg" -> result = "$number$measurementUnit = ${2.2*number}lb"
        "lb" -> result = "$number$measurementUnit = ${0.45*number}kg"

        "g" -> result = "$number$measurementUnit = ${0.04*number}oz"
        "oz" -> result = "$number$measurementUnit = ${28.35*number}g"

        else -> result = "Unable to convert"
    }

    println(result)

}