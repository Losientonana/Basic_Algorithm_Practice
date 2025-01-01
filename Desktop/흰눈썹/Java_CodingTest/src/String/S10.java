package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S10 {

    public String solution(String s, char t) {

        int distance = 1000;
        int[] intArray = new int[s.length()];
        int[] intArray2 = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {

                distance = 0;
                intArray[i] = distance;
            } else {
                distance++;
                intArray[i] = distance;
            }
        }

        for (int i = s.length() -1; i >= 0; i--) {
            if (s.charAt(i) == t) {

                distance = 0;
                intArray2[i] = distance;
            } else {
                distance++;
                intArray2[i] = distance;
                if (intArray2[i] > intArray[i]) {
                    intArray2[i] = intArray[i];
                    // intArray[2] = Math.min(intArray[i],intArray[2]
                    // 이렇게 Math.min을 사용해서 값비교후 더 작은값을 넣을수 있다.
                }
            }
        }

        String answer = "";
        for (int x : intArray2) {
             answer = answer + x + " ";
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {

        S10 s10 = new S10();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sr = new StringTokenizer(br.readLine());

        String s = sr.nextToken(); // 첫 번째 토큰
        char t = sr.nextToken().charAt(0); // 두 번째 토큰
        System.out.println(s10.solution(s, t));
    }
}
