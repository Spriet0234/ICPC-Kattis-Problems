import java.util.*;
public class nineknights{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        HashSet <Integer> hs = new HashSet<Integer>();
        char input;
        int num;
        int count=0;
        boolean isTrue=true;
        
        for(int i=0;i<5;i++){
            char[] arr = scan.nextLine().toCharArray();
            for(int j=0;j<5;j++){
            input = arr[j];
            num = ((i+1)*10)+j+1;
            
            if(input == 'k'){
                hs.add(num);
            }
            }
        }
        for(int c : hs){
            count++;
            if(hs.contains(c+21) || hs.contains(c+19)||hs.contains(c+12)||hs.contains(c-8)||hs.contains(c-21)||hs.contains(c-19)||hs.contains(c-12)||hs.contains(c+8)){
                isTrue=false;
        }
        }
        if(count!=9){
            isTrue=false;
        }
        if(isTrue){
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }
    }
}
