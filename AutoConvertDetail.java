public class AutoConvertDetail{

	public static void main (String[] args){
		int n1 = 10;             
		double d1 = n1 + 1.1;  //float����
	
		//float d1 = n1 + 1.1F;  ok
		//int n2 = 1.1;//NO
		//byte��short��char���ܷ���ת��
	
		byte b1 = 10;//�ԣ�-128-127�ٸ�ֵ�ڼ�

		//int n2 = 1;//4���ֽ�
		//byte b2 = n2;//������ֵ���ж�����
		//char c1 = b1;//���� byte�����Զ�תΪchar

		byte b2 =1;
		byte b3 =2;
		short s1 =1;
		int s2 = b2 + s1;
		//�Զ�ת��int,boolean������ת��
		


	}

}