package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {

//		1. List 입력, 출력, 삭제 하기
//		List 입력, 출력, 삭제 하기
//
//		Person 클래스 멤버변수
//		이름(String) , 생년월일(int)
//
//		1 : 입력 2 : 출력 3 : 삭제 4 : 종료
//		무한루프를 돌고, 4번을 누르면 입력 종료
//		1 : 입력: 이름과 생년월일을 입력받아서 Person객체를 생성하고 List에 넣는다.      
//		2 : 출력: Person객체가 있으면 출력하고, 아무것도 없을 경우 "비어있습니다." 라고 출력한다.      
//		3 : 삭제: "삭제할 사람 이름을 입력하세요: "를 출력하고 이름이 일치하는 Person 객체를 삭제한다.(Iterator 사용)      
//		4 : 종료: "종료합니다."를 출력한 후 프로그램을 종료시킨다.  
//
//		1~4 이외의 값을 입력받으면 "잘못 입력했습니다" 출력한다.
		
		
		Scanner sc = new Scanner(System.in);
	
		List<Person> personList = new ArrayList<>();
		
		
		while(true) {
			System.out.println("1 : 입력  2 : 출력  3 : 삭제  4 : 종료");
			System.out.println("숫자를 입력하세요");
			int number = sc.nextInt();
			
			if(number == 1) {
				String inputName = sc.next();
				int inputBirth = sc.nextInt();
				personList.add(new Person(inputName, inputBirth));
				
			}else if(number == 2) {
				if(personList.size() != 0) {
					for(Person persons : personList) {
						System.out.print(persons.getName() + " " + persons.getBirth() + " ");
					}
					System.out.println();
				}else {
					System.out.println("비어있습니다.");
				}
				
			}else if(number == 3) {
				
				System.out.print("삭제할 사람 이름을 입력하세요 :");
				String deleteName = sc.next();

				Iterator<Person> iter = personList.iterator();
				
				while(iter.hasNext()) {
					Person person = iter.next();
					if(deleteName.equals(person.getName())) {
						iter.remove();
					}
				}
				
			}else if(number == 4) {
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
			
		}
		
	}

}
