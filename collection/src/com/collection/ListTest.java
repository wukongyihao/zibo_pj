package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public List coursesToSelect;
	
	public ListTest() {
		this.coursesToSelect = new ArrayList();
	}
	
	
	public void testAdd() {
		Course cr1 = new Course("1","���ݽṹ");
		coursesToSelect.add(cr1);
		Course temp = (Course)coursesToSelect.get(0);
		System.out.println("����˿γ̣�"+temp.id+temp.name);
		
	}
	
	
	public static void main(String[]args) {
		ListTest lt = new ListTest();
		lt.testAdd();
	}
	
}
