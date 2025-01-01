package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S7 {

    public int Solution(int n,int[] arr) {

        int answer = 0;
        int value = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                value = 0;
            } else {
                value++;
                answer += value;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        S7 s7 = new S7();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(s7.Solution(n,arr));
        br.close();
    }

    }

