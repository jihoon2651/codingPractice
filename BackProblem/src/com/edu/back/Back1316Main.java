package com.edu.back;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Back1316Main {

    public static void main(String[] args) {

        Back1316 back1316 = new Back1316();

        int cnt = 0;

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for (int i = 0; i < num; i++) {
            String word = scan.next();
            if(back1316.solution(word)){
                cnt++;
            }
        }

        System.out.println(cnt);














//        for (int i = 0; i < list.size(); i++) {
//            List<Integer> indexs = new ArrayList<>();
//            String alphabet = list.get(i);
//            for (int j = 0; j < word.length(); j++) {
//                if (alphabet.equals(String.valueOf(word.charAt(j)))) {
//                    indexs.add(j);
//                }
//            }
//            for (int j = 0; j < indexs.size() - 1; j++) {
//                if (indexs.get(j) + 1 != indexs.get(j + 1)) {
//                    System.out.println("틀림");
////                    return false;
//                }
//            }
//        }
//        System.out.println("됨");
    }


}
