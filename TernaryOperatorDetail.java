public class TernaryOperatorDetail{
	public static void main(String[] args) {
		//2�Ĳ��룬ԭ��һ��  00000010
		//3      00000011

		System.out.println(2&3);//2
		//-2��ԭ��   10000000 00000000 00000000 00000010
		//-2�ķ���	11111111 11111111 11111111 11111101
		//����       11111111 11111111 11111111 11111110
		//~-2		00000000 00000000 00000000 00000001   ���1
		System.out.println(~-2);//?


		System.out.println(~2);//-3
	}
}