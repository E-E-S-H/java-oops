class Wa1
{
	public void msg()
	{
		System.out.println("text");
	}
}
class Wa2 extends Wa1
{
	public void audio()
	{
		System.out.println("audio");
	}
}
// class Wa3 extends Wa2
// {

// 	public void vedio()
// 	{
// 		System.out.println("vedio");
// 	}
// }

class Multilevel
{
	public static void main(String[] args) {
		Wa3 w1=new Wa3();
		w1.msg();
		w1.audio();
        //w1.vedio();
         Wa2 w2=new Wa2();
         w2.audio();
        	}
}