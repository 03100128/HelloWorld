
import java.util.Scanner;//�������Ϊ��ʹ��Scannner
public class Input{
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		//��������
		System.out.println("����������");
		//����ִ�е�nextʱ���ȴ��û�����
		String name = myScanner.next();
		System.out.println("����������");
		int age = myScanner.nextInt();
		System.out.println("������нˮ");
		double sal = myScanner.nextDouble();
		System.out.println("�˵���Ϣ����:");
		System.out.println("����=" + name 
							+"����=" + age + "нˮ=" + sal);
		

	}
}