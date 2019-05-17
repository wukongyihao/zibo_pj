package prac;
import java.util.Scanner;

public class prac1 {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("输入班级数");
	int classnum = input.nextInt();
	System.out.println("输入学生数");
	int stunum = input.nextInt();
	int sum = 0;
	double avg = 0;
//	System.out.println("有"+classnum+ "各班级");
//	System.out.println("一个班"+stunum+"个学生");
	for(int i = 1; i<=classnum; i++) {
		System.out.println("输入"+i+"班级");
		for(int j = 1;j<=stunum;j++) {
			System.out.println("输入第"+j+"个学生的成绩");
			int score = input.nextInt();
			sum =sum + score;
		}
		avg = sum/classnum;
		System.out.println("第"+i+"个平均分是"+avg);
	}
	
	
	}
}
