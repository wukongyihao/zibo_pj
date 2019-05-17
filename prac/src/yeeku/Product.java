package yeeku;

import crazy_5_2.Crazyoutput6_6;

public interface Product {

	int getProductTIme();
	
	
}

public class Printer implements Crazyoutput6_6 ,Product{
	private String[] printData = new String[MAX_CACHE_LINE];
	private int dataNum = 0;
	public void out() {
		while(dataNum >0 ) {
			System.out.println("打印"+ printData[0]);
			System.arraycopy(printData,1,printData,0,--dataNum);
		}
	}
	
	public void getData(String msg) {
		if(dataNum >= MAX_CACHE_LINE) {
			System.out.println("队列已满");
		}else {
			printData[dataNum++] = msg;
		}
	}
	
	public int getProducteTime() {
		return 45;
	}
	
	public static void main(String[] args) {
		Crazyoutput6_6 o = new Printer();
		o.getData("语文");
		o.getData("数学");
		o.out();
		o.getData("英语");
		o.getData("java");
		o.out();
		o.print("小明","小刚","小红");
		o.test();
		Product p = new Printer();
		System.out.println(p.getProductTIme());
		Object obj = p;
	}
	
}
