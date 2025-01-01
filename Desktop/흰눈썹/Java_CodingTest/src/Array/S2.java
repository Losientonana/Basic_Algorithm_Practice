package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class S2 {
    private int solution(int[] intArray) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(intArray[0]);
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
                if (!arrayList.contains(max)) {
                    arrayList.add(max);
                }
            }
        }
        return arrayList.size();

    }


    public static void main(String[] args) throws IOException {

        S2 s2 = new S2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer token = new StringTokenizer(br.readLine());
        int[] intArray = new int[count];

        for (int i = 0; i < count; i++) {
            intArray[i] = Integer.parseInt(token.nextToken());
        }
        System.out.println(s2.solution(intArray));
    }
}
