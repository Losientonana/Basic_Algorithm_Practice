package String;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S7 {

    public String solution(String str) {
boolean answer = true;
        char[] c = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            c[i] = Character.toUpperCase(c[i]);
        }
//        System.out.println(Arrays.toString(c));
        int lt = 0, rt = str.length()-1;

        for (int i = 0; i < str.length()/2 -1 ; i++) {
            if (c[lt] != c[rt]) {
                answer = false;
                break;
            }
            answer = true;
            lt ++;
            rt --;
        }
        if (answer == true) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args)throws IOException {
        S7 s7 = new S7();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(s7.solution(str));
    }
}



/* 스트링 빌더를 이용하여 문자를 뒤집어보고, 기존과 뒤집힌 문자가 같은지 확인, 단 이때 대소문자 무시하고 비교하는 equalsIgnoreCase를 사용하는 모습

import java.util.*;
class Main {
	public String solution(String str){
		String answer="NO";
		String tmp=new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) answer="YES";
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.print(T.solution(str));
	}
}

 */