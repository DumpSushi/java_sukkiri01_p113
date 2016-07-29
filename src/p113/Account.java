package p113;

public class Account implements Comparable<Account> {
	String accountNo;

	public Account(String no)
	{
		this.accountNo = no;
	}

	public boolean equals(Object o)
	{
		if(o == this)
			return true;
		if(o==null)
			return false;
		if(!(o instanceof Account))
			return false;
		Account r = (Account)o;
		if(this.accountNo.trim().equals(r.accountNo.trim()))
			return true;
		return false;
	}

	public int compareTo(Account obj)
	{
		return this.accountNo.compareTo(obj.accountNo);
	}



}
