/*
The solution of the following problem 
https://www.hackerrank.com/contests/codeagon/challenges/is-it-t-shaped
*/
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

public class Solution {

    // Complete the solve function below.
    static String solve(List<List<Integer>> grid) {
       int i,j;
       // System.out.println("call");
        int res=0;
        int arr[]=new int[5];
        for(i=0;i<grid.size();i++){
            List<Integer> tmp=grid.get(i);
            int x=tmp.get(0);
            int y=tmp.get(1);
            arr[i]=x+y;
            
        }
        Arrays.sort(arr);
        boolean flag=false,mark=false;
        for(i=0;i<4;i++){
           //System.out.println(arr[i]);
             if((arr[i+1]-arr[i])==1)
                continue;
            else if((arr[i+1]-arr[i]==0)&&!flag)
                flag=true;
            else
            {
                mark=true;
                break;
            }
        }
        if(!mark &&flag)

        return "Yes";
        return "No";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                List<List<Integer>> points = new ArrayList<>();

                IntStream.range(0, 5).forEach(i -> {
                    try {
                        points.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                        );
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                String result = solve(points);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
