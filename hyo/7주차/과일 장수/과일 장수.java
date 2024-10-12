import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score); // 오름차순 정렬

        for(int i = score.length - m; i >= 0; i = i - m) {
            answer += score[i] * m;
        }

        return answer;
    }
}