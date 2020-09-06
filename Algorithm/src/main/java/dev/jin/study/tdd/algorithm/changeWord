package dev.jin.study.tdd.algorithm;

import java.util.Scanner;

public class changWord {

    public int solution(String begin, String target, String[] words) {
        int min = words.length + 1;
        min = dfs(begin, target, words, new boolean[words.length], 0, min);
        return min == words.length + 1 ? 0 : min;
    }

    public int dfs(String begin, String target, String[] words, boolean[] visited, int depth, int min) {
        for (int i = 0; i < words.length; i++) {
            if (diffOne(begin, words[i]) && !visited[i]) {
                if (words[i].equals(target))
                    return Math.min(min, depth + 1);
                visited[i] = true;
                int num = dfs(words[i], target, words, visited, depth + 1, min);
                if (num < min)
                    min = num;
            }
        }
        return min;
    }

    public boolean diffOne(String s1, String s2) {
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                count++;
            if (count > 1) return false;
        }
        return true;
    }

}