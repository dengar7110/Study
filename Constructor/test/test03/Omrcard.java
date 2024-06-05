package test.test03;

public class Omrcard {
	
	private String name;
	private String number;
	private int[] answers;
	
	Omrcard(String name, String number){
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int[] getAnswers() {
		return this.answers;
	}

	public void setAnswers(int answer1, int answer2, int answer3, int answer4, int answer5) {
		this.answers = new int[] {answer1, answer2, answer3, answer4, answer5};
		
	}
	
	
	
	
}
