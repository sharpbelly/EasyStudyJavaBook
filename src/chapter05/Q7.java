package chapter05;

public class Q7 {
    public static void main(String[] args) {
        int[] a = {3, 2, 4, 1, 5};
        int[] b = {3, 2, 4, 1};
        int[] c = {3, 2, 4, 1, 5};
        int[] d = {2, 7, 1, 8, 2};

        System.out.println("a와 b는 " + isSame(a, b));
        System.out.println("a와 c는 " + isSame(a, c));
        System.out.println("a와 d는 " + isSame(a, d));
        System.out.println("b와 c는 " + isSame(b, c));
        System.out.println("b와 d는 " + isSame(b, d));
        System.out.println("c와 d는 " + isSame(c, d));


    }

    public static boolean isSame(int[] a, int[] b) {

        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
