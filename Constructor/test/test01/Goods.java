package test.test01;

public class Goods {

	private String name;
	private int price;
	private String expiration;
	
	public Goods(String name , int price, String expiration){
		this.name = name;
		this.price = price;
		this.expiration = expiration;
	}
	
	public int calculatePrice(int count) {
		return price * count;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + name );
		System.out.println("가격 : " + price );
		System.out.println("유통기한 : " + expiration );
	}
	
	public boolean availableSale(String today) {
//		int todayYear = Integer.parseInt(today.substring(0,4));
//		int todayMonth = Integer.parseInt(today.substring(5,7));
//		int todayDay = Integer.parseInt(today.substring(8));
//		
//		int expirationYear = Integer.parseInt(expiration.substring(0,4));
//		int expirationMonth = Integer.parseInt(expiration.substring(5,7));
//		int expirationDay = Integer.parseInt(expiration.substring(8));
//		
//		if(todayYear > expirationYear || (todayYear == expirationYear && todayMonth > expirationMonth) || (todayYear == expirationYear && todayMonth == expirationMonth && todayDay > expirationDay)) {
//			return false;
//		}
//		
//		
//		return true;
		
		// split 사용
//		String[] expirationArray = expiration.split("-");
//		String[] todayArray = today.split("-");
//		
//		int expirationYear = Integer.parseInt(expirationArray[0]);
//		int expirationMonth = Integer.parseInt(expirationArray[1]);
//		int expirationDay = Integer.parseInt(expirationArray[2]);
//		
//		int todayYear = Integer.parseInt(todayArray[0]);
//		int todayMonth = Integer.parseInt(todayArray[1]);
//		int todayDay = Integer.parseInt(todayArray[2]);
//		
//		if(expirationYear > todayYear) {
//			return true;
//		}else if(expirationYear == todayYear && expirationMonth > todayMonth) {
//			return true;
//		}else if(expirationYear == todayYear && expirationMonth == todayMonth && expirationDay >= todayDay) {
//			return true;
//		}else {
//			return false;
//		}
//		
		
		// replace 사용 
//		String expirationDate = expiration.replace("-", "");
//		String todayDate = today.replace("-", "");
//		
//		int expirationInt = Integer.parseInt(expirationDate);
//		int todayInt = Integer.parseInt(todayDate);
//		
//		if(expirationInt >= todayInt) {
//			return true;
//		}else {
//			return false;
//		}
		
		if(expiration.compareTo(today) >= 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
}
