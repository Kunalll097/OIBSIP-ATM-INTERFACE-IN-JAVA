import java.util.Scanner;

class Bank_account {
    static void Register() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("Enter your Name :-");
        ATM.name = sc.nextLine();
        System.out.println("Enter Username :-");
        String user = sc.nextLine();
        System.out.println("Enter Password :-");
        String pass = sc.nextLine();
        System.out.println("Enter your Account number :-");
        ATM.AccNumber = sc.nextLine();
        System.out.println("REGISTRATION SUCCESSFULLY!!!...");
        System.out.println("--------------------------------");
        ATM.prompt();
        while (true) {
            display(ATM.name);
            int choice = sc.nextInt();
            if (choice == 1) {
                login(user, pass);
                break;
            } else {
                if (choice == 2) {
                    System.exit(0);
                } else {
                    System.out.println("Bad value! Enter Again!");
                }
            }
        }
    }
    static void display(String name){}
    static void login(String user,String pass){}
}
