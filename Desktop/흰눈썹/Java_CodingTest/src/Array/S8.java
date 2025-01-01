package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S8 {

    public String solution(int n, int[] arr) {

        String answer = "";

        int[] arr2 = new int[n];
        int count = 1;
        for (int i = 0; i < n; i++) {
            arr2[i]++;
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    arr2[i]++;
                }
            }
            answer += arr2[i] + " ";
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        S8 s8 = new S8();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        System.out.println(s8.solution(n, arr));
    }
}
