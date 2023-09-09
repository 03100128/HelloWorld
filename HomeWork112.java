public class HomeWork112{
	public static void main (String[] args){

	}
}
class Empioyee {
	String name;
	char gender;
	int age;
	String job;
	double sal;

	 public Employee(Sting job , double sal){
	 	this.job = job;
	 	this.sal = sal;
	 }
	 public Employee(String name , char gender,int age){
	 	this.name = name;
	 	this.gender = gender;
	 	this.age = age;
	 }
	 public Employee(String name , char gender,int age ,Sting job , double sal) {
	 	this(name , gender, age);
	 	this.job = job;
	 	this.sal = sal;
	 }
}  
