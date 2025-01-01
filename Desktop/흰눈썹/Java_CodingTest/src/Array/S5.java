package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S5 {
    public int solution(int n) {
        int answer = 0;
        int[] array = new int[n + 1];

        for (int i = 2; i < n; i++) {
            if (array[i] == 0) {
                answer ++;
                for (int j = i; j <= n; j = j + i) {
                    array[j] = 1;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args)throws IOException {
        S5 s5 = new S5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(s5.solution(n));
    }
}
