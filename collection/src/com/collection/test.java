package com.collection;

/**
 * 
 * @author xiaoming
 *
 */

public class test {
	
	public String[] hanArr = {"��","Ҽ","��","��","��","��","½","��","��","��"};
	public String[] unitArr = {"ʮ","��","ǧ"};
	/*
	 * �Ѹ������ֽ��֤���С������
	 * num ��Ҫ���ֽ����
	 * ����һ�����飬�����Ԫ�����������֣���һ��Ԫ����С������
	 */
	public String[] exnum(double num){
		long zhengshu = (long)num;
		long xiaoshu = Math.round((num - zhengshu)*100);
//		String[] 
		return new String[] {zhengshu +"",String.valueOf(xiaoshu)};
	}
	
	
	public String toChin(String numstr) {
		String result = "";
		int numlen = numstr.length();
		for(int i = 0;i<numlen;i++) {
			int num = numstr.charAt(i) - 48;
			if(i != numlen-1 && num != 0) {
				result += hanArr[num] + unitArr[numlen -2 -i];
			}
			
			else if(num == 0){
				result += hanArr[num];
			}
			else{
				continue;
			}
		}
		
		
		return result;
	}
	
	
	public static void main(String[]args) {
		test changenum = new test();
		System.out.println(changenum.toChin("4005"));
		
	}
	
	
	
	
	
}