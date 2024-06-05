package test.test03;

public class OMRCard2 {

	private String studentId;
	private String name;
	private int[] marking = new int[5];
	
	public OMRCard2(String studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}
	
	// 1번문제 : 마킹3
	// 2번문제 : 마킹5	
	public void setMarking(int number, int marking){
		this.marking[number - 1] = marking;
	}
	
	public void setMarking(int marking1, int marking2, int marking3, int marking4, int marking5) {
		marking[0] = marking1;
		marking[1] = marking2;
		marking[2] = marking3;
		marking[3] = marking4;
		marking[4] = marking5;
	}
	
	public void printInfo() {
		System.out.println("학번 : " + studentId + " 이름 : " + name);
		
		for(int i = 0; i < marking.length; i++) {
			System.out.print(marking[i] + " ");
			
		}
		System.out.println();
	}
	
	public int[] getMarking() {
		return marking;
	}
	
	public String getStudentId() {
		return studentId;
	}
	
	public String getName() {
		return name;
	}
	
	
	
}
