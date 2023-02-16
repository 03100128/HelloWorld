public class AutoConvertDetail{

	public static void main (String[] args){
		int n1 = 10;             
		double d1 = n1 + 1.1;  //float不行
	
		//float d1 = n1 + 1.1F;  ok
		//int n2 = 1.1;//NO
		//byte，short，char不能发生转换
	
		byte b1 = 10;//对，-128-127再赋值期间

		//int n2 = 1;//4个字节
		//byte b2 = n2;//变量赋值，判断类型
		//char c1 = b1;//错误 byte不能自动转为char

		byte b2 =1;
		byte b3 =2;
		short s1 =1;
		int s2 = b2 + s1;
		//自动转换int,boolean不参与转换
		


	}

}