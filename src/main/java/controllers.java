import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class controllers {
    public boolean validateNIK(String NIK) {
        return NIK.length() == 16;
    }

    public String codeByGender(String gender) {
        String code = "0";
        if (gender.equalsIgnoreCase("1")) {
            code = "11";
        } else if (gender.equalsIgnoreCase("2")) {
            code = "22";
        }
        return code;
    }

    public boolean emailVerification(String email) {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public int setPrice(String choosenPackage) {
        int price = 0;
        if (choosenPackage.equalsIgnoreCase("1")) {
            price = 200000;
        } else if (choosenPackage.equalsIgnoreCase("2")) {
            price = 150000;
        } else if (choosenPackage.equalsIgnoreCase("3")) {
            price = 50000;
        }
        return price;
    }

    public boolean ageVerification(int age){
        return age >=17;
    }

//    public boolean sendOTP


}
