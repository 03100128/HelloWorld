public class MethodDetail02{
	public static void main (String[] args){

		A a = new A();
		a.sayOk();

		a.m1();


	}
}
class A {

	public void print(int n ){
		System.out.println("print()���������� n=" +n);
		
	}
	public void sayOk() {
		print(10);
		System.out.println("����ִ��syaOk()~~~");
	}
	public void m1() {

		System.out.println("m1() ����������");

		 B b = new B();
		 b.hi();
		 System.out.println("m1() ��������ִ��");
	}
class B {

	public void hi() {
		System.out.println("h1() ������ִ��");

	}
}	
}