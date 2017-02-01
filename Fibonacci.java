//import java.util.Scanner;  
  
public class Fibonacci {  
	
	 public static  int countRecursive=0;
  
    public static void main(String[] args) {  
      //  Scanner scanner = new Scanner(System.in);  
      //  System.out.println("Please input this fibonacci n:");  
      //  int n = scanner.nextInt(); // input an integer which is bigger than 0
       int  n=30;
      
      //  for(int i = 1; i <= n; i++){  
      //      System.out.print(fibonacci(i)+" ");  
      //  }  
        
        System.out.println(" fibonacci(30)=" +fibonacci(n) );
        System.out.println("countRecursive="+countRecursive);
        
        
       
    }  
      
    // recursive way
    public static int fibonacci(int n){  
    	countRecursive++;
        if(n == 0){  
        	
            return 0;  
        }
         else if(n == 1){  
        	
            return 1;  
        }else{  
            return fibonacci(n-1) + fibonacci(n-2);  
        }  
    }  
      
 
}  
