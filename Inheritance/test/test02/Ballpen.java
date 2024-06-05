package test.test02;

class Ballpen extends SharpPencil{ // 볼펜
//    private int amount; // 남은 량
    private String color; // 볼펜의 색

    // overrideSharpPencil
    @Override
    public int getAmount() { 
        return super.getAmount(); 
    }
    
    // override SharpPencil
    @Override
    public void setAmount (int amount) { 
        super.setAmount(amount);; 
    }
    
    public String getColor() { 
        return color; 
    }
    public void setColor(String color) { 
        this.color = color; 
    }
}
