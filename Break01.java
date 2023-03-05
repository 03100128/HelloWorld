public class Break01{
	public static void main (String[] args ){


		for( int i = 0; i < 10; i++){
			if(i == 3){
				break;
			}
			System.out.println("i=" + i);
		}
		System.out.println("退出For循环，继续执行程序...");
	}
}