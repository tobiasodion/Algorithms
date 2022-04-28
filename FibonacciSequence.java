import java.util.*;

public class FibonacciSequence {

  int RecursiveFib(int n) {
    if (n==0){
      return 0;
    }

    else if (n==1){
      return 1;
    }

    else{
      return RecursiveFib(n-1) + RecursiveFib(n-2);
    }
  }

  int IterativeFib(int n) {
    int nextTerm = 0;
    int f0 = 0, f1 = 1;

    if (n == 0) {
      System.out.print(f0);
    }

    else if (n == 1) {
      nextTerm = 1;
      System.out.print(f0 + " + " + f1);
    }

    else {
      System.out.print(f0 + " + " + f1);

      int currentTerm;
      int previousTerm;
      
      for (int i = 1; i < n; i++) {
        previousTerm = f0;
        currentTerm = f1;
        
        nextTerm = previousTerm + currentTerm;
        System.out.print(" + " + nextTerm );

        f1 = nextTerm;
        f0 = currentTerm;
      }
    }

    return nextTerm;
  }

  public static void main(String args[]) {
      int nTerm, n;
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter a number: ");
      n = sc.nextInt();

      FibonacciSequence obj = new FibonacciSequence();

      nTerm = obj.IterativeFib(n);
      System.out.print("\nIterative Output - The " + n + "th term of the fibonacci sequence is " + nTerm);

      nTerm = obj.RecursiveFib(n);
      System.out.print("\nRecursive Output - The " + n + "th term of the fibonacci sequence is " + nTerm);
  }
};
