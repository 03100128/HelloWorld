public class MethodDParameter01{
	public static void main (String[] args){

		int a = 10;
		int b = 20;

		AA Obj =new AA();
		Obj.swap(a,b);

		System.out.println("main���� a= " + a  + "b= " + b);
	}
}
class AA {

	public void swap(int a, int b){

		System.out.println("\na��b����ǰ��ֵ\na=" + a + "\tb=" + b);

		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("\na��b�������ֵ\na=" + a + "\tb=" + b);
	}
}