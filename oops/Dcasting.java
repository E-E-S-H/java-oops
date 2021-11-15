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
class Sub1 extends Sub
{
	public void count()
	{
		System.out.println("count");
	}
}


class Dcasting
{
	public static void main(String[] args) 
	{
	//   Sub s1 =new Sub();
	//   Sup sp1=s1;
	//   sp1.test();
	//   Sub s2=(Sub)sp1;
	//   s2.test();
	//   s2.disp();	
	// }
       Sub s1=new Sub();
       Sub1 s2= (Sub1)s1;
}
}