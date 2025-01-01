package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S3 {

    public String solution(int s, int[] a, int[] b) {
        String answer = "";
        for(int i=0; i<s; i++){
            if(a[i]==b[i]) answer+="D";
            else if(a[i]==1 && b[i]==3) answer+="A";
            else if(a[i]==2 && b[i]==1) answer+="A";
            else if(a[i]==3 && b[i]==2) answer+="A";
            else answer+="B";
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {

        S3 s3 = new S3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        StringTokenizer stringTokenizer2 = new StringTokenizer(br.readLine());

        int[] array1 = new int[s];
        int[] array2 = new int[s];
        for (int i = 0; i < s; i++) {
            array1[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int i = 0; i < s; i++) {
            array2[i] = Integer.parseInt(stringTokenizer2.nextToken());
        }
        for(char x : s3.solution(s, array1, array2).toCharArray()) System.out.println(x);
    }
}
