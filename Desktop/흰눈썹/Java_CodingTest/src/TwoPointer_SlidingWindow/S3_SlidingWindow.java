package TwoPointer_SlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S3_SlidingWindow {

    public int solution(int n, int k, int[] arr) {
        int answer = 0, sum = 0;
        for (int i = 0; i < k; k++) {
            sum += arr[i];
            answer = sum;
        }

        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]); // 새로운 원소를 더하고 가장 오래된 원소를 뺌
            answer = Math.max(answer, sum); // 최대 합 업데이트
        }
        return answer;

    }

    public static void main(String[] args) throws IOException {
        S3_SlidingWindow s3SlidingWindow = new S3_SlidingWindow();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        System.out.println(s3SlidingWindow.solution(n,k,arr));

    }
}
