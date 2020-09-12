package com.edu.twond;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeMain {

    public static void main(String[] args) {
        int[] prices = {32000, 18000, 42500};
        int[] discounts = {90,90,90};

        Three three = new Three();

        System.out.println(three.solution(prices,discounts));


    }
}
