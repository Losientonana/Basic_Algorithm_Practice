package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S1 {
    public String solution(int[] intArray) {
            String answer ="";
        for (int i = 0; i < intArray.length; i++) {
            if (i == 0) {
                answer += intArray[i] + " ";
            }
            if (i == intArray.length - 1) {
                break;
            }
            if (intArray[i] < intArray[i + 1]) {
                answer += intArray[i+1] + " ";
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {

        S1 s1 = new S1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer token = new StringTokenizer(br.readLine());
        int[] intArray = new int[count];

        for (int i = 0; i < count; i++) {
            intArray[i] = Integer.parseInt(token.nextToken());
        }
        System.out.println(s1.solution(intArray));
    }
}


/*
위의 내 코드와 비교하면 i와 i+1을 비교하는 방식이 아닌, i와 i-1을 비교하는 방식이다.
이러한 방식이 가능한 이유는 0번째 인덱스는 고정으로 추가하고 시작하기 떄문에 가능한것 같다.
그리고 단순 배열로 넘기고, 그걸 값만 빼서 어레이리스트에 넣을 수 있다.

import java.util.*;
class Main {
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		for(int i=1; i<n; i++){
			if(arr[i]>arr[i-1]) answer.add(arr[i]);
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		for(int x : T.solution(n, arr)){
			System.out.print(x+" ");
		}
	}
}


 */