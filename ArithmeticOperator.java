public class ArithmeticOperator{
	public static void main (String[] args ){
		System.out.println(10/4);//java中为2
		System.out.println(10.0/4);

		double d = 10/4;//2.0
		System.out.println(d);

		//%取模，取余公式 a % b = a - a / b * b
		System.out.println(10%3);//1
		System.out.println(-10%3);//-1
		System.out.println(10%-3);//1
		System.out.println(-+10%-3);//-1

		//++  单独使用一样
		int i = 10;
		i++;
		++i;
		System.out.println("i=" +  i);

		int j = 8;
		//int k = ++j;//先自增，在赋值
		int k = j++; //先赋值，再自增
		System.out.println("k=" + k + "j=" + j);


	}
}