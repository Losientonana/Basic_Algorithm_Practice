package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S11 {

    public String solution(String str) {
        String answer = "";
        str = str + " ";
        int cnt = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                if (cnt == 1) {
                    answer += String.valueOf(str.charAt(i));
                } else {
                    answer += String.valueOf(str.charAt(i)) + cnt;
                    cnt = 1;
                }
            }
        }
            return answer;
        }

        public static void main (String[]args) throws IOException {
            S11 s11 = new S11();

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            System.out.println(s11.solution(str));
        }
}
