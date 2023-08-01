import java.util.Scanner;
public class Array02{
	public static void main (String[] args ){
		double scores[] = new double[5];
		Scanner myScanner = new Scanner(System.in);
		for( int i = 0; i < scores.length; i++){
			System.out.println("请输入" + (i+1) + "个元素的值");
			scores[i] = myScanner.nextDouble();
			}


			System.out.println("==数组的元素/值的情况如下:===");
			for( int i = 0; i < scores.length; i++){
			System.out.println("第" + (i+1) + "个元素的值=" + scores[i]);

		}

	}
}