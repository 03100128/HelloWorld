public class VarScope{
	public static void main (String[] args){
	}
}
class Cat {

	int age = 10;

	double weight;

	public void hi() {
		int num = 1;
		System.out.println("num " + num);
	} 

	public void cry() {
		int n = 10;
		String name = "jack"; 
		System.out.println("��cry��ʹ������age" + age);

	}
	public void eat() {

		System.out.println("��eat��ʹ������age=" + age );
	}

}