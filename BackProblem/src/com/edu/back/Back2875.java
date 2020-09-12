package com.edu.back;

public class Back2875 {

//      n 여
//      m 남
//      k 인턴
//      조는 반드시 여자2명 남자1명 인턴1명이 이뤄야한다

    public int solution(int n, int m, int k) {

        int div = n / 2;

        int answer = 0;

        if (n <= 1 || m == 0 || k == 0) {
            answer = 0;
        } else if (2 * m < n) {
            answer = m;
        } else {
            answer = div;
        }

        return answer;
    }
}
