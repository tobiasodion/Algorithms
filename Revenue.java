import java.util.Arrays;
import java.util.Scanner;

public class Revenue {
    public static long maxAdRev( long[] A, long[] B, int N ){
        Arrays.sort( A );
        Arrays.sort( B );
        long maxDotProduct = 0;
        for( int i=0; i < N; ++i )
            maxDotProduct += A[ i ] * B[ i ];
        return maxDotProduct;
    }

    public static void main( String[] args ){
        Scanner input = new Scanner( System.in );
        
        System.out.print("Enter the number of slots available: ");
        int N = input.nextInt();
        long prices[] = new long[ N ];
        long clicks[] = new long[ N ];
        
        System.out.println("Enter the Prices:");
        
        for( int i=0; i < N; i++){
        	System.out.print("P" + i + ": ");
        	prices[i] = input.nextLong();
        }
        
        System.out.println("\nEnter the Clicks Per Day: ");
        for( int i=0; i < N; i++){
        	System.out.print("C" + i + ": ");
        	clicks[i] = input.nextLong();
        }
        
        long ans = maxAdRev( prices, clicks, N );
        System.out.println( "\nThe maximum value is: " + ans );
    }
}
