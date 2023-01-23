public class Validation {
    public static boolean check(String gender, String bank){
        boolean s=false;
        boolean s1=false;
        if(gender.equalsIgnoreCase("male")||gender.equalsIgnoreCase("female")){
            s=true;
        }
        if(bank.length()==13){
            s1=true;
        }
        if(s==true && s1==true){
            return true;
        }else{
            return false;
        }
    }

}
