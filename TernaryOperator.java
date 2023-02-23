public class TernaryOperator{
	public static void main(String[] args) {

		int a = 10;
		int b = 99;

		int result = a > b ? a++ : b--;
		System.out.println("result=" + result);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
}