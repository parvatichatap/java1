package assigment.Problem;

import java.util.Scanner;

public class Account {
   private static long accountNo;
   private static String accountType;
    private  static  double balance;
    private static String username;
      private  static  String bankName;

   public static  void addAccount(){
       accountNo =112233445566l;
       accountType="savings";
       balance=2000.0;
       username="parvati";
       bankName="SBI";


    }
    public static void   displayData(){
        System.out.println("Account Details");
        System.out.println("Account Number : " +accountNo);
        System.out.println("Account Type :- " +accountType);
        System.out.println("Balance :- " +balance);
        System.out.println("username : " +username);
        System.out.println(" Bank Name :- "+bankName);
    }

   public static  void withdrawMoney(double amount){
       if (amount <= balance){
           balance-= amount;
           System.out.println("withdrawal successful");
           System.out.println("Balance after withdrawal :" +balance);

       }
       else {
           System.out.println("Insufficient balance.");
       }

    }

    public  static void depositMoney(double amount){
       balance += amount;
        System.out.println("Deposit successful.");
        System.out.println("Balance after deposit:" + balance);
    }

    public static void main(String[] args) {
        addAccount();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nSelect an option:");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    withdrawMoney(withdrawAmount);
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    depositMoney(depositAmount);
                    break;
                case 3:
                    displayData();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Wrong choice.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}
