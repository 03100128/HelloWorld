import java.util.Scanner;
public class SeqSerach{
	public static void main (String[] args){
		
		String[] names = {"��üӥ��","��ëʨ��","��������","��������"};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����������");
		String findName = myScanner.next();

		int index = -1;
		for( int i = 0; i < names.length; i++){
			if (findName.equals(names[i])){
				index = i;
				System.out.println("��ϲ�ҵ�" + findName);
				System.out.println("�±�Ϊ" + i);
				break;
			}
		}
		if(index == -1){
			System.out.println("û���ҵ�");
		}
	}
}