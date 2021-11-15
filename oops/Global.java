class Global
{
	static int v1=34
	;
	public  void disp()
	{
	 int v1=10;
	System.out.println(v1);
	System.out.println(this.v1);
     }
     public static void main(String[] args) {
     	Global v=new Global();
     	v.disp();
     }
}