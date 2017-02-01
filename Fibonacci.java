//import java.util.Scanner;  
  
public class Fibonacci {  
  
    public static void main(String[] args) {  
      //  Scanner scanner = new Scanner(System.in);  
      //  System.out.println("Please input this fibonacci n:");  
      //  int n = scanner.nextInt(); // 假设输入为大于零的整数  
       int  n=30;
          
        for(int i = 1; i <= n; i++){  
            System.out.print(fibonacci(i)+" ");  
        }  
       
    }  
      
    // 递归实现方式  
    public static int fibonacci(int n){  
        if(n <= 2){  
        	
            return 1;  
        }else{  
            return fibonacci(n-1) + fibonacci(n-2);  
        }  
    }  
      
 
}  
