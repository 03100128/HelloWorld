public class Array01{
	public static void main (String[] args ){

		double[] hens = {3,5,1,3.4,2,50};
		System.out.println("����ĳ���=" + hens.length);

		double totalWeight = 0;
		for (int i  = 0; i < 6; i++){
			//System.out.println("��" + (i+1) + "��Ԫ�ص�ֵ= " +hens[i]);
			totalWeight += hens[i];
		}
		System.out.println("������=" + totalWeight + "ƽ������=" + (totalWeight / 6));
	}
}