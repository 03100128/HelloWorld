public class This01{
	public static void main (String[] args){

		Dog dog1 = new Dog("��׳" , 3);
		System.out.println("dog1��hashcode=" + dog1.hashCode());
		dog1.info();

		System.out.println("==========");
		Dog dog2 = new Dog("���" , 2);
		System.out.println("dog2��hashcode=" + dog2.hashCode());
		dog2.info();


	}
}
class Dog{
	String name;
	int age;
	//public Dog(String dName , int dAge) {

	//	name = dName;
	//	age = dAge;
	//}
	public Dog(String name , int age) {

		this.name = name;
		this.age = age;
		System.out.println("this.hashCode=" + this.hashCode());
	}
	public void info(){ //��Ա����,�����Ϣ
		System.out.println("this.hashCode=" + this.hashCode());
		System.out.println(name + "\t" + age + "\t");
	}
}