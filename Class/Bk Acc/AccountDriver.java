//Olga Ingabire
//Cedric Rutijana
import java.util.*;
public class AccountDriver
{
	public static void main(String [] args)
	{
		
		Account []a3= new Account[6];
		a3[0]= new Savings("Checking Bob",101,400.00, 5.9);
		a3[1]= new Checking("Checking Bob",101,400.00, 50.76);;
		a3[2]= new Loan("Checking Bob",101,400.00, 5.9, 2.4, 900);
		a3[3]= new MoneyMarket("Checking Bob",101,400.00, 5.9, 4);
		a3[4]= new Mortage("Checking Bob",101,400.00, 5.9, 2.4, 900, "\n 167s 89w \n cedar city \n ut 84740");
		a3[5]= new CD("Checking Bob",101,400.00, 5.9, 200, 7.8);
		//Scanner scn= new Scanner(System.in);
		Checking c2= new Checking();
		Savings s2= new Savings();
		MoneyMarket m2= new MoneyMarket(); 
		Loan l2= new Loan();
		Mortage n2= new Mortage();
		CD d2= new CD();

		System.out.println("Welcome to Java Banking");
		
		for(Account h: a3){
			if((h instanceof Account) == true){
				h.printAccount();
			    System.out.println(" ");
			}
			
		}
		
		//System.out.println(a3[4] instanceof Savings);

		/*System.out.println("Please Choose the Account type you'd like to view:");
		System.out.println("1. Basic Account Details");
		System.out.println("2. Checking Account Details");
		System.out.println("3. Savings Account Details");
		System.out.println("4. Money Market Account Details");
		System.out.println("5. Loan Account Details");
		System.out.println("6. Mortage Account Details");
		System.out.println("7. CD Account Details");
		int ans= scn.nextInt();
		
		switch (ans){
			case 1:
		     //	Account a1= new Account("Checking Bob",101,400.00);
		       Account a2= new Checking();
				System.out.println("Basic Account Details:");
			   a2.printAccount();
			
			break;
			
			case 2:
			    Checking c1= new Checking("Checking Bob",101,400.00, 50.76); //(String name, int accountNum, double balance, double Withdraw){
				Checking c2= new Checking();
		        System.out.println("Checking Account Details:");
		        c1.printAccount();
				//c1.bal();
			
			break;
			
			case 3:
			Savings s1= new Savings("Checking Bob",101,400.00, 5.9);
			Savings s2= new Savings();
		    System.out.println("Savings Account Details:");
		    s1.printAccount();
			break;
			
			case 4:
			MoneyMarket m1= new MoneyMarket("Checking Bob",101,400.00, 5.9, 4); 
			MoneyMarket m2= new MoneyMarket(); 
	     	System.out.println("MoneyMarket Account:");
	    	m1.printMoneyMarket();
			break;
			
			case 5:
			Loan l1= new Loan("Checking Bob",101,400.00, 5.9, 2.4, 900);
		    Loan l2= new Loan();
		    System.out.println("Loan Account:");
		    l1.printLoan();
			break;
			
			case 6:
			Mortage n1= new Mortage("Checking Bob",101,400.00, 5.9, 2.4, 900, "\n 167s 89w \n cedar city \n ut 84740");
			Mortage n2= new Mortage();
		    System.out.println("Mortage Account:");
		    n1.printMortage();
			
			break;
			
			case 7:
		        CD d1= new CD("Checking Bob",101,400.00, 5.9, 200, 7.8);
				CD d2= new CD();
		        System.out.println("CD Account:");
		        d1.printCD();
			break;
			
			default:
			System.out.println("Wrong innput, please enter choose within 1-7 Range");
			
		}*/
		


		//1. Implement all objects below
		//2. Create objects of each class and do a trace
		//3. Imlement print methods in each object
		//4. Create a client and give them an account
		
	}
}


abstract class Account 
{
	
	abstract double withdraw(double Wdraw);/*{
		balance = balance - amount;
		return(balance);
	}*/
	
	protected String name;
	protected int accountNum;
	protected double balance;
	
	public Account(){
		name=null;
		balance=0;
		accountNum=0;
	}
	
	public Account(String name, int accountNum, double balance){
		this.name=name; this.accountNum=accountNum; this.balance=balance;
	}
	
	
	final double getBalance(){
		return balance;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	final void setBalance(double balance){
		this.balance=balance;
	}
	
	public void printAccount()
	{
	    System.out.println("Name = " + name);
	    System.out.println("Account Number = " + accountNum);
	    System.out.println("Balance = " + balance);
	}

}

/*a check is an object with an id and amount*/
class Check{
	private String id;
	private int amount;
	
}

/* checking is an account with a check array of size 10*/
class Checking extends Account{
	private Check[] cArray;
	private double WDraw;
	public Checking(){
		super();
		cArray= new Check[10];
	}
	public Checking(String name, int accountNum, double balance){
		super(name, accountNum, balance);
		cArray= new Check[10];
		//withdraw=0;
	}
	public Checking(String name, int accountNum, double balance, Check[] cArray){
		super(name, accountNum, balance);
		this.cArray= cArray;
		//withdraw=0;
	}
	public Checking(String name, int accountNum, double balance, double Withdraw){
		super(name, accountNum, balance);
		WDraw= withdraw(Withdraw);
	}
	
	double withdraw( double amount){
	    balance = balance - amount;
	    return(balance);
	}
	
