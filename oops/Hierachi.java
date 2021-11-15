class Acc
{
	long acn;
	double bal;
	String name;
	public void depo(double a)
	{
     bal=bal+a;
     System.out.println(bal);
	}
	public void draw(double a)
	{
     bal=bal-a;
     System.out.println(bal);
	}
}
class Current extends Acc{

  double minbal=5000.0;
  public void minbal()
  {
  	System.out.println(minbal);
  }
}


class Save extends Acc{

  double roi=0.02;
  public void croi()
  {
  	bal=bal*roi;
  	System.out.println(bal);
  }
}
class Hierachi 
{
	public static void main(String[] args) {
		Current c=new Current();
		c.minbal();
		Save s=new Save();
		s.depo(5000);
		s.croi();
	}
}