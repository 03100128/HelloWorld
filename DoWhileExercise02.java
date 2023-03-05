import java.util.Scanner;
public class DoWhileExercise02{
	public static void main (String[] args ){



		Scanner myScanner = new Scanner(System.in);
		char answer = ' ' ;
		do{
			System.out.println("老汉使出来五连编");
			
			System.out.println("老韩问：是否还钱?y/n"); 
			answer = myScanner.next().charAt(0);
			System.out.println("他的回答是 " + answer);




		}while(answer != 'y');
		System.out.println("还钱成功");



}
}