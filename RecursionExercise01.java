public class RecursionExercise01{
	public static void main (String[] args){

		T t1 = new T();
		//int n = 8;
		//int res = t1.fibonacci(n);
		//if (res != -1 ){
		//System.out.println("��n = "+ n +" ��Ӧ��쳲�������= " + res);
		//}
		int day = -1;
		int peachNum = t1.peach(day);
		if(peachNum != -1) {
			System.out.println("��" + day + "����" + peachNum + "������");
		}
	}
}


class T{

	public int fibonacci(int n){
		if( n >= 1) {
			if( n == 1 || n == 2){
				return 1;
			}else{
				return fibonacci(n-1) + fibonacci(n-2);
			}

		}else{
			System.out.println("Ҫ�������n>=1������");
			return -1;
		} 
	public int peach (int day) {
			if(day == 10 ){
				return 1 ;

			}else if (day >= 1 && day <= 9 ){
				return (peach (day + 1 ) + 1 ) *2;

			}else {
				System.out.println("day��1-10");
				return -1;
			}
		} 		
	
}
}