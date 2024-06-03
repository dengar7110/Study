package test.test01;

public class Goods {

	private String name;
	private int price;
	private String expirationDate;
	
	public Goods(String name , int price, String expirationDate){
		this.name = name;
		this.price = price;
		this.expirationDate = expirationDate;
	}
	
	public int calculatePrice(int count) {
		return price * count;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + name );
		System.out.println("가격 : " + price );
		System.out.println("유통기한 : " + expirationDate );
	}
	
	public boolean availableSale(String today) {
//		int todayYear = Integer.parseInt(today.substring(0,4));
//		int todayMonth = Integer.parseInt(today.substring(5,7));
//		int todayDay = Integer.parseInt(today.substring(8));
//		
//		int expirationYear = Integer.parseInt(expirationDate.substring(0,4));
//		int expirationMonth = Integer.parseInt(expirationDate.substring(5,7));
//		int expirationDay = Integer.parseInt(expirationDate.substring(8));
//		
//		if(todayYear > expirationYear || (todayYear == expirationYear && todayMonth > expirationMonth) || (todayYear == expirationYear && todayMonth == expirationMonth && todayDay > expirationDay)) {
//			return false;
//		}
//		
//		
//		return true;
		
		// "2024-09-12"
		String[] expirationArray = expirationDate.split("-");
		String[] todayArray = today.split("-");
		
		int expirationYear = Integer.parseInt(expirationArray[0]);
		int expirationMonth = Integer.parseInt(expirationArray[1]);
		int expirationDay = Integer.parseInt(expirationArray[2]);
		
		int todayYear = Integer.parseInt(todayArray[0]);
		int todayMonth = Integer.parseInt(todayArray[1]);
		int todayDay = Integer.parseInt(todayArray[2]);
		
		if(expirationYear > todayYear) {
			return true;
		}else if(expirationYear == todayYear && expirationMonth > todayMonth) {
			return true;
		}else if(expirationYear == todayYear && expirationMonth == todayMonth && expirationDay >= todayDay) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	
	
}
