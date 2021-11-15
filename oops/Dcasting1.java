class Sup
{
	public void test()
	{
		System.out.println("test");
	}
}
class Sub extends Sup
{
	public void test()
	{
		System.out.println("overload disp");
	}
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
class Dcasting1
{
	public static void main(String[] args)
	{
	  Sup sp=new Sub();
	  Sub s=(Sub)sp;
	  s.test();//will display only overloaded function

	}
}