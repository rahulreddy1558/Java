package ch01;

public class CreditCard{
    private String customer;
    private String bank;
    private String account;
    private int limit;
    private double balance;


    CreditCard(String cust,String bk, String acct,int lim, double initialbal){
        this.customer = cust;
        this.bank = bk;
        this.account = acct;
        this.limit = lim;
        this.balance = initialbal;

    }

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }


    public static void main(String[] args) {
        CreditCard[] wallet = new CreditCard[3];



    }

}
