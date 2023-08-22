public class constructor01{
	public static void main (String[] args){
		Person p1 = new Person("smith", 80);
		System.out.println("p1的信息如下");
		System.out.println("p1对象name=" + p1.name);
		System.out.println("p1对象age=" + p1.age);

	}
}
class Person {
	String name;
	int age;

	public Person(String pName , int pAge ){

		System.out.println("构造器被调用");
		name = pName;
		age = pAge;
	}
}
