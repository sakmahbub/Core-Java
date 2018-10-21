package chapter8;

public class Computer {

    int SINo;
    String barnd;

    public int getSINo() {
        return SINo;
    }

    public void setSINo(int SINo) {
        this.SINo = SINo;
    }

    public String getBarnd() {
        return barnd;
    }

    public void setBarnd(String barnd) {
        this.barnd = barnd;
    }

    public static void main(String[] args) {
        Computer Computer1 = new Computer();
        Computer1.setSINo(123654);
        Computer1.setBarnd("HP");
        
        System.out.println("SI NO: " + Computer1.getSINo());
        System.out.println("Barnd: " + Computer1.getBarnd());
        
        

    }

}
