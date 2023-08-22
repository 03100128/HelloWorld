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
		System.out.println("在cry中使用属性age" + age);

	}
	public void eat() {

		System.out.println("在eat中使用属性age=" + age );
	}

}