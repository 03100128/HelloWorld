import java.util.Scanner;
public class NextsedIf{
	public static void main (String[] args ){

		Scanner myScanner = new Scanner(System.in);
		System.out.println("������ø��ֵĳɼ�");
		double score = myScanner.nextDouble();
		if( score > 8.0 ){
			System.out.println("�������Ա�");
			char gender = myScanner.next().charAt(0);
			if (gender == '��'){
				 System.out.println("����������");
			}else if(gender == 'Ů'){
				System.out.println("����Ů����");
			}else{
				System.out.println("����Ա����󣬲��ܲμӱ�������������");
			}
		}else{
			System.out.println("sorry ,�㱻��̭��");
		}
	}
}