
public class ArithmeticOperatorExercise02{
	public static void main (String[] args ){

		//����59��ż٣��Ͷ������ڣ������죿
		int days = 59;
		int weeks = days / 7;
		int leftDays = days % 7;
		System.out.println(days + "�� �� " + weeks + "������"
		 + leftDays + "��");

		//������һ���������滪���¶ȣ������¶�ת����ʽ
		//��1����double���廪���¶ȣ�
		//��2�����ݹ�ʽ���ã����м���ģ��
		//��2�����õ��������Ϊdouble sheShi
		//������ѧ��ʽ�����Ե����ԣ�5.0*��Ҫ*
		double huaShi = 1234.6;
		double sheShi = 5.0 / 9 * (huaShi - 100);
		System.out.println("�����¶�" + huaShi
							+ "��Ӧ�������¶�=" + sheShi);


	}
}