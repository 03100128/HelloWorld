public class BreakExercise{
	public static void main (String[] args ){
		int sum = 0;
		int n = 0;
		for(int i = 1; i <= 100; i++){
			sum += i;
			if(sum>20){
				System.out.println("�������20ʱi = " + i);
				n = i;
				break;
			}
		}
		System.out.println("i��ֵΪ" + n);


	}
}
