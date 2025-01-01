package Array;
//시간 복잡도 터짐
/*
package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S4 {

    public String solution(int n) {
        String answer = "";
        for (int i = 1; i < n+1; i++) {
            answer += recursive(i) + " ";
        }
        return answer;
    }
    
    public static int recursive(int d) {
        if (d == 0) {
            return 0;
        } else if (d == 1) {
            return 1;
        } else {
            return recursive(d - 1) + recursive(d - 2);
        }
    }
    public static void main(String[] args) throws IOException {

        S4 s4 = new S4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        System.out.println(s4.solution(i));
    }
}
*/

import java.util.*;
public class S4 {
    public int[] solution(int n){
        int[] answer=new int[n];
        answer[0]=1;
        answer[1]=1;
        for(int i=2; i<n; i++){
            answer[i]=answer[i-2]+answer[i-1];
        }
        return answer;
    }
    public static void main(String[] args){
        S4 T = new S4();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        for(int x :T.solution(n)) System.out.print(x+" ");
    }
}

// 만약 배열을 사용하지 않아야하는 조건이 있을경우

/*

import java.util.*;
class Main {
    public void solution(int n){
        int a=1, b=1, c;
        System.out.print(a+" "+b+" ");
        for(int i=2; i<n; i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        T.solution(n);
    }
}
*/