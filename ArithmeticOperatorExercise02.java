
public class ArithmeticOperatorExercise02{
	public static void main (String[] args ){

		//需求59天放假，和多少星期，多少天？
		int days = 59;
		int weeks = days / 7;
		int leftDays = days % 7;
		System.out.println(days + "天 合 " + weeks + "星期零"
		 + leftDays + "天");

		//需求用一个变量保存华氏温度，华氏温度转化公式
		//（1）用double定义华氏温度，
		//（2）根据公式套用，进行计算模拟
		//（2）将得到结果保存为double sheShi
		//考虑数学公式和语言的特性，5.0*重要*
		double huaShi = 1234.6;
		double sheShi = 5.0 / 9 * (huaShi - 100);
		System.out.println("华氏温度" + huaShi
							+ "对应的摄氏温度=" + sheShi);


	}
}