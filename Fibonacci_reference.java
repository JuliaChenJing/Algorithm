// This code implements two approaches to compute the n-th number of the
// Fibonacci sequence defined as f(n) = f(n-1) + f(n-2) with f(0)=1, f(1)=1.
// The method fib1() is a classical recursive implementation.
// The methid fib2() is a memorized recursion. It runts in a linear time.
// To prevent overflow in this simple implementation, n should not exceed 46.
//
// 1. Store this code in file Fibonacci.java
// 2. Compile it with java Fibonacci.java
// 3. Run it with java Fibonacci n, where n is a parameter. To see a
// difference in the running time, apply it with n=40.

public class Fibonacci
{
  private static int[] fibNumbers;

  public static void main(String[] args)
  {
    int n = getNumber(args);        // get n from the command line
    fibNumbers = new int[n];        // create and initialize array for
    for (int i=0; i<n; i++)         // computed Fibonacci numbers
      fibNumbers[i] = Integer.MAX_VALUE;
    System.out.print("Applying the memorized recursion: fib(" + n + ")=");
    int f = fib2(n);                // apply the accelerated method 
    System.out.println(f);

/*
    // now start the classical method
    System.out.print("Applying the classical recursion: fib(" + n + ")=");
    f = fib1(n);
    System.out.println(f);
*/
  }

  // classical recursive implementation of the Fibonacci sequence
  // it takes exponential time to evaluate the n-th number
  public static int fib1(int n)
  {
    if (n <= 1) return(n);   // termination condition
    return(fib1(n-1) + fib1(n-2));
  }

  // memorized recursive implementation of the same sequence
  public static int fib2(int n)
  {
    if (n <= 1) return(n);   // termination condition
    int a, b;

    if (fibNumbers[n-1] < Integer.MAX_VALUE) // if the (n-1)-th Fib. number
      a = fibNumbers[n-1];   // is already computed, take it from the table
    else
    {                        // otherwise apply the recursion to compute it
      a = fib2(n-1);         // and store in variable a
      fibNumbers[n-1] = a;
    }

    if (fibNumbers[n-2] < Integer.MAX_VALUE) // same approach for the (n-2)-th
      b = fibNumbers[n-2];                   // number
    else
    {
      b = fib2(n-2);                         // store it in b
      fibNumbers[n-2] = b;
    }

    return(a+b);
  }

  public static int getNumber(String[] ss)
  {
    int n = 0;
    if (ss.length == 0)
    {
      System.out.println("No input");
      System.exit(0);
    }
    try
    {
      n = Integer.parseInt(ss[0]);
      if (n < 0 || n > 46)
      {
        System.out.println("The parameter must be in [0..46]");
        System.exit(0);
      }
    }
    catch(NumberFormatException e)
    {
      System.out.println("Invalid parameter");
      System.exit(0);
    }
    return(n);
  }
}
