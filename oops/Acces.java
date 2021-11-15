class Demo
{
	public void print()
	{
		System.out.println("print");
	}
	public void count()
	{
		System.out.println("count");
		
		print();
	}
}
class Acces
{
	public static void main(String[] args) {
		new Demo().count();
	}
}