package chapter05;

public class Q2 {
    public static void main(String[] args) {
        System.out.println(sumExceptFirst(1, 2, 3, 4));
        int arr[] = {2, 3};
        System.out.println(sumExceptFirst(1, arr));
        System.out.println(sumExceptFirst(1, 2, 3, 4, 5));
    }

    public static int sumExceptFirst(int n1, int...n2){

        int sum = 0;
        for(int i=0;i<n2.length;i++){
            sum+=n2[i];
        }

        return sum+ n1;
    }
}
