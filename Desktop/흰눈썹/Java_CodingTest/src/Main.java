import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        String str = "Hello, World!";

        // 문자열을 문자형 배열로 변환
        char[] charArray = str.toCharArray();

        // 문자형 배열의 특정 인덱스에 접근
        for (int i = 0; i < charArray.length; i++) {
            System.out.println("Index " + i + ": " + charArray[i]);
        }
    }

}