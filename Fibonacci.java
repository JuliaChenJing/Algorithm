//import java.util.Scanner;  
  
public class Fibonacci {  
	
	private static int[] fibNumbers;
	 public static  int countRecursive=0;
	 public static  int countMemoized=0;
  
    public static void main(String[] args) {  
      //  Scanner scanner = new Scanner(System.in);  
      //  System.out.println("Please input this fibonacci n:");  
      //  int n = scanner.nextInt(); // input an integer which is bigger than 0
       int  n=30;
       fibNumbers = new int[n];        // create and initialize array for
       for (int i=0; i<n; i++)         // computed Fibonacci numbers
    	      fibNumbers[i] =Integer.MAX_VALUE;
      
      //  for(int i = 1; i <= n; i++){  
      //      System.out.print(fibonacci(i)+" ");  
      //  }  
        
        System.out.println("1 fibonacci(30)=" +fibonacci(n) );
        System.out.println("  countRecursive="+countRecursive);
        
        System.out.println("2 fibonacci(30)=" +fib2(n) );
        System.out.println("  countMemoized="+countMemoized);
        
        
       
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
      
    
    public static int fib2(int n)
    {
      countMemoized++;
      if (n <= 1) return(n);   // termination condition
      int a, b;

      if (fibNumbers[n-1] <Integer.MAX_VALUE) // if the (n-1)-th Fib. number
        a = fibNumbers[n-1];   // is already computed, take it from the table
      else
      {                        // otherwise apply the recursion to compute it
        a = fib2(n-1);         // and store in variable a
        fibNumbers[n-1] = a;
      }

      if (fibNumbers[n-2] <Integer.MAX_VALUE) // same approach for the (n-2)-th
        b = fibNumbers[n-2];                   // number
      else
      {
        b = fib2(n-2);                         // store it in b
        fibNumbers[n-2] = b;
      }

      return(a+b);
    }

}  

/*
1 fibonacci(30)=832040
countRecursive=2692537
2 fibonacci(30)=832040
countMemoized=31
*/
