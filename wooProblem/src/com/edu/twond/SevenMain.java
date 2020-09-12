package com.edu.twond;

public class SevenMain {

    public static void main(String[] args) {

        String[] user = {"mrko"};

        String[][] friends = {{"donut", "andole"},
                {"donut", "jun"},
                {"donut", "mrko"},
                {"shakevan", "andole"},
                {"shakevan", "jun"},
                {"shakevan", "mrko"}};

        String[] visitors = {"bedi", "bedi", "donut", "bedi", "shakevan"};

        Seven seven = new Seven();

        seven.solution(user, friends, visitors);

//        int idx = 0;
//        for (int i = 0; i < tenList.size(); i++) {
//            if (tenList.get(i).contains(use[0])) {
//                idx = idx + 1;
//            }
//        }

//        for (int i = 0; i < idx; i++) {
//            tenList.remove(use[0]);
//        }

    }

}
