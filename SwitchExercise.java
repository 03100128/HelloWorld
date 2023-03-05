import java.util.Scanner;
public class SwitchExercise{
	public static void main (String[] args ){

		//Scanner myScanner = new Scanner(System.in);
		//System.out.println("输入字母a-e");
		//char c1 = myScanner.next().charAt(0);

		//switch(c1){
		//	case 'a':
		//	System.out.println("A");
		//	break;
		//case 'b':
		//	System.out.println("B");
		//	break;
		//case 'c':
		//	System.out.println("C");
		//	break;
		//case 'd':
		//	System.out.println("D");
		//	break;
		//case 'e':
		//	System.out.println("E");
		//	break;	
		//default:
		//	System.out.println("你输入的字符不正确，没有匹配值");	
		//}
			double score = 88.5;
		if( score >= 0 && score <= 100){	
			switch ((int)score / 60){
				case 0:
					System.out.println("不合格");
				case 1:
					System.out.println("合格");

			}
		}else{
			System.out.println("你输入的字符不正确，没有匹配值");
		}
         

        Scanner myScanner = new Scanner(System.in);
		System.out.println("输入月份");
		int month = myScanner.nextInt();
		switch(month){
		  case 3:
		  case 4:
		  case 5:
		  	System.out.println("这是春季");
		  	break;
		  case 6:
		  case 7:
		  case 8:
		  	System.out.println("这是秋季");
		  	break;
		  	
		  case 9:
		  case 10:
		  case 11:
		  	System.out.println("这是夏季");	
		  	break;
		  case 1:
		  case 2:
		  case 12:
		  	System.out.println("这是冬季");
		  	break;
		  default:
		  	System.out.println("你输入的字符不正确，没有匹配值");		
		}
}
}

	
