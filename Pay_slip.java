import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.SimpleFormatter;

public class Pay_slip extends Employee{
    static double basic_salary,vpp,pf,other_allowance,income_tax,gross_pay,net_Pay;
    static String mount;

    public static void Salary(String month, String employee_id3, double mess_bill, Date date, HashMap<String,Employee> hashMap) {
        for (Map.Entry<String, Employee> entry : hashMap.entrySet()) {
            if (employee_id3.equals(entry.getValue().getEmployee_Id())) {
                calculation(entry.getValue().getCTC_in_Lanks(),mess_bill,mount);
            }
            }
    }

    private static void calculation(double ctc_in_lanks,double mess_bill,String mount1) {
        SimpleDateFormat formatter = new SimpleDateFormat("MM-YYYY");
        Date date = new Date();
        mount = formatter.format(date);

        basic_salary=  ((ctc_in_lanks*0.60)/12);
        vpp=  ((ctc_in_lanks*0.30)/12);
        pf=  ((ctc_in_lanks*0.05)/12);
        other_allowance=  ((ctc_in_lanks*0.05)/12);
        if(ctc_in_lanks<500000){
            income_tax=0;
        } else if (ctc_in_lanks>=500000 && ctc_in_lanks<=1000000) {
            income_tax=  ((ctc_in_lanks*0.05)/12);
        } else if(ctc_in_lanks>1000000 && ctc_in_lanks<=1500000){
            income_tax=  ((ctc_in_lanks*0.10)/12);
        } else if (ctc_in_lanks>1500000 && ctc_in_lanks<=2000000) {
            income_tax=  ((ctc_in_lanks*0.15)/12);
        } else if (ctc_in_lanks>2000000) {
            income_tax=  ((ctc_in_lanks*0.20)/12);
        }
        gross_pay=basic_salary+vpp+pf+other_allowance;
        net_Pay=gross_pay-income_tax-mess_bill;
        System.out.println("+++++++++++++++++++");
        System.out.println("{\n"+  mount +": {\n"+"  basic_salary : "+basic_salary
        +"\n  variable_pay : "+vpp+"\n  provident_fund : "+pf+"\n  other_allowance : "+other_allowance+
                "\n  income_tax : "+income_tax+"\n  mess_bill : "+mess_bill+"\n  net-pay : "+net_Pay+
                "\n  gross_pay : "+gross_pay);
        System.out.println("++++++++++++++++++++");
    }
}
