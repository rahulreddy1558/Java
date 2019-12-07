package IntrotoDSwithJava;

import java.util.Scanner;

public class BankClient {
    Bank bank = new Bank();
    int current = -1;
   private boolean runstatus = false;
    Scanner scanner = new Scanner(System.in);

    void run(){
        while(!runstatus) {
            System.out.println("Enter a number: ");
            int cnum = scanner.nextInt();
            processrun(cnum);
        }
    }

    private void processrun(int cnum){
        switch (cnum){
            case 0:
               quit();
               break;
            case 1:
                newaccount();
                break;
            case 2:
                select();
                break;
            case 3:
                deposit();
                break;
            case 5:
                showall();
                break;
            case 6:
                addinterest();
                break;
                default:
                    System.out.println("please enter any number 0-6");


        }

    }

    private void quit(){
        runstatus = true;
        System.out.println("Good Bye!");
    }
    private void newaccount(){
    current = bank.newAccount();
    System.out.println("Your account number is "+current);
    }

    private void select(){
        System.out.println("Enter your account number ##");
        int acct = scanner.nextInt();
        int balance = bank.getBalance(acct);
        System.out.println("The balance of the account "+balance);
    }

    private void authorizeloan(){
        System.out.println("Enter loan amount: ");
        int amt = scanner.nextInt();
        if(bank.authorization(current,amt)) System.out.println("Your loan approved");
        else System.out.println("Your loan declined");
    }

    private void deposit(){
        System.out.println("Enter the amount: ");
        int amt = scanner.nextInt();
        bank.deposit(current,amt);

    }

    private void showall(){
        System.out.println(bank.toString());
    }

    private void addinterest(){
        bank.addInterest();
    }

}
