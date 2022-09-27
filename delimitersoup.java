import java.util.*;
public class delimitersoup{
    public static void main(String[]args){
        Scanner scnr = new Scanner(System.in);
        int num = scnr.nextInt();
        scnr.nextLine();
        char[] arr = scnr.nextLine().toCharArray();
        
        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<num;i++){
            if(arr[i] == ' ') continue;
            switch(arr[i]){
                case '(':
                stack.push('(');
                break;
                case '[':
                stack.push('[');
                break;
                case '{':
                stack.push('{');
                break;
                
                case ')':
                if(stack.isEmpty() || stack.peek() != '('){
                    System.out.print(arr[i] + " " + i);
                    return;
                }
                stack.pop();
                break;
                
                case '}':
                if(stack.isEmpty() || stack.peek() != '{'){
                    System.out.print(arr[i] + " " + i);
                    return;
                }
                stack.pop();
                break;
                
                case ']':
                if(stack.isEmpty() || stack.peek() != '['){
                    System.out.print(arr[i] + " " + i);
                    return;
                }
                stack.pop();
                break;
            }
        }
        System.out.println("ok so far");
    }
}
