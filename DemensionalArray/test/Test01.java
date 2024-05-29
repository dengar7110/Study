package test;

public class Test01 {

	public static void main(String[] args) {
//		아래 배열은 5명의 10과목 시험 성적을 정리해놓은 것이다.
//		이 배열을 이용해서 아래 문제를 풀어 보세요.
//
		int[][] scores = {
		    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
		    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
		    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
		    {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
		    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
		};
		
//		1. 학생 별 평균 구하기
//		각 학생의 평균을 각각 구해서 출력하세요.
//		출력
//
//		1번째 학생의 평균 : 89.9
//		2번째 학생의 평균 : 84.8
//		3번째 학생의 평균 : 94.2
//		4번째 학생의 평균 : 78.3
//		5번째 학생의 평균 : 54.8
		
		for(int i = 0; i< scores.length; i++) {
			int total = 0;
			for(int j = 0; j < scores[i].length; j++) {
				total += scores[i][j];
			}		
			double average = total / scores[i].length;
			System.out.println((i + 1) + "번째 학생의 평균 : " +  average);
			
		}

		
//		2. 학생 별 최고점 구하기
//		각 학생의 최고 점수를 구해서 출력하세요.
//		출력
//
//		1번째 학생의 최고점 : 93
//		2번째 학생의 최고점 : 98
//		3번째 학생의 최고점 : 98
//		4번째 학생의 최고점 : 100
//		5번째 학생의 최고점 : 67
		
		for(int i = 0; i < scores.length; i++) {
			int max = 0;
			for(int j = 0; j < scores[i].length; j++) {
				if(scores[i][j] > max) {
					max = scores[i][j];
				}
			}
			
			System.out.println((i + 1) + "번째 학생의 최고점 : " + max);
		}
		
		
//		3. 평균 최고점 구하기
//		평균이 가장 높은 학생의 평균점수와 몇 번째 학생인지 출력하세요.
//		출력
//
//		평균이 가장 높은 학생 : 3번째 학생
//		평균 : 94.2
		
		System.out.println("평균이 가장 높은 학생의 평균점수와 몇 번째 학생인지 출력하세요.");
		
		double maxAverage = 0;
		int maxIndex = 0;
		
		for(int i = 0; i < scores.length; i++) {
			int sum = 0;
			for(int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			double average = sum / (double)scores[i].length;
			
			if(maxAverage < average) {
				maxAverage = average;
				maxIndex = (i + 1);
			}
			
		}
		
		System.out.println("평균이 가장 높은 학생 : " + maxIndex + "번째 학생");
		System.out.println("평균 : " + maxAverage);
		
//		4. 특정 과목 최고점
//		index 4 과목의 최고 성적의 학생이 몇 번째 학생인지 출력하세요.
//		출력
//
//		index 4 과목의 최고 성적자는 3번째 학생
//		점수 : 97
		
		System.out.println("index 4 과목의 최고 성적의 학생이 몇 번째 학생인지 출력하세요.");
		
		int maxScore = 0;
		maxIndex = 0;
		
		for(int i = 0; i < scores.length; i++) {
//			for(int j = 0; j < scores[i].length; j++) {
//				필요 x
//			}
			if(maxScore < scores[i][4]) {
				maxScore = scores[i][4];
				maxIndex = (i + 1) ;
			}
		}
		
		System.out.println("index 4 과목의 최고 성적자는 " + maxIndex + "번째 학생");
		System.out.println("점수 : " + maxScore);
		
		
//		5. 일부 평균 최고점
//		시험과목 index 3 ~ 7 의 평균이 가장 높은 학생의 index를 구하여 출력하세요.
//		출력
//
//		평균이 가장 높은 학생 :  2번 index
//		평균 : 93.8
		
		System.out.println("시험과목 index 3 ~ 7 의 평균이 가장 높은 학생의 index를 구하여 출력하세요.");
		
		maxAverage = 0;
		maxIndex = 0;

		for(int i = 0; i < scores.length; i++) {
			int sum = 0;
			for(int j = 3; j <= 7; j++) {
				sum += scores[i][j];
			}
			double average = sum / (double)(7 - 3 + 1);
			if(maxAverage < average) {
				maxAverage = average;
				maxIndex = i;
			}
			
		}
		
		System.out.println("평균이 가장 높은 학생 : " + maxIndex + "번 index");
		System.out.println("평균 : " + maxAverage);
		
		
		
	}

}
