import java.util.Scanner; 
public class BreakExercise02{
	public static void main (String[] args ){

 	Scanner myScanner = new Scanner(System.in);
	String name = "";
	String password ="";	
 	int chance = 3; 
 	for( int i = 1; i <= 3; i++){
 		
 		System.out.println("��������");
 		name = myScanner.next();
 		System.out.println("��������");
 		password = myScanner.next();
 			if ("����".equals(name) && "666".equals (password)) {
 				System.out.println("��ϲ��½�ɹ�");
 				break;
 			
 		}

 		chance--;
 		System.out.println("���ʣ��Ϊ" + chance + "����");

 	}
	}
}