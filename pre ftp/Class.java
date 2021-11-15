class Class{
public static void main(String[] args) {

	stu st1=new stu("eesh",23);
	System.out.println(st1.name);
	System.out.println(st1.age);
	
}

static class stu{
	String name;
	int age;
	stu(String name,int age){
	this.name=name;
	this.age=age;}
}}