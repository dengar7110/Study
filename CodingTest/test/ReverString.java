package test;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
			
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		
		String reverse =""; 
		for(int i = str.length()-1; i >= 0; i--) {
			reverse += str.charAt(i);
		
		}
		
		System.out.println(reverse);
		
		
		System.out.println("스트링 버퍼 사용");
		
		String str2 = sc.next();
		StringBuffer sb = new StringBuffer(str2);
		System.out.println("현재 sb "+ sb);
		String reverse2 = sb.reverse().substring(0);
		
		System.out.println("reverse().toString(); 한 sb 는 " + sb);
		System.out.println("reverse2 는 " + reverse2);
		
		StringBuffer sb2 = new StringBuffer("asdf");
		StringBuffer new2 = sb2;
		
		
	}
}
