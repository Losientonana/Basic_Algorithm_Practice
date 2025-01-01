package TwoPointer_SlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S2 {

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer  = new ArrayList<>();

        ArrayList<Integer> answer2  = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (a[p1] > b[p2]) {
                answer.add(b[p2++]);
            } else answer.add(a[p1++]);
        }

        while (p1 < n) answer.add(a[p1++]);
        while (p2 < m) answer.add(b[p2++]);

        Collections.sort(answer);
        System.out.println(answer);
        for (int i = 0; i < answer.size() - 1; i++) {
            if (answer.get(i) == answer.get(i + 1)) {
                if(!answer2.contains(answer.get(i)))
                answer2.add(answer.get(i));
            }
        }

        return answer2;
    }

    public static void main(String[] args) throws IOException {
        S2 s2 = new S2();
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
        for (int x: s2.solution(n,m,a,b)) System.out.print(x + " ");
    }
}
