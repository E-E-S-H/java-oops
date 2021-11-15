class Lottry
{
	public static int l(int a,int b,int c)
	{
		if ((a+b)==10||(b+c)==10||(c+a)==10)
			return 10 ;
		else if (((a+b)-(b+c)==10)||((a+b)-(a+c)==10))
		{
			return 5;
		}
		else
		{
			return 0;
		}

	}
	public static void main(String[] args)
	 {
		int r=0;
		r=l(9,1,0);
		System.out.println(r);
		r=l(15,0,5);
		System.out.println(r);
		r=l(8,4,1);
		System.out.println(r);
	}
}