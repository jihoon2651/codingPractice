package com.edu.twond;

import java.util.Scanner;


public class OneMain2 {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
		
		int[] restaurant = new int[2];
		int[][] riders = new int[7][2];
		int k;
		
		System.out.println("반경을 입력하세요.");
		k = sc.nextInt();
		
		for (int i = 0; i < riders.length; i++) {
			for (int j = 0; j < 1; j++) {
				System.out.println("라이더의 좌표를 입력해주세요");
				int x = 0;
				int y = 0;
				x = sc.nextInt();
				y = sc.nextInt();
				riders[i][j] = x;
				riders[i][j+1] = y;
			}
		}
		
		System.out.println("가게의 위치를 입력해주세요");
		for (int i = 0; i < 1; i++) {
			int x = 0;
			int y = 0;
			x = sc.nextInt();
			y = sc.nextInt();
			restaurant[i] = x;
			restaurant[i+1] = y;
		}
		
		One on = new One();
		
		System.out.println(on.solution(restaurant, riders, k));
		
//		int[] restaurant = {0,0};
//        int[][] riders= {{-700,0},{150,180},{500,500},{150, -800},
//        			{800, 800},{-900, 500},{-1100, 900}};
//        int k = 1000;
		
		
    }

}
