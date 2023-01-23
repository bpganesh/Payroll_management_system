import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

public class Employer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Employee> hashMap = new HashMap<>();
        boolean flag = true;
        int temp;
        do {
            System.out.println("++++++++PAYROLL MANAGEMENT SYSTEM++++++++");
            System.out.println("1) Add User  \n2) Modify user \n3) Remove Employee \n4) Search Employee " +
                    "\n5) Print all Employees \n6) Generate pay slip \n7) Exit");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("Enter your choice ");
            temp = sc.nextInt();
            switch (temp) {
                case 1:
                    boolean flax = false;
                    while (!flax) {
                        System.out.println("Name:");
                        String name = sc.next();
                        System.out.println("Gender:");
                        String gender = sc.next();
                        System.out.println("Address:(building,Street,Area,city,pin)");
                        String building = sc.next();
                        String street = sc.next();
                        String area = sc.next();
                        String city = sc.next();
                        String pin = sc.next();
                        System.out.println("Location:");
                        String location = sc.next();
                        System.out.println("Employee Id:");
                        String employee_id = sc.next();
                        System.out.println("Department(SEC,SATCOM,DEVICE,RAN)");
                        String deparment = sc.next();
                        System.out.println("EmployeeType(Permanent/part time/contractor)");
                        String employeeType = sc.next();
                        System.out.println("Band(GT,E1,E2,E3,L1,L2,L3)");
                        String band = sc.next();
                        System.out.println("PF Number:");
                        String pf = sc.next();
                        System.out.println("Bank Account Number:");
                        String bank = sc.next();
                        System.out.println("CTC in Lanks");
                        double ctc = sc.nextDouble();
                        if (Validation.check(gender, bank)) {
                            hashMap.put(employee_id, new Employee(name, gender, building, street, area, city, pin
                                    , location, employee_id, deparment, employeeType, band, pf, bank, ctc));
                            flax = true;


                        } else {
                            System.out.println("Some details incorrect");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter the employee id:");
                    String employee_id = sc.next();
                    for (Map.Entry<String, Employee> entry : hashMap.entrySet()) {

                        if (employee_id.equals(entry.getValue().getEmployee_Id())) {
                            System.out.println("What to modify: \n1) Name \n2) location \n3) department" +
                                    "\n4) employee type \n5) band \n6) bank account number \n7) ctc ");
                            System.out.println("Choose your option");
                            int str = sc.nextInt();

                            Modify_user.change(employee_id, str, hashMap);
                            Modify_user.Print_emp_details(employee_id, hashMap);
                        } else {
                            System.out.println("Employee not found");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter Employee id");
                    String employee_id1 = sc.next();
                    for (Map.Entry<String, Employee> entry : hashMap.entrySet()) {
                        if (employee_id1.equals(entry.getValue().getEmployee_Id())) {
                            Modify_user.Print_emp_details(employee_id1, hashMap);
                            hashMap.remove(employee_id1);
                            System.out.println("Successfully removed!");
                        } else {
                            System.out.println("Employee not found!");
                        }

                    }
                    break;
                case 4:
                    System.out.println("Enter Employee id for search");
                    String employee_id2 = sc.next();
                    for (Map.Entry<String, Employee> entry : hashMap.entrySet()) {
                        if (employee_id2.equals(entry.getValue().getEmployee_Id())) {
                            Modify_user.Print_emp_details(employee_id2, hashMap);

                        }else {
                            System.out.println("Employee not found!");
                        }
                    }
                    break;
                case 5:
                    Modify_user.Print_all_details(hashMap);
                    break;
                case 6:
                    System.out.println("Enter Month of pay(MM_YYYY):");
                    String month=sc.next();
                    System.out.println("Enter Employee id: ");
                    String employee_id3=sc.next();
                    for (Map.Entry<String, Employee> entry : hashMap.entrySet()) {
                        if (employee_id3.equals(entry.getValue().getEmployee_Id())) {
                            System.out.println("Mess bill : ");
                            long mess_bill=sc.nextLong();
                            Date date=new Date();
                            Pay_slip.Salary(month,employee_id3,mess_bill,date,hashMap);
                        } else {
                            System.out.println("Employee not found!");
                        }

                    }


                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Once check");


            }
        }while (temp != 7) ;

    }
}