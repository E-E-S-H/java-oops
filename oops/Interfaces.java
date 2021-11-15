interface Run
{
	int a= 10;
	public void test();

}
interface Run2 extends Run
{
	public void disp();
}
class Demo implements Run1
{
	 public void disp()
	 {
	 	System.out.println("disp");
	 }
     public void test()
     {
     	System.out.println("test");
     }
}
class interfaces
{
	public static void main(String[] args) {
		Demo d=new Demo();
		d.disp();
		d.test();
	}
}