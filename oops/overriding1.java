class W1
{
	public void deli()
	{
		System.out.println("*");
	}
}
class W2 extends W1
{
	public void deli()
	{
		System.out.println("**");
	}
}
class W3 extends W2
{
	public void deli()
	{
		System.out.println("***");
	}
}

class overriding1
{
	public static void main(String[] args) {
		W3 w1=new W3();
		w1.deli();
	}
}