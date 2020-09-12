package com.edu.back;

import java.util.*;

public class Back2960Main {
    //      2부터 N까지 모든 정수를 적는다.
//    아직 지우지 않은 수 중 가장 작은 수를 찾는다. 이것을 P라고 하고, 이 수는 소수이다.
//    P를 지우고, 아직 지우지 않은 P의 배수를 크기 순서대로 지운다.
//    아직 모든 수를 지우지 않았다면, 다시 2번 단계로 간다.
    public static void main(String[] args) {

        int n = 5;
        int k = 4;

        Back2960 back2960 = new Back2960();

        System.out.println(back2960.solution(n,k));


    }
}
