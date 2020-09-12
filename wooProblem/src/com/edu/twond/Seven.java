package com.edu.twond;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Seven {

    public String[] solution(String user[], String[][] friends, String[] visitors) {

        String[] answer = {};

        List<String> friendList = new ArrayList<>();
        List<String> tenList = new ArrayList<>();
        List<String> reTenList = new ArrayList<>();
        List<String> oneList = new ArrayList<>();
        List<String> reOneList = new ArrayList<>();
        List<String> resultList = new ArrayList<>();
        List<String> fiResultList = new ArrayList<>();
        List<Integer> scoreList = new ArrayList<Integer>();
        List<People> answerList = new ArrayList<People>();

        // user와 친구인 List
        for (int i = 0; i < friends.length; i++) {
            if (friends[i][0].contains(user[0])) {
                friendList.add(friends[i][1]);
            }

            if (friends[i][1].contains(user[0])) {
                friendList.add(friends[i][0]);
            }

        }

        // user를 제외완 user와 친구와 아는 List
        for (int i = 0; i < friends.length; i++) {
            if (friendList.get(0).contains(friends[i][0]) && !friends[i][1].contains(user[0])) {
                tenList.add(friends[i][1]);
            } else if (friendList.get(0).contains(friends[i][1])) {
                tenList.add(friends[i][0]);
            }

            if (friendList.get(1).contains(friends[i][0]) && !friends[i][1].contains(user[0])) {
                tenList.add(friends[i][1]);
            } else if (friendList.get(1).contains(friends[i][1])) {
                tenList.add(friends[i][0]);
            }

        }

        // user와 친구와 아는 List의 중복제거 (1),(2)
        for (int i = 0; i < tenList.size(); i++) {
            if (!reTenList.contains(tenList.get(i))) {
                reTenList.add(tenList.get(i));
            }
        }

        //(1)방문자 List
        for (int i = 0; i < visitors.length; i++) {
            if (!friendList.contains(visitors[i])) {
                oneList.add(visitors[i]);
            }
        }

        //(2)방문자 List 중복제거
        for (int i = 0; i < oneList.size(); i++) {
            if (!reOneList.contains(oneList.get(i))) {
                reOneList.add(oneList.get(i));
            }
        }

        //(1)+(2)
        for (int i = 0; i < reTenList.size(); i++) {
            resultList.add(reTenList.get(i));
        }

        for (int i = 0; i < reOneList.size(); i++) {
            resultList.add(reOneList.get(i));
        }

        for (int i = 0; i < resultList.size(); i++) {
            if(!fiResultList.contains(resultList.get(i))){
                fiResultList.add(resultList.get(i));
            }
        }

        // resultList 점수등록
        for (int i = 0; i < fiResultList.size(); i++) {
            int kScore = 0;
            int vScore = 0;

            for (int j = 0; j < tenList.size(); j++) {
                if(fiResultList.get(i).equals(tenList.get(j))){
                    kScore = kScore + 1;
                }
            }

            for (int k = 0; k < oneList.size(); k++) {
                if(fiResultList.get(i).equals(oneList.get(k))){
                    vScore = vScore + 1;
                }
            }
            scoreList.add(kScore*10 + vScore*1);
        }

        // answerList에 이름과 점수를 각각 add
        for (int i = 0; i < fiResultList.size(); i++) {
            People p = new People();
            p.name = fiResultList.get(i);
            p.score = scoreList.get(i);
            answerList.add(p);
        }

        //내림차순 정렬
        Collections.sort(answerList, Comparator.reverseOrder());

        answer = new String[answerList.size()];

        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i).name;
            System.out.println(answer[i]);
        }

        return answer;
    }

}
