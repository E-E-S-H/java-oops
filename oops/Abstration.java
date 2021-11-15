interface User
{
	public void trans();
}

class Atm implements User
{
	public void trans()
	{
     System.out.println("ATM ");
	}
}
class Web implements User
{
	public void trans()
	{
		System.out.println("WEB");
	}
}

class Serv
{
	public User create(int pin)
	{
		if (pin==1234)
		{
			User u=new Atm();
			System.out.println("atm user object created");
			return u;
		}
		else
		{
			User u=new Web();
			System.out.println("Web user object created");
			return u;
		}
	}
}

class Abstration
{
	public static void main(String[] args) 
	{
		Serv s=new Serv();
		User u1=s.create(1234);
		u1.trans();
	}
}