public class Main {

    public static void main(String[] args) {
        Controllers cr = new Controllers();
        User user = cr.inputData();

        String ID = cr.generateID(user);
        if (ID.equalsIgnoreCase("")) {
            System.out.println("Cannot generate ID, please input all data correctly. Here's the data you've inputted: \n" + user);
        } else {
            System.out.println("Welcome, our new member! Your ID is: " + ID);
        }
    }

}
