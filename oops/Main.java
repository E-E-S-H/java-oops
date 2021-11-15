class Sample
{
	static int a=14;
	public static void test()
	{
		System.out.println("test");

	}
	public static void count()
	{
		test();
		System.out.println("count");
	}
}
class Main
{
	public static void main(String[] args) {
		Sample.test();
		System.out.println(Sample.a);
		System.out.println("");
		Sample.count();
	}
}