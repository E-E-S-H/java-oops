class Flipcart
{
public void login()
{
	System.out.println("loged in---");
}
public void logout()
{
	System.out.println("logout");
}
}
class Electronics extends Flipcart
{
 public void e()
 {
 	System.out.println("mobiles");
 	System.out.println("laptop");
 }
}
class Grosaries extends Flipcart
{
 public void g()
 {
 	System.out.println("vegitables");
 	System.out.println("fruits");
 }
}
class Clothes extends Flipcart
{
 public void c()
 {
 	System.out.println("westren");
 	System.out.println("treditional");
 }
}
class Mobile extends Electronics
{
 public void m()
 {
 System.out.println("apple");
 System.out.println("oneplus");
 }
}
class Laptop extends Electronics
{
 public void l()
 {
 	System.out.println("HP");
 	System.out.println("dell");
 }
}
class Hybrid
{
	public static void main(String[] args) {
	Laptop x=new Laptop();
	x.login();
	x.e();
	x.l();
	Grosaries g1= new Grosaries();
	g1.g();
	g1.logout();
}}