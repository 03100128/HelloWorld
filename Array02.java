import java.util.Scanner;
public class Array02{
	public static void main (String[] args ){
		double scores[] = new double[5];
		Scanner myScanner = new Scanner(System.in);
		for( int i = 0; i < scores.length; i++){
			System.out.println("������" + (i+1) + "��Ԫ�ص�ֵ");
			scores[i] = myScanner.nextDouble();
			}


			System.out.println("==�����Ԫ��/ֵ���������:===");
			for( int i = 0; i < scores.length; i++){
			System.out.println("��" + (i+1) + "��Ԫ�ص�ֵ=" + scores[i]);

		}

	}
}