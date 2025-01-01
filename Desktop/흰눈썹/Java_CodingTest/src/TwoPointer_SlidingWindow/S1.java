package TwoPointer_SlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class S1 {

    public String solution(List<Integer> a, List<Integer> b) {

        StringBuilder stringBuilder = new StringBuilder();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(a);
        arrayList.addAll(b);

        Collections.sort(arrayList);
        for (Integer x : arrayList) {
            stringBuilder.append(x).append(" ");
        }

        if (stringBuilder.length() > 0) {
            stringBuilder.setLength(stringBuilder.length() -1);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) throws IOException {

        S1 s1 = new S1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a.add(Integer.valueOf(stringTokenizer.nextToken()));
        }

        int n2 = Integer.parseInt(br.readLine());
        StringTokenizer stringTokenizer2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n2; i++) {
            b.add(Integer.valueOf(stringTokenizer2.nextToken()));
        }
        System.out.println(s1.solution(a,b));
    }
}
