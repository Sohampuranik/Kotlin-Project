package example.myapp

class Salary {

    var Emp_basic: Double?=null
    var HRA: Double?=null
    var Medical: Double?=null
    var PF: Double?=null
   // var Net_Sal: Double?=null
    //var Gross_Sal: Double?=null
    var PT: Double= 200.0
    var Emp_name :String?=null
    fun get_data()
    {
      println("Enter employee name:")
        Emp_name= readLine()
      println("Enter employee basic salary:")
        Emp_basic= readLine()?.toDouble()
    }
    fun calculate()
    {
        HRA= Emp_basic?.div(2)
        PF=0.12* this!!.Emp_basic!!
        Medical=((Emp_basic?.times(5)?.div(100)))
        //Net_Sal=((Emp_basic?.times(35)?.div(100))?.plus(((PT.times(5)).div(100)).plus ((HRA?.times(20))?.div(100)!!)!!))
        //Gross_Sal=Net_Sal-(Medical?.times(5)?.plus(PF!!.times(0.02)))!!)
    }
    fun display()
    {
        System.out.println(" EMPLOYEE NAME:"+Emp_name);
        System.out.println(" EMPLOYEE BASIC SALARY:"+Emp_basic);
        System.out.println(" EMPLOYEE HRA:"+HRA);
        System.out.println(" EMPLOYEE Medical:"+Medical);
        System.out.println(" EMPLOYEE PF:"+PF);
        System.out.println(" EMPLOYEE PT:"+PT);
       // System.out.println(" EMPLOYEE NET SALARY:"+Net_Sal);
        //System.out.println(" EMPLOYEE GROSS SALARY:"+Gross_Sal);
    }
}