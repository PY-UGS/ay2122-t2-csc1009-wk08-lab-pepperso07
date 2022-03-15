package Wk8;

public class CheckingAccount {

	private double bal;
	private String accNo;
	
	CheckingAccount(String accNo)
	{
		this.accNo=accNo;
		this.bal=0;
	}
	
	CheckingAccount(String accNo, double bal)
	{
		this.accNo=accNo;
		this.bal=bal;
	}
	
	public void deposit(double deposit)
	{
		if (deposit>=0)
		{
			this.bal+=deposit;
		}
	}
	
	public void withdrawal(double withdraw)throws InsufficientFundsException
	{
		if (withdraw>=0)
		{
			if(withdraw>this.bal)
			{
				throw new InsufficientFundsException("Withdrawal exceeds current balance in account");
			}
			else 
			{
				this.bal-=withdraw;
			}
				
		}
	}
	
	public double getBal()
	{
		return this.bal;
	}
	
	public String getAccNo()
	{
		return this.accNo;
	}
	
	
	
}
