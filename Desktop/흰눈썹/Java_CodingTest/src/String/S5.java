package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S5 {

    public String solution(String str) {

        char[] charArray = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;
        while (lt < rt) {
            if (!Character.isAlphabetic(charArray[lt])) {
                lt++;
            } else {
                if (!Character.isAlphabetic(charArray[rt])) {
                    rt--;
                } else {
                    char tmp = charArray[lt];
                    charArray[lt] = charArray[rt];
                    charArray[rt] = tmp;
                    lt ++;
                    rt --;
                }
            }
        }
        String s = String.valueOf(charArray);
        return s;
    }

    public static void main(String[] args) throws IOException {

        S5 s5 = new S5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(s5.solution(str));
    }
}
