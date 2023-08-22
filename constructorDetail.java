public class constructorDetail{
	public static void main (String[] args){

		Person p1 = new Person("king" , 40 );
		Person p2 = new Person("tom"  );

		Dog dog1 = new Dog();
	}
}
class Dog{

}
class Person{
	String name;
	int age;
	public Person(String pName , int pAge ){
		name = pName;
		age = pAge;
	}
	public Person(String pName ){
		name = pName;
		
	}
}