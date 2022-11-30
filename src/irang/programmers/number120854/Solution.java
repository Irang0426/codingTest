package irang.programmers.number120854;

import java.util.Arrays;

public class Solution {
    public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] str = {"We", "are", "the", "world!"};
        System.out.println(Arrays.toString(solution(str)));
    }
}
