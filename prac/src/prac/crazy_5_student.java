package prac;
import java.util.Scanner;

class student {

	static student[] stu_list = new student[2];
	
	
	private String name ,gender,phone,address,email;
	private int age;
	
	public void setAge(int age) {
		if(0<age || age >100) {
			System.out.println("������������");
			return;
			}else {
				this.age = age;
			}
	}
	
	public int getAge() {
		return this.age;
	}
	
	
	public void setName(String name) {
		if(name.length() > 8 || name.length() < 0) {
			System.out.println("���ֳ�������");
			return;
			}else {
				this.name = name;}
			}
	
	public String getName() {
		return this.name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void setPhone(String phone) {
        if(phone.length()!=11){
            System.out.println("�绰��������");
            return ;
        }else{
            this.phone = phone;
        }
    }
    public String getPhone() {
        return this.phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return this.address;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }
	
	
    public student(int age, String name, String gender, String phone, String address, String email) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }
    
    
    public student() {
    	
    }
	
	
	
	
	
	
	public void eat() {
		System.err.println("stu ��");
	}
	
	public void drink() {
		System.out.println("stu ��");
	}
	
	
	public void Add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������");
		this.setName(sc.next());
		System.out.println("�����Ա�");
		this.setGender(sc.next());
		System.out.println("����绰");
		this.setPhone(sc.next());
		System.out.println("�����ַ");
		this.setAddress(sc.next());
		System.out.println("��������");
		this.setEmail(sc.next());
	}
	
	public static void Select() {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("����Ҫ��ѯ����");
		String num = sc.next();
		
		for(;i<stu_list.length;i++) {
			if(num.equals(stu_list[i].name)) {
					System.out.println("��ѯ������"+num+"���û�");
					return;
				}else if (num == stu_list[i].email) {
					System.out.println("��ѯ������"+num+"���û�");
					return;
				}else{
					System.out.println("û�в鵽"+num+"���û�");
					return;
				}
			}
	}
	
	
	
}





public class crazy_5_student{
	public static void main(String[] args) {
		
//		int i = 0;
		
		student stu1 = new student(12,"С��","��","12312341234","����","123@123.com");
		student stu2 = new student(22,"С��1","��","12312341234","����","1234@123.com");
		student.stu_list[0] = stu1;
		student.stu_list[1] = stu2;
//		stu1.Add();
//		stu2.Add();
		student.Select();
//		System.out.println(student.stu_list[0].getName());
//		System.out.println(student.stu_list[1].getName());


	}
	
}







