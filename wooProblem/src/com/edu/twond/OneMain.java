package com.edu.twond;

public class OneMain {

    public static void main(String[] args) {
    	
        int[] restaurant = {0,0};
        int[][] riders= {{-700,0},{150,180},{500,500},{150, -800},
        			{800, 800},{-900, 500},{-1100, 900}};
        int k = 1000;
        
        One one= new One();

        System.out.println(one.solution(restaurant,riders,k));
        
//        One2 one2= new One2();
//
//        System.out.println(one2.solution(restaurant,riders,k));


    }

}
