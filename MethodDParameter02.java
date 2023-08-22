public class MethodDParameter02{
	public static void main (String[] args){

		B b =new B();
		//int[] arr ={1,2,3};
		//b.test100(arr);

		 //System.out.println("main的 arr数组");
		//for(int i = 0; i < arr.length; i++) {
		 //		System.out.print(arr[i] + "\t");
		// }

		 //System.out.println();

		 Person p = new Person();
		 p.name = "jack" ;
		 p.age =10;

		 b.test200(p);
		 //测试test200，p为空输出为10
		 System.out.println("main 的p.age=" + p.age);

	}
}
class Person {
	String name;
	int age;
}
class B {

	public void test200(Person p){
		//p.age = 10000;
		//p = null;
		p = new Person();
		p.name = "tom";
		p.age = 99;
	}


	public void test100(int[] arr) {

		 arr[0] = 200;

		 System.out.println("test100的 arr数组");
		 for(int i = 0; i < arr.length; i++) {
		 		System.out.print(arr[i] + "\t");
		 }

		 System.out.println();
	}
}