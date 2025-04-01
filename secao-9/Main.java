import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int account_number;
        String account_holder;

        System.out.print("Enter account number: ");
        account_number = sc.nextInt();

        System.out.print("Enter account holder: ");
        account_holder = sc.next();

        System.out.print("Is there an initial deposit (y/n)? ");
        String is_there_initial_deposit;
        is_there_initial_deposit = sc.next();

        BankAccount new_ba = null;
        if (is_there_initial_deposit.equals("y")){
            System.out.print("Enter initial deposit value: ");
            double initial_deposit = sc.nextDouble();

            new_ba = new BankAccount(account_number, account_holder, initial_deposit);

        } else {
            new_ba = new BankAccount(account_number, account_holder);
        }

        System.out.printf("\nAccount data:\n" + new_ba + "\n\n");

        System.out.print("Enter a deposit value: ");
        double deposit_value = sc.nextDouble();
        new_ba.deposit(deposit_value);
        System.out.printf("Updated account data:\n" + new_ba + "\n\n");

        System.out.print("Enter a withdraw value: ");
        double withdraw_value = sc.nextDouble();
        new_ba.withdraw(withdraw_value);
        System.out.printf("Updated account data:\n" + new_ba + "\n\n");

        sc.close();

    }
}