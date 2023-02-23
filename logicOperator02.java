public class logicOperator02{
	public static void main (String[] args){
			//短路或||，逻辑或|
		int age = 50;
		if(age > 20 || age < 30){
			System.out.println("ok100");
		//逻辑与
			//短路或，第一个判段，第二个不判断
			if(age > 20 | age < 30){
		System.out.println("ok200");

		int a = 4;
		int b = 9;
		if(age > 1 | ++b > 4){
		System.out.println("ok300");
		System.out.println("a= " + a + "b=" + b);//4  10
	}
	}
}
}


	}
	