package prac;

public class testctrl {

	public static void ctrl() {
		for(int i = 1;i<=9;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(j +"*" +i +"="+ i*j + " ");
			}
			System.out.println();
		}
		
		
	}
	
	
	public static void sanjiao() {
		int max = 4;
		for(int i = 0;i<max;i++) {
			for(int j = 0; j<max-i;j++) {
				System.out.print(" ");
				}
			for(int k = 0;k<(i * 2 +1);k++) {
				System.out.print("*");
				
			}
			System.out.println("");
		}
	}
	
	
	public static void name() {
		int num = 4;
		for(int i = 0; i<num; i++)
		{
			for(int j =0; j<num-i-1; j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k<(i*2+1); k++)
			{
				System.out.print("*");
			}			
			System.out.println("");
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		 testctrl ctpr = new testctrl();
//		 ctpr.ctrl();
		 ctpr.sanjiao();
//		 ctpr.name();
		 
	}
	
	
	
	
}
