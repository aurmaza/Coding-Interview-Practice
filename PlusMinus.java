import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    
    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    double positive = 0;
    double negative = 0;
    double zeros = 0;
    int length = arr.size();

        for(int i = 0; i < length; i++){
         
            if(arr.get(i) < 0){
                negative++;
            
            }else if(arr.get(i) > 0){
                positive++;
            }else if (arr.get(i) == 0){
                zeros++;
            }
            
        }
        DecimalFormat dc = new DecimalFormat(".000000");
        positive = positive / length;
        negative = negative / length;
        zeros = zeros / length;
        System.out.println(dc.format(positive));
  System.out.println(dc.format(negative));
  System.out.println(dc.format(zeros));

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
