interface Map
{

    public void sun(int time);
    public void route();

}
class Human implements Map
{
	public void sun(int time)
	{
		if(time>6 && time<18)
		{
			System.out.println("white");
		}
		else{
			System.out.println("dark");
		}
	}
	public void route()
	{
		System.out.println("go this weay");
	}
}
class Comp implements Map
{
	public void sun(int time)
	{
		System.out.println("none");
	}
	public void route()
	{
		System.out.println("gothis weay");
		System.out.println("cost");
	}
}
 class S
 {
 	public Map cre(int id)
 	{
 		if(id<100)
 		{
 			Map u=new Comp();
 			return u;
 		}
 		else {
 			Map u= new Human();
 			return u;
 		}
 	}
 }




class Abstration2
{
	public static void main(String[] args)
	 {
	   S s =new S();
	   Map u1 =s.cre(55);
	   u1.sun(9);	
	   u1.route();
	}
}