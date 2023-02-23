public class InserseOperator{
	public static void main(String[] args) {

		//!转换真假
		System.out.println(60 > 20);
		System.out.println(!(60 > 20));


		//两者不要同，为真，相同为假
		boolean b = (10 > 1) ^ (3 > 5);
		System.out.println("b =" + b);//F
	}
}