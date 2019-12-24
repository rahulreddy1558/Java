package IntrotoDSwithJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Bank {
    private Map<Integer,Integer> accounts = new HashMap<Integer,Integer>();
    private double rate = 0.01;
    private int nextacct = 0;

    public int newAccount(){
        int account = ++nextacct;
        accounts.put(account,0);
        return account;
    }

    public int getBalance(int acct){
        return accounts.get(acct);
    }

    public boolean deposit(int acctnum, int amount){
        if(accounts.get(acctnum) == null || amount < 0) return false;
        int initialamount = accounts.get(acctnum);
        accounts.put(acctnum,initialamount + amount);
        return true;
    }

    public boolean authorization(int acctnum,int amount){
       int balance = accounts.get(acctnum);
       return amount <= balance/2;
    }

    public void addInterest(){
        Set<Integer> accts = accounts.keySet();
        for(Integer acct: accts){
            int amount = accounts.get(acct);
            amount = amount + (int)(amount * rate);
            accounts.put(acct,amount);
        }
    }


    @Override
    public String toString(){
       Set<Integer> sk = accounts.keySet();
       StringBuilder sb = new StringBuilder("");
       System.out.println("Total Number of accounts in Bank");

       for(Integer s : sk){
         sb.append(s).append(" : ").append(accounts.get(s)).append("\n");
       }
       return sb.toString();
    }


//    public static void main(String[] args) {
//        Bank bk = new Bank();
//        bk.newAccount();
//        bk.newAccount();
//        bk.deposit(1,2000);
//        bk.addInterest();
//        System.out.println(bk.toString());
//    }




}
