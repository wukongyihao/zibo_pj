package prac;
import java.util.Scanner;

public class prac1 {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("����༶��");
	int classnum = input.nextInt();
	System.out.println("����ѧ����");
	int stunum = input.nextInt();
	int sum = 0;
	double avg = 0;
//	System.out.println("��"+classnum+ "���༶");
//	System.out.println("һ����"+stunum+"��ѧ��");
	for(int i = 1; i<=classnum; i++) {
		System.out.println("����"+i+"�༶");
		for(int j = 1;j<=stunum;j++) {
			System.out.println("�����"+j+"��ѧ���ĳɼ�");
			int score = input.nextInt();
			sum =sum + score;
		}
		avg = sum/classnum;
		System.out.println("��"+i+"��ƽ������"+avg);
	}
	
	
	}
}
