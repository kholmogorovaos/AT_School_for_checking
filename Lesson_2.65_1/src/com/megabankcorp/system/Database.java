package com.megabankcorp.system;
import com.megabankcorp.records.Account;
public class Database {
    public void deposit (Account accountNumber, Account accountAmount) {

    }
    public void withdraw(Account accountNumber, Account accountAmount) {

    }
    protected void getAmount(Account personId, Account accountNumber, Account accountAmount){

    }
    void transfer(Account accountNumber, Account accountAmount){
        Database database = new Database();
        database.withdraw(accountNumber, accountAmount);
        database.deposit(accountNumber, accountAmount);
    }
}
