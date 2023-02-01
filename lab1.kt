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

    print("Convert from km, mi, cm, in, kg, lb, g, oz, C, F, L and cup.\nPlease select and enter the current unit of measurement: ")
    val measurementUnit = readLine()

    var conversion: String
    when (measurementUnit) {
        "km" -> conversion = "$number$measurementUnit = ${number*0.62}mi"
        "mi" -> conversion = "$number$measurementUnit = ${number*1.61}km"

        "cm" -> conversion = "$number$measurementUnit = ${number*0.39}in"
        "in" -> conversion = "$number$measurementUnit = ${number*2.54}cm"

        "kg" -> conversion = "$number$measurementUnit = ${number*2.2}lb"
        "lb" -> conversion = "$number$measurementUnit = ${number*0.45}kg"

        "g" -> conversion = "$number$measurementUnit = ${number*0.04}oz"
        "oz" -> conversion = "$number$measurementUnit = ${number*28.35}g"

        "C" -> conversion = "$number$measurementUnit = ${number*(9/5) + 32}F or ${number + 273.15}K"

        "F" -> conversion = "$number$measurementUnit = ${(number-32) * (5/9)}C or ${(number-32) * (5/9) + 273.15}K"
        
        "L" -> conversion = "$number$measurementUnit = ${number*4.17}cups"
        "cup" -> conversion = "$number$measurementUnit = ${number*0.24}L"

        else -> conversion = "Please enter valid unit"
    }

    println(conversion)

}