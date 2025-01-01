package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S12 {

    public String solution(int count, String str) {

        String answer = "";

        int startPoint = 0;
        int endPoint = count * 7;
        for (int i = 1; i < count+1; i++) {
            String sub1 = str.substring(startPoint, i*7);
            sub1 = sub1.replace("#", "1").replace("*","0");
            int i1 = Integer.parseInt(sub1,2);
            char value = (char) (i1);
            answer += value;
            startPoint += 7;
        }
        return answer;
    }

    public static void main(String[] args)throws IOException {

        S12 s12 = new S12();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String str = br.readLine();

        System.out.println(s12.solution(count, str));
    }
}
