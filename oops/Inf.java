interface Runn{
	int a=10;
     public void disp();
}
interface Run1 extends Runn{
	int b=5;
	public void comm();
}
class One implements Run1
{
	public void comm()
	{
		System.out.println("comm");

	}
	public void disp()
	{
		System.out.println("disp");
	}
}
class Inf
{public static void main(String[] args) {
   One o=new One();
   o.disp();
   o.comm();
   System.out.println(o.a);
   System.out.println(o.b); 

?\\\\\\\\\\\\\\/``