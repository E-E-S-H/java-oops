class Sample extends Object
{
	public Sample(int a,int b)
	{
      System.out.println("Hi");
	}
}
class Demo extends Sample
{
  public Demo()
  {
  	super(10,12);
   System.out.println("Hello");
  }
}

class Superstatement
{
	public static void main(String[] args) {
		new Demo();
	}
}