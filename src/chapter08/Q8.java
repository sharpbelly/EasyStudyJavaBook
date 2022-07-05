package chapter08;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        StringTokenizer st = new StringTokenizer(s, " ");

        String arr[] = new String[st.countTokens()];

        int cnt=0;
        for(String a : arr){
            cnt++;
        }

        System.out.println("단어 개수 : " + cnt);

        for(int i=0;i<cnt;i++){
            arr[i] = st.nextToken();
        }

        Arrays.sort(arr);

        for(String a : arr){
            System.out.print(a+", ");
        }
    }
}
