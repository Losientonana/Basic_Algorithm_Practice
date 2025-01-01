package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S2 {
    public StringBuilder solution(String str) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isUpperCase(charArray[i])) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            } else {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
            sb.append(charArray[i]);
        }

        return sb;
    }

    public static void main(String[] args) throws IOException {
        S2 s2 = new S2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.print(s2.solution(str));
    }
}

/* 정답풀이

import java.util.*;
class Main {
	public String solution(String str){
		String answer="";
		for(char x : str.toCharArray()){
			if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
			else answer+=Character.toLowerCase(x);

		}
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

/* 아스키 넘버를 활용한 버전.
import java.util.*;
class Main {
	public String solution(String str){
		String answer="";
		for(char x : str.toCharArray()){
			if(x>=97 && x<=122) answer+=(char)(x-32);
			else answer+=(char)(x+32);
		}
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