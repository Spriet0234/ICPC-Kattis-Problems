import java.util.*;
public class apples{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        scan.nextLine();
        char[][] arr = new char[row][col];
        int [] bot = new int[col];
        int k=0;
        
        for(int i=0;i<row;i++){
            arr[i] = scan.nextLine().toCharArray();
        }
        for(int i=0;i<col;i++){
            bot[i] = row-1;
        }
            
        for(int i=row-1;i>=0;i--){
            for(int j=0;j<col;j++){

            if(bot[j] == i){
                if(arr[i][j] =='a') bot[j]--;
                if(arr[i][j] =='#') bot[j] = i-1;
            }else{
                if(arr[i][j] =='#') bot[j] = i-1;
                if(arr[i][j] =='a'){
                    arr[i][j] = '.';
                    arr[(bot[j])][j] = 'a';
                    bot[j] = bot[j]-1;
                }
            }
            }
            k++;
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
   
    }
}
