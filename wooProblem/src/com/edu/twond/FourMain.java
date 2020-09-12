package com.edu.twond;

import java.util.ArrayList;
import java.util.List;

public class FourMain {

    public static void main(String[] args) {

        String[] infos = {"kim password", "lee abc"};
        String[] actions = {"ADD 30",
                "LOGIN kim abc",
                "LOGIN lee password",
                "LOGIN kim password",
                "LOGIN kim password",
                "ADD 30",
                "ORDER",
                "ORDER",
                "ADD 40",
                "ADD 50"};

        Four four = new Four();

        System.out.println(four.solution(infos,actions));






    }

}
