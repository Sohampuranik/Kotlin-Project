package example.myapp

fun buildSalary() {
    var ch:Int?=null
    val cn:Int=1
    val mySalary = Salary()
    while(cn==1) {
        println("1:ADD DATA")
        println("2:CALCULATE")
        println("3:DISPLAY SALARY SHEET")
        println("CHOOSE OPTION--->")
        ch = readLine()?.toInt()
        when (ch) {
            1 -> mySalary.get_data()
            2 -> mySalary.calculate()
            3 -> mySalary.display()
        }

    }
}

fun main() {
    buildSalary()
}