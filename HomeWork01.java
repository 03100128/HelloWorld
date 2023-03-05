public class HomeWork01{
	public static void main (String[] args ){

		int count = 0;
		double money = 100000;
		while(true){
			if(money > 50000){
				money *= 0.95;
				count++;

			}else if(money >= 1000){
				money -= 1000;
				count++;

			}else{
				break;

			}
			
		}
		System.out.println("100000" + "可以过" + count +"个路口");

	}
}