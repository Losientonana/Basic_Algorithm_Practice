package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S6 {

    public String solution(String str) {

        String answer = "";

        StringBuffer st = new StringBuffer(answer);
        for (int i = 0; i < str.length(); i++) {
            if (i == str.indexOf(str.charAt(i))) {
                st.append(str.charAt(i));
            }
        }
        String s = st.toString();
        return s;
    }

    public static void main(String[] args) throws IOException {
        S6 s6 = new S6();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(s6.solution(str));
    }
}