	/*public void bal(){
		System.out.println(super.getBalance());
	}*/
	
	public void updateName(String name){
	    super.setName(name); // or 	this.name= name; if we use protected instead of private
	}
	
	public void printAccount(){
		super.printAccount();
		//System.out.println("Balance  After Withdrawal= "+WDraw);
	}
	
}

/* savings is an account with an interest rate and accure interest method*/
class Savings extends Account{
	private double iRate;
	
	public Savings(){
		super();
		iRate=.5;
	}
	
	public Savings(String name, int accountNum, double balance, double iRate){
		super(name,accountNum,balance);
		this.iRate= iRate;
	}
	
	public double accure(){
		double r = balance*iRate;
		return(r+balance);
	}
	
	public void printAccount(){
		super.printAccount();
		System.out.println("Interest Rate= "+iRate);
		System.out.println("New balance after Interest= "+accure());
	}
	
	double withdraw( double amount){
	    balance = balance - amount;
	    return(balance);
	}
	
	
}

/*MoneyMarket is a savings account with a withdrawl limit*/
class MoneyMarket extends Savings{
	private int wLmt;
	
	public void printMoneyMarket(){
		super.printAccount();
		System.out.println("Withdrawal Limit= "+wLmt);
		//System.out.println("New Balance after Withdrawal= "+Withdraw());
	}
	
	public MoneyMarket(){
		super();
		wLmt = 100;
		super.withdraw(wLmt);
	}
	
    /*public double Withdraw(){// void because of the one in account class withdraw(double amount)
	     //if (limit>0)
		//super.withdrawal(amount);
	     // else
			 //System.out.println("Over limit");
		double borrow= balance-wLmt;
		return(borrow);
		
	}*/
	
	public MoneyMarket(String name, int accountNum, double balance, double iRate, int wLmt){
		super(name, accountNum, balance, iRate);
		this.wLmt= wLmt;
		super.withdraw(wLmt);
	}
}

/*Client is an individual with an account*/
class Client{
	private Account C1;
	/*private Account Name;
	private Account AccountNumber;
	private Account Balance;
	
	public void setName(Account Name){
		this.Name=Name;
	}
	
	public void setAcNbr(Account ActNbr){
		AccountNumber=ActNbr;
	}
	
	public void setBalance(Account Blc){
		Balance=Blc;
	}
	
	public Account getName(){
		return (this.Name);
	}
	
	public Account getAcNbr(){
		return (this.AccountNumber);
	}
	
	public Account getBlc(){
		return (this.Balance);
	}
	
	public void printClient(){
		System.out.println("Client Name: "+Name);
		System.out.println("Client Account Number: "+AccountNumber);
		System.out.println("Client Account Balance: "+Balance);
	}
	public Client(){
		Name = getName();
		AccountNumber = getAcNbr();
	    Balance= getBlc();
	}
	public Client(Account uni){
		this.Name= Name;
		this.AccountNumber= AccountNumber;
		this.Balance= Balance;
	}*/
}

//A loan is an account that has a balance, interest rate, and duration.
class Loan extends Account{
	private double lRate;
	private double duration;
	private int Amount;
	
	public void setLRate(double lRate){
		this.lRate=lRate;
		
	}
	public void setDuration(double duration){
		if(duration%12==1){
			double r= duration/12;
			this.duration=r;
		}
		else{
			this.duration=duration;
		}
		
	}
	public void setAmt(int Amount){
		if (Amount<0){
		    this.Amount= Amount*-1;
		}
		else{
			this.Amount= Amount;
		}
	
	}
	
	public void getLRate(){
		System.out.println(lRate);
	}
	public void getDuration(){
		System.out.println(duration);
	}
	public void getAmt(){
		System.out.println(Amount);
	}
	
	public double LoanInterest(){
		double r= Amount*duration*(lRate/100);
		return r;
	}
	
	public void printLoan(){
		super.printAccount();
		System.out.println("Loan Amount= "+Amount);
		System.out.println("Loan Rate= "+lRate);
		System.out.println("Loan Duration= "+duration);
		System.out.println("Loan Interest per year= "+LoanInterest());
	}
	
	public Loan(){
		super();
		lRate=13;
		duration=0;
		Amount=0;
	}
	
	public Loan(String name, int accountNum, double balance,double lRate, double duration, int amount){
		super(name, accountNum, balance);
		setLRate(lRate);
		setDuration(duration);
		setAmt(amount);
	}
	
	double withdraw( double amount){
	    balance = balance - amount;
	    return(balance);
	}
	
}

//A mortgage is a loan that also has an address.
class Mortage extends Loan{
	private String Address;
	
	public void printMortage(){
		super.printLoan();
		System.out.println("Mortage Address: "+Address);
	}
	
	public Mortage(){
		super();
		Address= " ";
	}
	
	public Mortage(String name, int accountNum, double balance,double lRate, double duration, int amount, String address){
		super(name, accountNum, balance, lRate, duration, amount);
		Address= address;
		
	}
}

//A CD is a savings account with a maturity date. 
class CD extends Savings{
	private double mYear;
	
	public void printCD(){
		super.printAccount();
		System.out.println("Mature Year: "+mYear);
	}
	
	public CD(){
		super();
		mYear=0;
	}
	
	public CD(String name, int accountNum, double balance, double iRate, int wLmt, double mYear){
		super(name, accountNum, balance, iRate);
		this.mYear=mYear;
		super.withdraw(wLmt);
		
		
	}
	
}
