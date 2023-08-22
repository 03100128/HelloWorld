public class MethodDExercise02{
	public static void main (String[] args){
		Person p = new Person();
		p.name ="milan";
		p.age = 100;

		MyTools tools = new MyTools();
		Person p2 = tools.copyPerson(p);
		System.out.println("p1的属性 age= " + p.age + " 名字=" + p.name);
		System.out.println("p2的属性 age= " + p.age + " 名字=" + p.name);
		System.out.println("p == p2");

	}
}
class Person {
	String name;
	int age;
}
class MyTools {

	public Person copyPerson(Person p) {

		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;
		return p2;
	}
}