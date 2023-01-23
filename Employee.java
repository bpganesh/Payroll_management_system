public class Employee {
    private String Name;
    private String Gender;
   // Address address;
    private String Location;
    private String Employee_Id;
    private String Depatment;
    private String Employee_Type;

    private String bang;

    private String PF_Number;
    private String Accountnumber;
    private long CTC_in_Lanks;
    //Address address;


    public Employee(String name, String gender,String building,String street,String area,String city,String pin, String location,
                    String employee_Id,String Depatment,String Employee_Type, String bang, String PF_Number, String accountnumber,
                    double CTC_in_Lanks) {
        Address address=new Address(building,street,area,city,pin);
        setName(name);
        setGender(gender);
        //this.address = address;
        setLocation(location);
        setEmployee_Id(employee_Id);
        setDepatment(Depatment);
        setEmployee_Type(Employee_Type);
        setBang(bang);
        setPF_Number(PF_Number);
        setAccountnumber(accountnumber);
        setCTC_in_Lanks(CTC_in_Lanks);

    }

    public void setDepatment(String depatment) {
        Depatment = depatment;
    }

    public void setEmployee_Type(String employee_Type) {
        Employee_Type = employee_Type;
    }

    public String getDepatment() {
        return Depatment;
    }

    public String getEmployee_Type() {
        return Employee_Type;
    }

    public String getName() {
        return Name;
    }

    public String getGender() {
        return Gender;
    }


    public String getLocation() {
        return Location;
    }

    public String getEmployee_Id() {
        return Employee_Id;
    }

    public String getBang() {
        return bang;
    }

    public String getPF_Number() {
        return PF_Number;
    }

    public String getAccountnumber() {
        return Accountnumber;
    }

    public double getCTC_in_Lanks() {
        return CTC_in_Lanks;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setGender(String gender) {
        Gender = gender;
    }



    public void setLocation(String location) {
        Location = location;
    }

    public void setEmployee_Id(String employee_Id) {
        Employee_Id = employee_Id;
    }

    public void setBang(String bang) {
        this.bang = bang;
    }

    public void setPF_Number(String PF_Number) {
        this.PF_Number = PF_Number;
    }

    public void setAccountnumber(String accountnumber) {
        Accountnumber = accountnumber;
    }

    public void setCTC_in_Lanks(double CTC_in_Lanks) {
        this.CTC_in_Lanks = (long) CTC_in_Lanks;
    }
    Employee(){

    }
}
 class Address{
    private String Doornumber;
    private String Street;
    private String Area;
    private String City;
    private String Pin;

     public Address(String doornumber, String street, String area, String city, String pin) {
         setDoornumber(doornumber);
         setStreet(street);
         setArea(area);
         setCity(city);
         setPin(pin);
     }

     public void setDoornumber(String doornumber) {
         Doornumber = doornumber;
     }

     public void setStreet(String street) {
         Street = street;
     }

     public void setArea(String area) {
         Area = area;
     }

     public void setCity(String city) {
         City = city;
     }

     public void setPin(String pin) {
         Pin = pin;
     }

     public String getDoornumber() {
         return Doornumber;
     }

     public String getStreet() {
         return Street;
     }

     public String getArea() {
         return Area;
     }

     public String getCity() {
         return City;
     }

     public String getPin() {
         return Pin;
     }
 }
