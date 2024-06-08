package test.test02;

class FountainPen extends Ballpen { // 만년필
	
    private String color; // 볼펜의 색

    public void refill (int n) { 
        setAmount(n); 
    }
}
