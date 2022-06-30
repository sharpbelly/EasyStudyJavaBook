package chapter05;

import java.util.ArrayList;

public class Q8 {
    public static void main(String[] args) {
        // m*n의 배열 만들기(m은 5, n은 10, p는 0.3;
        int m = 5, n = 10;
        double p = 0.3;

        String[][] arr = new String[m + 2][n + 2];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // 지뢰만들기 지뢰*, 일반 -
                if (Math.random() < p) {
                    arr[i][j] = "*";
                } else arr[i][j] = "-";
            }
        }
        // 지뢰위치 출력
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        //이웃 지뢰 찾기 만들기
        String[][] arr2 = new String[m + 2][n + 2];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                if (arr[i][j].equals("*")) {
                    arr2[i][j] = "*";
                    continue;
                }
                if (arr[i - 1][j] == "*")
                    cnt++;
                if (arr[i][j - 1] == "*")
                    cnt++;
                if (arr[i + 1][j] == "*")
                    cnt++;
                if (arr[i][j + 1] == "*")
                    cnt++;
                if (arr[i - 1][j + 1] == "*")
                    cnt++;
                if (arr[i + 1][j - 1] == "*")
                    cnt++;
                if (arr[i - 1][j - 1] == "*")
                    cnt++;
                if (arr[i + 1][j + 1] == "*")
                    cnt++;

                arr2[i][j] = Integer.toString(cnt);
            }
        }

        // 이웃 지뢰 출력
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

    }
}
