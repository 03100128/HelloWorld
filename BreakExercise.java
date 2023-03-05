public class BreakExercise{
	public static void main (String[] args ){
		int sum = 0;
		int n = 0;
		for(int i = 1; i <= 100; i++){
			sum += i;
			if(sum>20){
				System.out.println("结果大于20时i = " + i);
				n = i;
				break;
			}
		}
		System.out.println("i的值为" + n);


	}
}
