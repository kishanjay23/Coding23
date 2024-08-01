package javaPackage;

public class BankSystem {
	
	
	BankSystem(String username,String password)
	{
		System.out.println(username+ " "+password);
	}

	int amt =1000;
	
	void withdraw(int wt)
	{
		amt=amt-wt;
		System.out.println("The amount after withdraw "+amt);
	}
	
	void deposit(int dep)
	{
		amt=amt+dep;
		System.out.println("The amount after the deposit "+amt);
	}
	
	int display()
	{
		return amt;
	}
	
	public static void main(String[] args) {
		// Create an object
		BankSystem a= new BankSystem("Kishan12","1234");
		a.withdraw(500);
		a.deposit(1000);
		System.out.println(a.display());
		
	}

}
