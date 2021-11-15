class Var
{
	static int v1;
	public void disp()
	{
		int v2=12;
		System.out.println(v1);
		System.out.println(v2);
	}
	public static void main(String[] args) {
		Var v=new Var();
		v.disp();
		System.out.println(v1); 
	}
}