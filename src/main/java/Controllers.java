import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controllers {
    User user = new User();
    boolean userValid = true;

    public User inputData() {
        Scanner sc = new Scanner(System.in);
        String NIK;
        String name;
        String address;
        String gender;
        String phoneNumber;
        String email;
        String age;

        System.out.println("Create Library ID Menu\n" +
                "================================");

        // Input NIK
        System.out.print("NIK: ");
        NIK = sc.nextLine();
        user.setNIK(NIK);

        // Input Name
        System.out.print("Name: ");
        name = sc.nextLine();
        user.setName(name);

        // Input Phone Number
        System.out.print("Phone Number: ");
        phoneNumber = sc.nextLine();
        user.setPhoneNumber(phoneNumber);

        // Input Email
        System.out.print("Email: ");
        email = sc.nextLine();
        user.setEmail(email);

        // Input Address
        System.out.print("Address: ");
        address = sc.nextLine();
        user.setAddress(address);

        // Input Gender
        System.out.print("""
                1. Male
                2. Female
                Gender:\s""");
        gender = sc.nextLine();
        switch (gender) {
            case "1" -> user.setGender("Male");
            case "2" -> user.setGender("Female");
            default -> user.setGender("Not Defined");
        }


        // Input Age
        System.out.print("Age: ");
        age = sc.nextLine();
        if (numberValidate(age)) {
            user.setAge(Integer.parseInt(age));
        } else {
            user.setAge(0);
        }

        return user;
    }

    public boolean numberValidate(String string) {
        return string.matches("[0-9]+");
    }

    public boolean validateNIK(String NIK) {
        // check if length == 16 and only contain number
        if (NIK.length() == 16 && numberValidate(NIK)) {
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
        return code;
    }

    public boolean validateEmail(String email) {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        }
        return matcher.matches();
    }

    public String generateID(User user) {
        LocalDateTime localDate = LocalDateTime.now();
        String codeGender = codeByGender(user.getGender());

        String ID;
        // Validate NIK
        if (!validateNIK(user.getNIK()) && !numberValidate(user.getNIK())) {
            userValid = false;
        }

        // Validate Email
        if (!validateEmail(user.getEmail())) {
            userValid = false;
        }

        // Validate gender
        if (user.getGender() == null) {
            userValid = false;
        }

        // Validate Phone Number
        if (!numberValidate(user.getPhoneNumber())) {
            userValid = false;
        }

        if (userValid) {
            ID = user.getNIK().substring(13) + localDate.getYear() + codeGender;
        } else {
            ID = "";
        }

        return ID;

    }

}
