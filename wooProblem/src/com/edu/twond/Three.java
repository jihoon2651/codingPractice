package com.edu.twond;

public class Three {

    public int solution(int[] prices, int[] discounts) {
        int answer = 0;
        int tmp = 0;

        for (int i = 0; i < prices.length-1; i++) {
            if(prices[i] < prices[i+1]){
                tmp = prices[i+1];
                prices[i+1] = prices[i];
                prices[i] = tmp;
            }
        }

//        discounts배열 내림차순
        for (int i = 0; i < discounts.length-1; i++) {
            if(discounts[i] < discounts[i+1]){
                tmp = discounts[i+1];
                discounts[i+1] = discounts[i];
                discounts[i] = tmp;
            }
        }

        for (int i = 0; i < discounts.length; i++) {
            answer = answer + (prices[i] * (100 - discounts[i])/100);
            discounts[i] = 0;
        }

        for (int i = 0; i < prices.length - discounts.length; i++) {
            answer = answer + prices[prices.length-1];
        }

        return answer;
    }


}
