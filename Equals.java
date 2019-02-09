import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Equals {

    // Complete the equal function below.
    static int equal(int[] arr) {
        Arrays.sort(arr);
        int sum,i,j,l,x1,x3,x5,t;
        int count=0;
        l=arr.length;
        for(i=1;i<l;i++){
            if((arr[i-1]<arr[i])&&(arr[i]!=arr[l-1])){
                x5=0;
                x3=0;
                x1=0;
                sum=arr[i]-arr[i-1];
                t=sum;
                x5=t/5;
                t=t%5;
                x3=t/3;
                t=t%3;
                x1=t;
                count=count+x1+x3+x5;
                for(j=i;j<l;j++){
                    arr[j]=arr[j]+sum;
                }
            }
        }
        return (count+1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            int result = equal(arr);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
