public class MethodDParameter02{
	public static void main (String[] args){

		B b =new B();
		//int[] arr ={1,2,3};
		//b.test100(arr);

		 //System.out.println("main�� arr����");
		//for(int i = 0; i < arr.length; i++) {
		 //		System.out.print(arr[i] + "\t");
		// }

		 //System.out.println();

		 Person p = new Person();
		 p.name = "jack" ;
		 p.age =10;

		 b.test200(p);
		 //����test200��pΪ�����Ϊ10
		 System.out.println("main ��p.age=" + p.age);

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

		 System.out.println("test100�� arr����");
		 for(int i = 0; i < arr.length; i++) {
		 		System.out.print(arr[i] + "\t");
		 }

		 System.out.println();
	}
}