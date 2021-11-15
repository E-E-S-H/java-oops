class And
{
	public void home()
{
	System.out.println("0");
}
}
class Mi extends And
{
	public void home()
	{
		System.out.println("2");
	}
}
class Nokia  extends And
{
	public void home()
	{
		System.out.println("5");
	}
}
class P1 extends And
{
	public void home()
	{
		System.out.println("10");
	}
}

class overiding2
{
	public static void main(String[] args) {
		P1 p=new P1();
		p.home();
		Mi m=new Mi();
		m.home();
		Nokia n=new Nokia();
	    n.home();
	}
}