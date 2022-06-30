package chapter05;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[4];

        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }

        reverse(a);

    }

    public static int[] reverse(int[] org){

        for(int i=org.length;i>0;i--){
            System.out.println(org[i-1]+" ");
        }

        return org;
    }
}
