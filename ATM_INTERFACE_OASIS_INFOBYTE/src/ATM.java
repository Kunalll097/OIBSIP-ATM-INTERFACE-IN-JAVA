import java.util.*;

public class ATM {
    public static String name;
    public static int Balance=0;
    public static String AccNumber;
    public static ArrayList<String> history=new ArrayList<String>();

    static void Update_Acc_balance(int De_cash){
        Balance=Balance+De_cash;
    }
    static void Show_Acc_balance(){
        System.out.println(Balance);
    }
    public static void homepage(){
        Scanner sc=new Scanner(System.in);

        System.out.println("-----WELCOME TO ATM INTERFACE-----");
        System.out.println("----------------------------------");
        System.out.println("Select The options :-");
        System.out.println("1. Please! Register Your Details...");
        System.out.println("2. Login \n\tEnter your Details");
        System.out.println("3. Exit");
        System.out.println("Enter choice :- ");
        int choice =sc.nextInt();
        if (choice==1){
            Bank_account.Register();
        }
        else if(choice == 2)
        {
            System.out.println("Enter your Account Number :-");
            int an = sc.nextInt();

            if (an == 4702 )
            {
                System.out.println("Enter Password :-");
                String pa = sc.next();

                if ( pa.equals("Lade") )
                {
                    ATM.prompt();
                }
                else
                {
                    System.out.println("---->Enter Correct Password<----");
                }
            }
            else
            {
                System.out.println("----> Enter Correct Account Number <----");
            }
        }
        else {
            if(choice==3){
                System.exit(0);
            }
            else{
                System.out.println("Select a value only from the given options :");
                homepage();
            }
        }
    }
    static void prompt(){
        Scanner sc=new Scanner(System.in);
        System.out.println("--WELCOME "+ATM.name+"! TO ATM SYSTEM");
        System.out.println("--------------------------------");
        System.out.println("Select option :- ");
        System.out.println("1. Check balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Transfer");
        System.out.println("5. Transaction History");
        System.out.println("6. Exit");
        System.out.print("Enter your choice : ");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                CheckBalance_Of_Acc.CheckBalance();
            case 2:
                Transaction_Through_Atm.Deposit();
            case 3:
                Transaction_Through_Atm.Withdraw();
            case 4:
                Transaction_Through_Atm.Transfer();
            case 5:
                History_Of_Acc.Transaction_History();
            case 6:
                System.exit(0);
        }
    }

}
