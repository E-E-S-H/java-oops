class Lottry2
{
	public static int l(int a, int b, int c)
	{
		if (a==2 &&(a==b && b==c && c==a) )
		{
			return 10;

		}
		else if ((a==b && b==c && c==a)) 
		{
			return 5;
		}
		else if (a!=b && a!=c)
		 {
			return 1;

		}
		else{
			return 0;
		}
	}
	public static void main(String[] args) {
		int r=0;
		r=l(1,1,1);
		System.out.print(r);
	}
}