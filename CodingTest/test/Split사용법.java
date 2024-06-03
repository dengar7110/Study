package test;

public class Split사용법 {

	public static void main(String[] args) {
		String str1 = "사과/바나나/딸기/포도/수박";
		String[] sSplit1 = str1.split("/");
		String[] sSplit2 = str1.split("/", 3); 
		// 사과 바나나 딸기 포도 수박Arrays.stream(sSplit1).forEach(s -> System.out.print(s + " ")); 
		System.out.println(sSplit1); 
		System.out.println(sSplit2); 
		// 사과 바나나/딸기/포도/수박Arrays.stream(sSplit2).forEach(s -> System.out.print(s + " "));
	
		System.out.println("for each 출력" );
		for (String s : sSplit1) {
			
			System.out.print(s + " ");
		}
		System.out.println();
		
		
		System.out.println("반복문 출력");
		for(int i = 0; i < sSplit2.length; i++ ) {
			System.out.print(sSplit2[i] + " ");
		}
		
	}

}
