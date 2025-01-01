package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S9 {
    public int solution(int[][] arr,int n) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                count += arr[i][j];
                if (count > max) {
                    max = count;
                }
            }
        }
        for (int i = 0; i < n; i++) {
                count += arr[i][i];
            }

        if (count > max) {
            max = count;
        } else {
            count = 0;
        }

        for (int i = n-1; i > 0; i--) {
            count += arr[i][i];
        }
        if (count > max) {
            max = count;
        }else {
            count = 0;
        }

        System.out.println(max);
        return 0;
    }

    public static void main(String[] args) throws IOException {

        S9 s9 = new S9();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        System.out.println(s9.solution(arr,n));
    }
}
