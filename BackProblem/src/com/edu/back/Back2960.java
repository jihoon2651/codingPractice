package com.edu.back;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Back2960 {

    public int solution(int n, int k){

        int answer = 0;
        int minN;
        int cnt = 0;

        List<Integer> nList = new ArrayList<Integer>();
        
        // 2 ~ N까지 숫자입력
        for (int i = 0; i < n - 1; i++) {
            nList.add(i + 2);
        }

        // 범위 ??
        for (int i = 0; i < nList.size(); i++) {
            Collections.sort(nList);

            minN = nList.get(0);

            if(cnt+1 == k){
                answer = nList.get(0);
                break;
            }
            nList.remove(0);
            cnt++;

            Collections.sort(nList, Comparator.reverseOrder());

            for (int j = 0; j < nList.size(); j++) {

                if (nList.get(j) % minN == 0) {

                    if(cnt + 1 == k){
                        answer = nList.get(j);
                        break;
                    }
                    nList.remove(j);
                    cnt++;
                }
            }
            i = 0;
            
        }

        return answer;
    }
}
