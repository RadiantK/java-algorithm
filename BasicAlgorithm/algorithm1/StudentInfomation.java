package algorithm1;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	
	private String name;
	private String no;
	
	public Student(String name, String no) {
		this.name = name;
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
		
}

public class StudentInfomation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>();
		
		Student st1 = new Student("������", "1111");
		Student st2 = new Student("�̿���", "2222");
		Student st3 = new Student("�ְ���", "3333");
				
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		while(true) {
			System.out.println("��� �˻��Ͻ÷��� y , ���Ḧ ���Ͻø� n�� �����ּ���.");
			
			list.get(0).getName().equals(st1.getName());
			String input = sc.nextLine();
			
			if(!input.equalsIgnoreCase("n")) {
				
				System.out.println("�л��̸��� �Է��ϼ���");
				String st = sc.nextLine();
				boolean flag = false;
				
				for(Student std : list) {
					if(std.getName().equals(st)) {
						System.out.println("�й��� : " + std.getNo());
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("�ش��ϴ� �л��̸��� �����ϴ�.");
				}
			} else {
				break;
			}
		}
		System.out.println("����Ǿ����ϴ�.");
		sc.close();
	}

}