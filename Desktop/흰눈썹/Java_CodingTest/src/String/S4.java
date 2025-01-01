package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S4 {

    public String solution(String[] str) {
        String result = "";
        for (int i = 0; i < str.length; i++) {
            result += str[i];
            if (i != str.length - 1) {
                result += "\n";
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        S4 s4 = new S4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());
        String[] str = new String[line];

        for (int i = 0; i < str.length; i++) {

            str[i] = br.readLine();
            StringBuffer sb = new StringBuffer(str[i]);
            str[i] = sb.reverse().toString();

        }
        System.out.print(s4.solution(str));
    }
}


/*


import java.util.*;
class Main {
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer=new ArrayList<>();
		for(String x : str){
			char[] s=x.toCharArray();
			int lt=0, rt=x.length()-1;
			while(lt<rt){
				char tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
			String tmp=String.valueOf(s);
			answer.add(tmp);
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		String[] str=new String[n];
		for(int i=0; i<n; i++){
			str[i]=kb.next();
		}
		for(String x : T.solution(n, str)){
			System.out.println(x);
		}
	}
}



 */