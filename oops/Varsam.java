class Varsam
{
	static int a;
	public void display()
	{
		int a=12;
		System.out.println(a);
		System.out.println(Varsam.a);
		
	}
	public static void main(String[] args) {
		Varsam v=new Varsam();
		v.display();
		System.out.println(a); 
	}
}