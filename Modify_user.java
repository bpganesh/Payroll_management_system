import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Modify_user extends Employee {
    static Scanner s=new Scanner(System.in);

    public static void change(String employee_id, int  str, HashMap<String,Employee> hashMap) {
//        "What to modify: \n1) Name \n2) location \n3) department" +
//                "\n4) employee type \n5) band \n6) bank account number \n7) ctc ");
        for(Map.Entry<String,Employee> entry: hashMap.entrySet()){
            if((employee_id.equals(entry.getValue().getEmployee_Id()))){
                if(str==1){
                    System.out.println("Name:");
                    entry.getValue().setName(s.next());
                } else if (str==2) {
                    System.out.println("Location:");
                    entry.getValue().setLocation(s.next());
                } else if (str==3) {
                    System.out.println("department:");
                    entry.getValue().setDepatment(s.next());
                } else if (str==4){
                    System.out.println("Employee Type:");
                    entry.getValue().setEmployee_Type(s.next());
                } else if (str==5) {
                    System.out.println("Band:");
                    entry.getValue().setBang(s.next());
                } else if (str==6) {
                    System.out.println("Bank Account Number:");
                    entry.getValue().setAccountnumber(s.next());
                } else if (str==7) {
                    System.out.println("CTC");
                    entry.getValue().setCTC_in_Lanks(s.nextLong());
                }
            }
        }

    }

    public static void Print_emp_details(String employee_id1, HashMap<String,Employee> hashMap) {
        for(Map.Entry<String,Employee>entry: hashMap.entrySet()) {
            if (employee_id1.equals(entry.getValue().getEmployee_Id())) {
                System.out.println("++++++++++++++++++++++++++");

                System.out.println("Employee id: "+entry.getValue().getEmployee_Id() + "\n" +
                        "Gender :"+entry.getValue().getGender() + "\n" +
                        "Location : "+entry.getValue().getLocation() + "\n" +
                        "Name : "+entry.getValue().getName() + "\n" +
                        "Depatment : "+entry.getValue().getDepatment() + "\n" +
                        "Employee Type : "+entry.getValue().getEmployee_Type() + "\n" +
                        "Band : "+entry.getValue().getBang() + "\n" +
                        "PF number : "+entry.getValue().getPF_Number() + "\n" +
                        "Accountnumber : "+entry.getValue().getAccountnumber() + "\n" +
                        "CTC : "+entry.getValue().getCTC_in_Lanks());
                System.out.println("++++++++++++++++++++++++++");
            }
        }

    }

    public static void Print_all_details(HashMap<String,Employee> hashMap) {
        for(Map.Entry<String,Employee>entry: hashMap.entrySet()){
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("Employee id: "+entry.getValue().getEmployee_Id() + "\n" +
                    "Gender :"+entry.getValue().getGender() + "\n" +
                    "Location : "+entry.getValue().getLocation() + "\n" +
                    "Name : "+entry.getValue().getName() + "\n" +
                    "Depatment : "+entry.getValue().getDepatment() + "\n" +
                    "Employee Type : "+entry.getValue().getEmployee_Type() + "\n" +
                    "Band : "+entry.getValue().getBang() + "\n" +
                    "PF number : "+entry.getValue().getPF_Number() + "\n" +
                    "Accountnumber : "+entry.getValue().getAccountnumber() + "\n" +
                    "CTC : "+entry.getValue().getCTC_in_Lanks());
            System.out.println("++++++++++++++++++++++++++++");
        }
    }
}
