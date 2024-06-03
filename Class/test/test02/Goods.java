
package test.test02;

public class Goods {

//	이름 : 새우깡
//	가격 : 1300
//	유통기한 : 2021-03-02
	
	String name;
	int price;
	String expirationDate;
	
	//정보 출력 기능
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("유통기한 : " + expirationDate);
	}
	
	// 개수에 따른 가격 계산 기능
	int calculatePrice(int count) {
		return price * count;
		}
	
	// 판매 가능 여부 확인 기능
	// today : ex) 2024-06-03
	boolean availableSale(String today) {
		int year = Integer.parseInt(expirationDate.substring(0,4));
		int month = Integer.parseInt(expirationDate.substring(5,7));
		int day = Integer.parseInt(expirationDate.substring(8));
		
		int currentYear = 2024;
		int currentMonth = 6;
		int currentDay = 3;
		
		if(year < currentYear || (year == currentYear && month < currentMonth) || (year == currentYear && month == currentMonth && day < currentDay)) {
			return false;
		}else{
			return true;
		}

	}
	
}
