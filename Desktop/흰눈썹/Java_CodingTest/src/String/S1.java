package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1 {
    public int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        // 기본적인 for문을 사용
        //        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == t) {
//                answer++;
//            }
//        }

        //향상된 for문을 사용
        for (char x : str.toCharArray()) {
            if (x == t) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        S1 T = new S1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char s = br.readLine().charAt(0);
        System.out.print(T.solution(str, s));
    }
}
