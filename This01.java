public class This01{
	public static void main (String[] args){

		Dog dog1 = new Dog("大壮" , 3);
		System.out.println("dog1的hashcode=" + dog1.hashCode());
		dog1.info();

		System.out.println("==========");
		Dog dog2 = new Dog("大黄" , 2);
		System.out.println("dog2的hashcode=" + dog2.hashCode());
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
	public void info(){ //成员方法,输出信息
		System.out.println("this.hashCode=" + this.hashCode());
		System.out.println(name + "\t" + age + "\t");
	}
}