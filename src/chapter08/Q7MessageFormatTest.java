package chapter08;

import java.text.MessageFormat;

public class Q7MessageFormatTest {
    public static void main(String[] args) {
        Object[][] data = {{"세종대왕", 1, "조선"}, {"오바마", 2, "미국"}, {"징기스칸", 3, "몽고"}};
        String pattern = "이름 : {0}     번호 : {1}     국적 : {2}";

        String[] result = new String[3];
        for(int i=0;i<data.length;i++){
            result[i] = MessageFormat.format(pattern, data[i]);
            System.out.println(result[i]);
        }

    }
}

