public class Test1 {
	int count = 9;
	public void count1() {
			count = 10;//����
			System.out.println("count1=" + count );

	}public void count2() {
		System.out.println("count1=" + count++);

	}
	public static void main(String args[]) {

		//��������֮�����count1����
		new Test1().count1();

		Test1 t1 = new Test1();
		t1.count2();
		t1.count2();
	}
}