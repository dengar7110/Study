package test;

public class Goods {
	
	private String name;
	private int price;
	private String status;
	
	public Goods(String name, int price, String status) {
		this.name = name;
		this.price = price;
		this.status = status;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "물품명 : " + name + ", 가격 : " + price + ", 판매상태 : " + status; 
	}
	
	
}
