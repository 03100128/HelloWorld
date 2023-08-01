public class MethodDParameter01{
	public static void main (String[] args){

		int a = 10;
		int b = 20;

		AA Obj =new AA();
		Obj.swap(a,b);

		System.out.println("main方法 a= " + a  + "b= " + b);
	}
}
class AA {

	public void swap(int a, int b){

		System.out.println("\na和b交换前的值\na=" + a + "\tb=" + b);

		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("\na和b交换后的值\na=" + a + "\tb=" + b);
	}
}