class Logical_operators
{
	public static void main(String[] args)
	 {
		System.out.println("start");
		int a=15;
		int b=7;
		int c=2;
		boolean r;
		r=a>b && a>c;//t&&t..t
		System.out.println(r);
		r=a>b && a<c;//t&&f..f
		System.out.println(r);
		r=a<b && a>c;//f&&t..f
		System.out.println(r);
		r=a<b && a<c;//f&&f..f
		System.out.println(r);
		System.out.println("========");
		r=a>b || a>c;//t||t..t
		System.out.println(r);
		r=a>b || a<c;//t||f..t
		System.out.println(r);
		r=a<b || a>c;//f||t..t
		System.out.println(r);
		r=a<b || a<c;//f||f..f
		System.out.println(r);
		System.out.println("========");
		r=a>b ^ a>c;//t^t..f
		System.out.println(r);
		r=a>b ^ a<c;//t^f..t
		System.out.println(r);
		r=a<b ^ a>c;//f^t..t
		System.out.println(r);
		r=a<b ^ a<c;//f^f..f
		System.out.println(r);

		System.out.println("end");
	}
}