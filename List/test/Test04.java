package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

//		1. 제품 추가
//		아래 정보를 만든 클래스와 리스트를 이용해서 저장하고 출력 하세요.
		
//		출력 예시
//
//		[(제품명 : 새우깡 가격 : 1200 재고 : 150), (제품명 : 육개장 가격 : 850 재고 : 30), (제품명 : 신라면 가격 : 800 재고 : 15), (제품명 : 천마표팝콘 가격 : 1500 재고 : 0)]
		
		Goods goods1 = new Goods("새우깡", 1200, 150);
		
		List<Goods> goodsList = new ArrayList<>();
		
		goodsList.add(goods1);
		goodsList.add(new Goods("육개장", 850, 30));
		goodsList.add(new Goods("신라면", 800, 15));
		goodsList.add(new Goods("천마표팝콘", 1500, 0));
		
		System.out.println(goodsList);

//		2. 제품 제거
//		재고가 없는 상품을 리스트에서 삭제하고, 전체 리스트를 출력 하세요.
		
//		출력 예시
//
//		[(제품명 : 새우깡 가격 : 1200 재고 : 150), (제품명 : 육개장 가격 : 850 재고 : 30), (제품명 : 신라면 가격 : 800 재고 : 15)]
	
		// Iterator 를 사용하여 삭제
		Iterator<Goods> iter = goodsList.iterator();
		
		while(iter.hasNext()) {
			Goods goods = iter.next();
			int stock = goods.getStock();
			if(stock == 0) {
				iter.remove();
			}
		}
		
		System.out.println(goodsList);
		
//		for(int i = 0; i < invenList.size(); i++) {
//			if(invenList.get(i).getInventory() == 0) {
//				invenList.remove(i);
//			}		
//		}
		

		
//		3. 제품 판매
//		판매한 제품명과 개수를 입력 받고, 가격을 계산하고, 재고 개수를 업데이트 하세요.
//		계산된 가격과 제품 리스트를 출력 하세요.
		
//		입력 예시
//
//		상품명 : 육개장
//		개수 : 7
		
//		출력 예시
//
//		가격 : 5950원
//		[(제품명 : 새우깡 가격 : 1200 재고 : 150), (제품명 : 육개장 가격 : 850 재고 : 23), (제품명 : 신라면 가격 : 800 재고 : 15)]
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품명 : ");
		String productName = sc.nextLine();
		System.out.print("개수 : ");
		int count = sc.nextInt();
		
		for(Goods goods : goodsList) {
			
			String name = goods.getName();
			
			if(name.equals(productName)) {
				// 개수에 따른 가격 계산
				int result = goods.getPrice() * count;
				System.out.println("가격 : " + result + "원");
				// 재고 수정
				int stock = goods.getStock() - count;
//				goods.stock = stock;
				goods.setStock(stock);
				break;
			}
		}
		
//		for(int i = 0; i < goodsList.size(); i++ ) {
//			Goods target = goodsList.get(i);
//			if(target.getName().equals(productName)) {
//				target.setStock(target.getStock() - count);
//				System.out.println("가격 : " + target.calculatePrice(count) + "원");
//			}
//		}
		
		System.out.println(goodsList);
		
//		4. 재고 관리
		
//		재고가 적은 상품을 새롭게 수주 하려고 한다.
//		재고가 30개 이하인 상품의 정보를 출력 하세요.
		
//		출력 예시
//
//		(제품명 : 육개장 가격 : 850 재고 : 23)
//		(제품명 : 신라면 가격 : 800 재고 : 15)
		
		for(Goods goods : goodsList) {

			int stock = goods.getStock();
			if(stock <= 30) {
				System.out.println(goods);
			}
		}
		
//		for(int i = 0; i < goodsList.size(); i++) {
//			Goods target = goodsList.get(i);
//			if(target.getStock() <= 30) {
//				System.out.println(target);
//			}
//		}
		
	}

}
