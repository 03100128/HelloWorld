public class TernaryOperatorDetail{
	public static void main(String[] args) {
		//2的补码，原码一致  00000010
		//3      00000011

		System.out.println(2&3);//2
		//-2的原码   10000000 00000000 00000000 00000010
		//-2的反吗	11111111 11111111 11111111 11111101
		//补码       11111111 11111111 11111111 11111110
		//~-2		00000000 00000000 00000000 00000001   结果1
		System.out.println(~-2);//?


		System.out.println(~2);//-3
	}
}