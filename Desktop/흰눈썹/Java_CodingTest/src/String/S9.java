package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S9 {
    public int solution(String str) {

        String answer = "";
        StringBuffer stringBuffer = new StringBuffer(answer);
        char[] charArray = str.toCharArray();
        for (char x : charArray) {
            if (x >= 48 && x <= 58) {
                stringBuffer.append(x);
            }
        }
        int i = Integer.parseInt(String.valueOf(stringBuffer));
        return i;

    }

    public static void main(String[] args) throws IOException {
        S9 s9 = new S9();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(s9.solution(str));

    }
}



/*

import java.util.*;
class Main {
	public int solution(String s){
		//int answer=0;
		String answer="";
		for(char x : s.toCharArray()){
			//if(x>=48 && x<=57) answer=answer*10+(x-48);
			/*if(Character.isDigit(x)){
				answer=answer*10+ Character.getNumericValue(x);
			}*/
/*
			if(Character.isDigit(x)) answer+=x;
		}
                return Integer.parseInt(answer);
	}

public static void main(String[] args){
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    String str=kb.next();
    System.out.print(T.solution(str));
}
}

 */