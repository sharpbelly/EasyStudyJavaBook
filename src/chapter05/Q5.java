package chapter05;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = {0,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < 10; i++) {
            a[i] = in.nextInt();

            if(a[i]>=0&&a[i]<10){
                b[0]++;
            }
            else if(a[i]>=10&&a[i]<20){
                b[1]++;
            }
            else if(a[i]>=20&&a[i]<30){
                b[2]++;
            }
            else if(a[i]>=30&&a[i]<40){
                b[3]++;
            }
            else if(a[i]>=40&&a[i]<50){
                b[4]++;
            }
            else if(a[i]>=50&&a[i]<60){
                b[5]++;
            }
            else if(a[i]>=60&&a[i]<70){
                b[6]++;
            }
            else if(a[i]>=70&&a[i]<80){
                b[7]++;
            }
            else if(a[i]>=80&&a[i]<90){
                b[8]++;
            }
            else if(a[i]>=90&&a[i]<100){
                b[9]++;
            }
        }
        for(int i=0;i<b.length;i++){
            System.out.print((i*10)+" ~ "+(i*10+9)+ " : ");
            for(int j=0;j<b[i];j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
