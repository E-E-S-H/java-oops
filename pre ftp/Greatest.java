class Greatest{
	public static int g(int a,int b,int c)
	{
		System.out.println("input:-  "+a+","+b+","+c);
		if (a>b && a>c)
		{
			return a ;
		}
		else if (b>a && b>c) 
		{
		 	return b;
		 } 
		else
		{
			return c;
		}
	}
	public static void main(String[] args) {
		int r=0;
		r= g(3,5,10);
		System.out.println("greatest no:- "+r);

	}
}