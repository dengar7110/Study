package test.test02;

class FountainPen extends Ballpen{ // 만년필
//    private int amount; // 남은 량
//    private String color; // 볼펜의 색
    
    // override SharpPencil
    @Override
    public int getAmount() { 
        return super.getAmount(); 
    }
    // override SharpPencil
    @Override
    public void setAmount (int amount) { 
    	super.setAmount(amount);
    }
    
    // override Ballpen
    @Override
    public String getColor() { 
        return super.getColor(); 
    }
    
    // override Ballpen
    @Override
    public void setColor(String color) { 
       super.setColor(color);
    }
    
    public void refill (int n) { 
        setAmount(n); 
    }
}
