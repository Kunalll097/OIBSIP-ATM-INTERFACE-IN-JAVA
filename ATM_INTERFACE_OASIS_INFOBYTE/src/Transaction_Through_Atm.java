import java.util.Scanner;

class Transaction_Through_Atm{
    static void Withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Enter Amount to Withdraw :-");
        int WD_cash=sc.nextInt();
        if(WD_cash<=ATM.Balance){
            ATM.Balance=ATM.Balance-WD_cash;
            ATM.history.add(Integer.toString(WD_cash));
            ATM.history.add("Withdraw");
            System.out.println("Amount of Rs"+WD_cash+"/-Withdraw Successfully");
            System.out.println("-------------------------------------------");
        }
        else{
            System.out.println("Insufficient Balance to Withdraw The Cash");
            System.out.println("-----------------------------------------");
        }
        ATM.prompt();
    }
    static void Deposit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.print("Enter Amount to Deposit :-");
        int De_cash=sc.nextInt();
        ATM.Update_Acc_balance(De_cash);
        ATM.history.add(Integer.toString(De_cash));
        ATM.history.add("Deposit");
        System.out.println("Amount of Rs."+De_cash+"/- Deposit Successful!");
        System.out.println("-----------------------------");
        ATM.prompt();
    }
    static void Transfer(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Receiving Body:");
        String s=sc.nextLine();
        System.out.println("Enter the Account Number of The Receiving Body");
        int num=sc.nextInt();
        System.out.println("Enter the Amount To Be Transferred :");
        int Tr_cash=sc.nextInt();
        if(Tr_cash<=ATM.Balance){
            ATM.Balance=ATM.Balance-Tr_cash;
            ATM.history.add(Integer.toString(Tr_cash));
            ATM.history.add("Transferred");
            System.out.println("Amount of Rs."+Tr_cash+"/- Transferred Successfully");
            System.out.println("------------------------------------------------");
        }
        else{
            System.out.println("Insufficient Balance To Transfer The Cash");
            System.out.println("-----------------------------------------");
        }
    }
}
