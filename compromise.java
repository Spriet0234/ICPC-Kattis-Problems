import java.util.*;
public class compromise{
    public static void main(String[]args){
     Scanner scan = new Scanner(System.in);
     int num = scan.nextInt();
     char inp;
     
     for(int i=0;i<num;i++){
         int row = scan.nextInt();
         int col = scan.nextInt();
         scan.nextLine();
         int [] arr = new int[col];
         for(int j=0;j<row;j++){
             String s = scan.nextLine();
             for(int k=0;k<col;k++){
                if(s.charAt(k) == '1') arr[k]++;
                if(s.charAt(k) == '0') arr[k]--;

             }
         }
         for(int l=0;l<col;l++){
             if(arr[l] < 0){
                 System.out.print("0");
             }else{
                 System.out.print("1");
             }
             
         }
         System.out.println();
     }
    }
}
