package com.edu.twond;

public class One2 {
	
	public int solution(int[] restaurant, int[][] riders, int k) {
        int answer = 0;
        double distance = 0;
        for(int i = 0; i < riders.length; i++){
            distance = getDistance(restaurant, riders[i]);
            if(distance <= k) answer++;
        }
        return answer;
    }
    
    public double getDistance(int[] start, int[] end){
        return Math.pow(Math.pow(start[0] - end[0], 2) + Math.pow(start[1] - end[1], 2), 0.5);
    }

}
