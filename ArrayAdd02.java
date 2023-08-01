import java.util.Scanner;
public class ArrayAdd02{
	public static void main (String[] args ){

		Scanner myScanner = new Scanner(System.in);

		int arr[] ={1,2,3};
	do{	
		int[] arrNew = new int[arr.length+1];
		for(int i = 0; i < arr.length;i++ ){
			arrNew[i] = arr[i];

		}
		System.out.println("你想添加的元素");
		int addNum = myScanner.nextInt();
		arrNew[arrNew.length-1] = addNum;
		arr = arrNew; 
		System.out.println("====arr扩容后===");

		for(int i = 0; i < arr.length;i++ ){
		System.out.print(arr[i] + "\t");
		}
		
		System.out.print("是否添加元素 y/n");
		char key = myScanner.next().charAt(0);
		if (key =='n' ){
			break;
		}
	}while(true);
		System.out.print("你退出了添加");
	}
	
}
