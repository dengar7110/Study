package test;

import java.util.ArrayList;
import java.util.Iterator;

public class Market {

	private ArrayList<Goods> goodsList;
	
	public Market() {
		this.goodsList = new ArrayList<>();
	}
	
	public void insertGoods (String name, int price, String status) {
		
		for(Goods goods : goodsList) {
			if(goods.getName().equals(name)) {
				System.out.println("등록된 상품이 존재합니다");
				return;
			}
		}
		
		if(!status.equals("판매중") && !status.equals("판매완료") && !status.equals("예약중")) {
			System.out.println("판매상태가 유효하지 않습니다.");
			return;
		}
		
		Goods newGoods = new Goods(name, price, status);
		goodsList.add(newGoods);
		System.out.println(name + "상품이 등록되었습니다");
		
	}
	
	public void getGoodsList() {
		if(goodsList.isEmpty()) {
			System.out.println("비어있습니다");
			return;		
		}
	Iterator<Goods> iter = goodsList.iterator();
	
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
		
	}
	
	public void updatePrice(String name, int newPrice) {
		for(Goods goods: goodsList) {
			if(goods.getName().equals(name)) {
				goods.setPrice(newPrice);
				System.out.println(name + "상품의 가격이 수정되었습니다.");
				return;
			}
		}
		
		System.out.println("수정할 " + name + " 상품이 존재하지 않습니다");
		
	}
	
	public void updateStatus(String name , String newStatus) {
		
		for(Goods goods : goodsList) {
			if (goods.getName().equals(name)) {
				
				if(newStatus.equals("판매중") || newStatus.equals("판매완료") || newStatus.equals("예약중")) {
					
					goods.setStatus(newStatus);
					System.out.println(name + " 상품의 판매상태가 " + newStatus + "로 수정되었습니다.");
					return;
				}else {
					System.out.println();
					System.out.println(name + " 상품의 판매상태값이 유효하지않습니다.");
					return;
				}
				
			}
		}
		
		System.out.println(name + " 상품이 존재하지 않습니다.");
		
		
		
		
	}
	
	
	public void deleteGoods(String name) {
		
		Iterator<Goods> iter = goodsList.iterator();
		
		while(iter.hasNext()) {
			Goods goods = iter.next();
			if(goods.getName().equals(name)) {
				iter.remove();
				System.out.println(name + " 상품이 삭제 되었습니다");
				return;
				
			}
		}
		
		System.out.println("삭제할 상품이 존재하지 않습니다.");
		
	}
	
	
	

	
	
	
}
