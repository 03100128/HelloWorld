public class BubbleSort{
	public static void main(String[] args) {


		int[] arr = {24,69,80,57,13};
		int temp = 0;

		for( int i = 0; i < arr.length - 1; i++ ){
			for( int j = 0; j < arr.length - 1 - i; j++){
				if( arr[j] > arr[j+1] ){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.println("\n==µÚ"+(i+1)+"ÂÖ==");
			for(int j =0; j < arr.length; j++){
				System.out.print(arr[j] + "\t");
			}
		} 
	}
}
