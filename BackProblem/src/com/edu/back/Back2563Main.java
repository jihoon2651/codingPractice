package com.edu.back;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Back2563Main {

    public static void main(String[] args) {

        int num = 3;

        int totalArea = 0;
        int squareArea = 100;

        int[][] square = {{3, 7}, {15, 7}, {5, 2}};

        List<Integer> xList = new ArrayList<Integer>();
        List<Integer> yList = new ArrayList<Integer>();

        for (int i = 0; i < square.length; i++) {
            xList.add(square[i][0]);
            yList.add(square[i][1]);
        }

//        Collections.sort(xList);
//        Collections.sort(yList);

//        System.out.println((xList.get(0)+10 - xList.get(1)));
//        System.out.println((yList.get(0)+10 - yList.get(1)));

        for (int i = 0; i < square.length - 1; i++) {

            if (xList.get(i + 1) >= xList.get(0) && yList.get(i + 1) >= yList.get(0)) {
            	
                if (xList.get(0) + 10 >= xList.get(i + 1) &&
                        yList.get(0) + 10 >= yList.get(i + 1)) {
                    totalArea += 200 - ((xList.get(0) + 10 - xList.get(i + 1)) *
                            (yList.get(0) + 10 - yList.get(i + 1)));
                    
                } else if (xList.get(0) + 10 <= xList.get(i + 1) ||
                        yList.get(0) + 10 <= yList.get(i + 1)) {
                    totalArea += squareArea;
                }

            } else if (xList.get(0) >= xList.get(i + 1) && yList.get(0) >= yList.get(i + 1)) {
                
            	if (xList.get(i + 1) + 10 >= xList.get(0) &&
                        yList.get(i + 1) + 10 >= yList.get(0)) {
                    totalArea += 200 - ((xList.get(i + 1) + 10 - xList.get(0)) *
                            (yList.get(i + 1) + 10 - yList.get(0)));
                    
                } else if (xList.get(i + 1) + 10 <= xList.get(0) ||
                        yList.get(i + 1) + 10 <= yList.get(0)) {
                    totalArea += squareArea;
                }

            } else if (xList.get(0) >= xList.get(i + 1) && yList.get(0) <= yList.get(i + 1)) {
               
            	if (xList.get(i + 1) + 10 >= xList.get(0) &&
                        yList.get(0) + 10 >= yList.get(i + 1)) {
                    totalArea += 200 - ((xList.get(i + 1) + 10 - xList.get(0)) *
                            (yList.get(0) + 10 - yList.get(i + 1)));
                    
                } else if (xList.get(i + 1) + 10 <= xList.get(i + 1) ||
                        yList.get(0) + 10 <= yList.get(i + 1)) {
                    totalArea += squareArea;
                }

            }else if(xList.get(0) <= xList.get(i + 1) && yList.get(0) >= yList.get(i + 1)){
                
            	if (xList.get(0) + 10 >= xList.get(i+1) &&
                        yList.get(i+1) + 10 >= yList.get(0)) {
                    totalArea += 200 - ((xList.get(0) + 10 - xList.get(i+1)) *
                            (yList.get(i+1) + 10 - yList.get(0)));
                    
                } else if (xList.get(0) + 10 <= xList.get(i + 1) ||
                        yList.get(i+1) + 10 <= yList.get(0)) {
                    totalArea += squareArea;
                }
            }
        }
        System.out.println(totalArea);
    }
}