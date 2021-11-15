class Sup
{
	public void test()
	{
		System.out.println("test");
	}
}
class Sub extends Sup
{
	public void disp()
	{
		System.out.println("disp");
	}
}
class View extends Sup
{
	public void view()
	{
		System.out.println("view");
	}
}
class Dcasting2
{
	public static void main(String[] args) 
	{
	  Sub s1=new Sub();
	  Sup sp=s1;
	  View v= (View) sp;//it will throw classcast exception	
	}
}