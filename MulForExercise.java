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
			System.out.println("请输入第" +i+ "个班第" + j +"个学生的成绩");
			double score = myScanner.nextDouble();
			if(score >= 60){
			passNum++;
			}
			sum += score;
			System.out.println("成绩为" + score);
		 }
	     System.out.println("sum=" + sum + "平均分=" + sum / (stuNum*classNum));
	      totalScore += sum;
	   } 
	   System.out.println("总分=" + totalScore + "平均分=" + totalScore / (stuNum*classNum)); 
	   System.out.println("及格的人数=" + passNum);
	}

}