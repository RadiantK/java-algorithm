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
		
		Student st1 = new Student("백종원", "1111");
		Student st2 = new Student("이연복", "2222");
		Student st3 = new Student("최강록", "3333");
				
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		while(true) {
			System.out.println("계속 검색하시려면 y , 종료를 원하시면 n를 눌러주세요.");
			
			list.get(0).getName().equals(st1.getName());
			String input = sc.nextLine();
			
			if(!input.equalsIgnoreCase("n")) {
				
				System.out.println("학생이름을 입력하세요");
				String st = sc.nextLine();
				boolean flag = false;
				
				for(Student std : list) {
					if(std.getName().equals(st)) {
						System.out.println("학번은 : " + std.getNo());
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("해당하는 학생이름이 없습니다.");
				}
			} else {
				break;
			}
		}
		System.out.println("종료되었습니다.");
		sc.close();
	}

}