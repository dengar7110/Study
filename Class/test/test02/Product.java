package test.test02;

public class Product {

	String name;
	int price;
	String expirationDate;
	
	
	int get5Product(int price) {
		int price5 = price * 5;
		
		return price5;
	}
	
	int get13Product(int price) {
		int price13 = price * 13;
		
		return price13;	
	}
	
	String discriminationProduct(String expirationDate) {
		int year = Integer.parseInt(expirationDate.substring(0,4));
		int month = Integer.parseInt(expirationDate.substring(5,7));
		int day = Integer.parseInt(expirationDate.substring(8));
		
		int currentYear = 2024;
		int currentMonth = 6;
		int currentDay = 3;
		
		if(year < currentYear || (year == currentYear && month > currentMonth) || (year == currentYear && month == currentMonth && day < currentDay)) {
			return "판매불가상품";
		}else{
			return "판매가능상품";
		}

	}
	
}
