package TwoPointer_SlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class S1_twoPointer {
    public String solution(int n,int m,int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (a[p1] > b[p2]) {
                answer.add(b[p2++]);
            } else answer.add(a[p1++]);
        }

        while (p1 < n) answer.add(a[p1++]);
        while (p2 < m) answer.add(b[p2++]);

        return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        S1_twoPointer s1_twoPointer = new S1_twoPointer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer stringTokenizer1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(stringTokenizer1.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] b = new int[m];
        StringTokenizer stringTokenizer2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(stringTokenizer2.nextToken());
        }
        System.out.println(s1_twoPointer.solution(n,m,a,b));
    }
}
