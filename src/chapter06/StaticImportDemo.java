package chapter06;

import static java.util.Arrays.sort; // 정적 import문

import java.util.Calendar; // import문

public class StaticImportDemo {
    public static void main(String[] args) {
        int[] data = {3, 5, 1, 7};

        sort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println(Calendar.JANUARY);
        Calendar.getInstance();
    }
}
