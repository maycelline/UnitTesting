import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controllers {
    User user = new User();
    boolean userValid = true;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        String NIK;
        String name;
        String address;
        String gender;
        String phoneNumber;
        String email;
        String age;

        String choosenPackage;

        System.out.println("Create Library ID Menu\n" +
                "================================");

        // Input NIK
        System.out.print("NIK: ");
        NIK = sc.nextLine();
        validateNIK(NIK);

        // Input Name
        System.out.print("Name: ");
        name = sc.nextLine();
        user.setName(name);

        // Input Phone Number
        System.out.print("Phone Number: ");
        phoneNumber = sc.nextLine();
        if (numberValidate(phoneNumber)) {
            user.setPhoneNumber(phoneNumber);
        }

        // Input Email
        System.out.print("Email: ");
        email = sc.nextLine();
        if (validateEmail(email)) {
            user.setEmail(email);
        }

        // Input Address
        System.out.print("Address: ");
        address = sc.nextLine();
        user.setAddress(address);

        // Input Gender
        System.out.print("1. Male\n" +
                "2. Female\n" +
                "Gender: ");
        gender = sc.nextLine();
        switch (gender){
            case "1":
                user.setGender("Male");
                break;
            case "2":
                user.setGender("Female");
                break;
            default:
                user.setGender("Not Defined");
                break;
        }


        // Input Age
        System.out.print("Age: ");
        age = sc.nextLine();
        if(numberValidate(age)){
            user.setAge(Integer.parseInt(age));
        }

        //comment dl kalau bisa dihapus, hapus aj fiturnya bang

//        System.out.print("1. Packet A: 200k/month. Free access to coworking space, meeting space, and podcast space.\n" +
//                "2. Packet B: 150k/month. Free access to coworking space and meeting space.\n" +
//                "3. Packet C: 50k/month. Free access only to book room and coworking space with limit 2 times in a week.\n" +
//                "Choose ur package: ");
//        choosenPackage = sc.nextLine();

        // after all data inputted, then do gerenate ID
        if (userValid){
            //Function to generate library ID
        } else {
            System.out.println("Please input all valid data.");
        }


    }

    public boolean numberValidate(String string){
        return string.matches("[0-9]+");
    }

    public boolean validateNIK(String NIK) {
        // check if length == 16 and only contain number
        if (NIK.length() == 16 && numberValidate(NIK)) {
            user.setNIK(NIK);
            return true;
        }
        userValid = false;
        return false;
    }


    public String codeByGender(String gender) {
        String code = "0";
        if (gender.equalsIgnoreCase("Male")) {
            code = "11";
        } else if (gender.equalsIgnoreCase("Female")) {
            code = "22";
        }
        userValid = false;
        return code;
    }

    public boolean validateEmail(String email) {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            return true;
        }
        userValid = false;
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


    //ceritanya mau nambahin age verif, tp kl ga perlu gapapa ^^
    public boolean ageVerification(int age) {
        return age >= 17;
    }

//    public boolean sendOTP


}
