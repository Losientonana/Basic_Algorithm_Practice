package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3 {

    public String solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String[] str = new String[st.countTokens()];
        for (int i = 0; i < str.length; i++) {
            str[i] = st.nextToken();
        }

        int max = 0;
        int index = 0;

        for (int j = 0; j < str.length; j++) {
            if (max < str[j].length()) {
                max = str[j].length();
                index = j;
            }
        }

        return str[index]; // 가장 긴 단어를 반환
    }

    public static void main(String[] args) throws IOException {
        S3 s3 = new S3();
        System.out.println(s3.solution()); // solution 메소드를 호출하여 결과 출력
    }
}

// indexOf()와 substring()을 사용한 버전
/*

import java.util.*;
class Main {
	public String solution(String str){
		String answer="";
		int m=Integer.MIN_VALUE, pos;
		while((pos=str.indexOf(' '))!=-1){
			String tmp=str.substring(0, pos);
			int len=tmp.length();
			if(len>m){
				m=len;
				answer=tmp;
			}
			str=str.substring(pos+1);
		}
		if(str.length()>m) answer=str;
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		System.out.print(T.solution(str));
	}
}
*/