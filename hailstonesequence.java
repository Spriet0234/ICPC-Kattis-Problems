import java.util.*;
public class hailstone2{
    public static void main(String[]args){
        Scanner scnr = new Scanner(System.in);
        double n = scnr.nextDouble();
        if(n == 1){
            System.out.println("1");
            return;
        }
        if(n == 0){
            System.out.println("0");
            return;
        }
        int count=1;
        
        while(n != 1){
            
            if(n%2 == 0){ //even
                n = n/2;
            }else{ //odd
                n=n*3 +1;
            }
            
            count++;
        }
        System.out.println(count);
    }
    
    
}
