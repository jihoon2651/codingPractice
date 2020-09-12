package com.edu.back;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Back10773Main {

    public static void main(String[] args) {
//  정수가 "0" 일 경우에는 가장 최근에 쓴 수를 지우고, 아닐 경우 해당 수를 쓴다

        int k = 0;
        int sum = 0;

        Scanner scan = new Scanner(System.in);

        k = scan.nextInt();

        List<Integer> numList = new ArrayList<Integer>();

//        int[] num = {3,0,4,0};
//        int[] num = {1,3,5,4,0,0,7,0,0,6};
//        int[] num = {1,2,3,4,5};

        for (int i = 0; i < k; i++) {
            int num = (int)(Math.random()*10);
            numList.add(num);
            System.out.print(num + " ");
        }

        for (int i = 0; i < numList.size(); i++) {
            if(numList.get(i) == 0){
                numList.remove(i);
                numList.remove(i-1);
                i = i-2;
            }
        }

        for (int i = 0; i < numList.size(); i++) {
            sum += numList.get(i);
        }

        System.out.println();
        System.out.println(sum);

    }
}
