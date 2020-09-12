package com.edu.twond;

public class One {

    public int solution(int[] restaurant, int[][] riders, int k) {

        int answer = 0;

        for (int i = 0; i < riders.length; i++) {
            if(Math.pow(Math.pow(riders[i][0],2) + Math.pow(riders[i][1],2),0.5) <= k){
                answer = answer + 1;
            }
        }
        
        return answer;
    }

}
