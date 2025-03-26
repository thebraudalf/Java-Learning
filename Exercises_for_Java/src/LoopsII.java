import java.util.*;
import java.io.*;

// question: https://www.hackerrank.com/challenges/java-loops/problem
public class LoopsII{
    public static double power(double b, int e){
        // if expo is 0 then return 1
        if(e == 0) return 1;

        // if expo is less than 0 then return 1.0
        if(e < 0) return 1 / power(b, -e);

        // increase the temp exponentially
        double temp = power(b, e / 2);

        // if expo is equals to 1 then square temp
        // else square temp with base
        if(e % 2 == 0){
            return temp * temp;
        } else {
            return b * temp * temp;
        }
    }

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            // printing the corresponding series
            for(int j=0; j<n; j++){
                a += power(2, j) * b;
                System.out.print(a + " ");
            }

            System.out.println();
        }
        in.close();
    }
}