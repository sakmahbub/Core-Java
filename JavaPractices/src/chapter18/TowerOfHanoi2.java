
package chapter18;

import java.util.Scanner;

public class TowerOfHanoi2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of disks: ");
        int n=sc.nextInt();
        System.out.println("The moves are: ");
        moveDisks(n, 'X', 'Y', 'Z');
    }
    
    
    static void moveDisks(int n, char fromTower, char toTower, char auxTower){
        if(n==1){
            System.out.println("Move disk: " + n + " from "+ fromTower + " to "+ toTower);
        }else{
            moveDisks(n-1, fromTower, auxTower, toTower );
            System.out.println("Move disk: "+ n + " from "+ fromTower + " to "+ toTower );
            moveDisks(n-1, auxTower, toTower, fromTower);
        
        }
    
    }
}
