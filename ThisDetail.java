public class ThisDetail{
	public static void main (String[] args){
		//T t1 = new T();
		//t1.f2();
		T t2 = new T();
		t2.f3();


	}
}
class T {

		String name = "jack";
		int num = 100;

		public T() {
			this("jack" , 100);
			System.out.println("T() ������");


		}
		public T(String name,int age){

			System.out.println("T(String name, int age) ������");
		}

		public void f3() {
		System.out.println("name= " + name + "num= " + num);
	}


		public void f1() {
		System.out.println("f1() ����..");
	}

		public void f2() {
		System.out.println("f2() ����..");
	
		f1();
		this.f1();
	}
}
