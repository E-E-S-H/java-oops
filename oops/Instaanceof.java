class Coustmer extends Object
{
 
}
class Admin extends Object
{

}
class Loginpage
{
  public void login(Object o)
  {
  	if(o instanceof Coustmer)
  	{
  		Coustmer c1=new Coustmer();
  		System.out.println("coustmer account created");
  	}
  	else
  	{
  		Admin a1=new Admin();
  		System.out.println("Admin account created");
  	}
  }
}
class Instaanceof
{
	public static void main(String[] args) 
	{
	Loginpage l=new Loginpage();
	Coustmer c=new Coustmer();
	Admin a=new Admin();
	l.login(a);
	l.login(c);	
	}
}