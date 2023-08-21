public class OverLoad{
	public static void main (String[] args){

		MyCalculator mc =new MyCalculator();
		System.out.println(mc.caculate(1,2));
		System.out.println(mc.caculate(1.1,2));

	}
}
class MyCalculator {
	public int caculate(int n1 ,int n2) {
		return n1 +n2;
	}
		public double caculate(int n1 ,double n2) {
		return n1 +n2;
	}
		public double caculate(double n1 ,int n2) {
		return n2 +n1;
	}
	public double caculate(int n1 ,int n2, int n3) {
		return n2 + n1 + n3;

}
}