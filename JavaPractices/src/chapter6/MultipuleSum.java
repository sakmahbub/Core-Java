
package chapter6;

public class MultipuleSum {
    public static void main(String[] args) {
        MultipuleSum m =new MultipuleSum();
        int rs=m.sum(1,2,3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Total Sum: " +rs);
        
    }
    public int sum(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j){
    int mm = a+b+c+d+e+f+g+h+i+j;
    return mm;
    
    }
}
