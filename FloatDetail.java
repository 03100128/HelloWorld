public class FloatDetail{
	public static void main (String[] args){


		float num2 = 1.1F;
		double num3 = 1.1;
		double num4 = 1.1f;

		double num5 = .123;
		System.out.println(num5);
		System.out.println(5.12e2);
		System.out.println(5.12E-2);

		double num9 = 2.1234567851;
		float  num10 = 2.1234567851F;
		System.out.println(num9);
		System.out.println(num10);

		double num11 = 2.7;
		double num12 = 2.7;

			System.out.println(num11);
		System.out.println(num12);
		if( num11 == num12 ) {
			System.out.println(" num11 == num12 ���");
}

		if(Math.abs(num11 - num12)<0.001){
			System.out.println("��ֵ�ǳ�С�����ҹ涨�ľ��ȣ���Ϊ���...");

		}
		//��ȷ��д����crtl + / ע�Ϳ�ݼ����ٴε�ȡ��

		System.out.println(Math.abs(num11-num12));

	} 
}
