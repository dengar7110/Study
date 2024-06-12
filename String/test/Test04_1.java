package test;

public class Test04_1 {
	
	public static void main(String[] args) {

    // 동명이인 수 찾기
		String membersString = "김혜수:송강호:정우성:이민호:송강호:이민정:이민정:이정재:이병헌:이정재:송강호:송강호:송강호:송강호";

		String colon = ":";
		String[] names = membersString.split(colon);
		
		int count = 0;
		
		for(int i = 0; i < names.length; i++) {
			
			String target = names[i];
			
			// 이미 중복이 확인되어서 확인할 필요가 없는 경우
			if(target.equals("v")) {
				// 찾는 과정을 진행하지 않고, 다음 이름을 확인한다.
				continue;
			}
			
			boolean isFind = false;
			for(int j = i + 1; j < names.length; j ++) {
				if(target.equals(names[j])) {
					isFind = true;
					names[j] = "v";
				}
			}

			if(isFind) {
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
