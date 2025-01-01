package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S8 {

    public String solution(String str) {

        String answer = "NO";

        StringBuffer stringBuffer = new StringBuffer(str);
        String s = str.toUpperCase().replaceAll("[^A-Z]", "");
        String reversed = stringBuffer.reverse().toString().toUpperCase().replaceAll("[^A-Z]", ""); // 대문자로 변환하고 특수문자 제거
        System.out.println(s);
        System.out.println(reversed);

        if (s.equals(reversed)) { // equals() 메서드 사용
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {

        S8 s8 = new S8();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(s8.solution(str));
    }
}
