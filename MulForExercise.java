import java.util.Scanner;
public class MulForExercise{
	public static void main (String[] args ){

		Scanner myScanner = new Scanner(System.in);
		
		double totalScore = 0;
		int classNum = 0;
		int stuNum = 0;
		int passNum = 0;


	for(int i = 1; i <= classNum; i++) {
		double sum = 0;
		
		for(int j = 1; j <= stuNum; j++) {
			System.out.println("�������" +i+ "�����" + j +"��ѧ���ĳɼ�");
			double score = myScanner.nextDouble();
			if(score >= 60){
			passNum++;
			}
			sum += score;
			System.out.println("�ɼ�Ϊ" + score);
		 }
	     System.out.println("sum=" + sum + "ƽ����=" + sum / (stuNum*classNum));
	      totalScore += sum;
	   } 
	   System.out.println("�ܷ�=" + totalScore + "ƽ����=" + totalScore / (stuNum*classNum)); 
	   System.out.println("���������=" + passNum);
	}

}