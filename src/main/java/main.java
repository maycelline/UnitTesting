import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String NIK;
        String name;
        String address;
        String gender;
        String phoneNumber;
        String email;
        String age;
        int ageConv;
        String choosenPackage;

        System.out.println("Create Library ID Menu\n" +
                "================================");

        System.out.print("NIK: ");
        NIK = sc.nextLine();

        System.out.print("Name: ");
        name = sc.nextLine();

        System.out.print("Phone Number: ");
        phoneNumber = sc.nextLine();

        System.out.print("Email: ");
        email = sc.nextLine();

        System.out.print("Address: ");
        address = sc.nextLine();

        System.out.print("1. Male\n" +
                "2. Female\n" +
                "Gender: ");
        gender = sc.nextLine();


        System.out.print("Age: ");
        age = sc.nextLine();
        ageConv = Integer.parseInt(age);

        System.out.print("1. Packet A: 200k/month. Free access to coworking space, meeting space, and podcast space.\n" +
                "2. Packet B: 150k/month. Free access to coworking space and meeting space.\n" +
                "3. Packet C: 50k/month. Free access only to book room and coworking space with limit 2 times in a week.\n" +
                "Choose ur package");
        choosenPackage = sc.nextLine();



//        Testing aja gan

        System.out.println();
        System.out.println();
        System.out.println("================");
        System.out.println("NIK: "+NIK);
        System.out.println("NAME: "+name);
        System.out.println("ADDRESS: "+address);
        System.out.println("PHONE NUMBER: "+phoneNumber);
        System.out.println("EMAIL: "+email);
        System.out.println("AGE: "+age);



    }
}
