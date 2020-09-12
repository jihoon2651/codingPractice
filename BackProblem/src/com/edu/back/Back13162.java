package com.edu.back;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Back13162 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            String word = scanner.next();
            if (check(word)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean check(String word) {
        List<String> list = Arrays.stream(word.split(""))
                .distinct()
                .collect(Collectors.toList());
        for (int i = 0; i < list.size(); i++) {
            List<Integer> indexs = new ArrayList<>();
            String alphabet = list.get(i);
            for (int j = 0; j < word.length(); j++) {
                if (alphabet.equals(String.valueOf(word.charAt(j)))) {
                    indexs.add(j);
                }
            }
            for (int j = 0; j < indexs.size() - 1; j++) {
                if (indexs.get(j+1) - indexs.get(j) > 1) {
                    return false;
                }
            }
        }
        return true;
    }

}
