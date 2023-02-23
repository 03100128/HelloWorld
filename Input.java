
import java.util.Scanner;//引入包，为了使用Scannner
public class Input{
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		//接受输入
		System.out.println("请输入名字");
		//程序执行到next时，等待用户输入
		String name = myScanner.next();
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		System.out.println("请输入薪水");
		double sal = myScanner.nextDouble();
		System.out.println("人的信息如下:");
		System.out.println("名字=" + name 
							+"年龄=" + age + "薪水=" + sal);
		

	}
}