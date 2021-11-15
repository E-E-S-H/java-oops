class Incriment
{
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int r1,r2;
		System.out.println(a);
		System.out.println(b);
		//++a ;
		System.out.println("--------");
		r1=++a+10;
		r2=b++ + 10;
		//b++ ; post
		System.out.println(r1);
		System.out.println(r2);
		System.out.println("--------");
		System.out.println(a);
		System.out.println(b);
	}
}