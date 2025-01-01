package TwoPointer_SlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3 {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int sum = 0;
        int p1 = 0;

        while (m < n) {
            for (int i = p1; i < m; i++) {
                sum += arr[p1++];
                System.out.println(sum);
            }
                if (sum > answer) answer = sum;
                p1++;
                m++;
                sum = 0;
            }
        return answer;
    }

    public static void main(String[] args) throws IOException {

        S3 s3 = new S3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        int[] arr = new int[n];
        StringTokenizer stringTokenizer2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stringTokenizer2.nextToken());
        }

        System.out.println(s3.solution(n,m,arr));
    }
}
