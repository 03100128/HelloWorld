public class HomeWork005{
	public static void main (String[] args){

		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++ ){
			arr[i] = (int)(Math.random() * 100) + 1;
		}	
			System.out.println("=====arr的情况=====");
			for(int i =0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
		System.out.println("\n=====arr的情况(倒序)=====");
		for(int i =arr.length - 1; i >=0; i--){
			System.out.print(arr[i] + "\t");
		}
		double sum = arr[0];
		int max =arr[0];
		int maxIndex = 0;
		for(int i = 1 ; i < arr.length; i++ ){
			sum += arr[i];
			if( max < arr[i]){
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("\nmax=" + max + "maxIndex= " + maxIndex);
		System.out.println("\n平均值=" +(sum / arr.length));

		int findNum = 8;
		int index = -1;
		for (int i = 0; i < arr.length; i++){
			if (findNum == arr[i]){
				System.out.println("找到" + findNum+ "findNum");
				index = i;
				break;
			}
			

	}
		if(index ==-1){
			System.out.println("没有找到" + findNum);
		}
		}
}