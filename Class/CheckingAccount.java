/*
import java.io.*;

public class trial {
   private double balance;
   private int number;
   
   public trial(int number) {
      this.number = number;
   }
   
   public void deposit(double amount) {
      balance += amount;
   }
   
   public void withdraw(double amount) throws InsufficientFundsException {
      if(amount <= balance) {
         balance -= amount;
      }else {
         double needs = amount - balance;
         throw new InsufficientFundsException(needs);
      }
   }
   
   public double getBalance() {
      return balance;
   }
   
   public int getNumber() {
      return number;
   }
}
import java.io.*;

public class trial extends Exception {
   private double amount;
   
   public trial(double amount) {
      this.amount = amount;
   }
   
   public double getAmount() {
      return amount;
   }
}*/


import java.io.*;
public class CheckingAccount{
	private double balance;
	private int number;
	public CheckingAccount(int number){
		this.number = number;
	}
	public void deposit(double amount){
		balance += amount;
	}
	
	public void withdraw(double amount)throws InsufficientFundsException{
		if(amount <= balance){         balance -= amount;}else{double needs = amount - balance; throw new InsufficientFundsException(needs);}} public double getBalance()
{return balance;}
public int getNumber(){return number;}}