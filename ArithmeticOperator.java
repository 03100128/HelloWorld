public class ArithmeticOperator{
	public static void main (String[] args ){
		System.out.println(10/4);//java��Ϊ2
		System.out.println(10.0/4);

		double d = 10/4;//2.0
		System.out.println(d);

		//%ȡģ��ȡ�๫ʽ a % b = a - a / b * b
		System.out.println(10%3);//1
		System.out.println(-10%3);//-1
		System.out.println(10%-3);//1
		System.out.println(-+10%-3);//-1

		//++  ����ʹ��һ��
		int i = 10;
		i++;
		++i;
		System.out.println("i=" +  i);

		int j = 8;
		//int k = ++j;//���������ڸ�ֵ
		int k = j++; //�ȸ�ֵ��������
		System.out.println("k=" + k + "j=" + j);


	}
}