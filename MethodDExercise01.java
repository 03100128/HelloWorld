public class MethodDExercise01{
	public static void main (String[] args){

		AA a = new AA();
		if(a.isOdd(1)){
			System.out.println("������");
		}else{
			System.out.println("��ż��");
		}
		a.print(4,4,'#');
		

	}
}
class AA {
	public boolean isOdd(int num) {
		//if (num % 2 != 0 ) {
		//	return true;
		//}else{
		//	return false;
		//}

		//return num % 2 !=0 ? ture: false;

		return num % 2 !=0;
	}
	public void print(int row, int col, char c){
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				System.out.print(c);
			}
			System.out.println();
		}
}

}
