import java.util.Scanner;
public class Switch01{
	public static void main (String[] args ){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ���ַ�a-g");
		char c1 = myScanner.next().charAt(0);//

		switch(c1){
		case 'a':
			System.out.println("��������һ��");
			break;
		case 'b':
			System.out.println("�������ڶ���");
			break;
		case 'c':
			System.out.println("������������");
			break;
		default:
			System.out.println("��������ַ�����ȷ��û��ƥ��ֵ");


		}
		System.out.println("�˳���switch������ִ�г���");



	}
}
