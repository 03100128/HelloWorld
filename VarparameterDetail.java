public class VarparameterDetail{
	public static void main (String[] args){
		int[] arr = {1 ,2 ,3};
		T t1 = new T();
		
		t1.f1(arr);


	}
}
class T{

	public void f1(int...nums) {
		System.out.println("³¤¶È=" + nums.length);

	}

	public void f2(String str ,double...nums){

	}
	
}