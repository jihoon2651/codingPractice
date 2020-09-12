package com.edu.twond;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Seven2 {

    public String[] solution(String user[], String[][] friends, String[] visitors) {

        String[] answer = {};

        List<String> friendList = new ArrayList<>();
        List<String> tenList = new ArrayList<>();
        List<String> oneList = new ArrayList<>();
        List<Integer> scoreList = new ArrayList<Integer>();
        List<People> recommendList = new ArrayList<People>();
        List<String> peopleList = new ArrayList<>();

        // user와 친구인 List add
        for (int i = 0; i < friends.length; i++) {
            if (friends[i][0].contains(user[0])) {
                friendList.add(friends[i][1]);
            }

            if (friends[i][1].contains(user[0])) {
                friendList.add(friends[i][0]);
            }

        }

        // user를 제외한 모든 사람목록
        for (int i = 0; i < friends.length; i++) {
            if(!peopleList.contains(friends[i][1])){
                if(!friends[i][1].equals(user[0])){
                    peopleList.add(friends[i][1]);
                }
            }
            if(!peopleList.contains(friends[i][0])){
                if(!friends[i][0].equals(user[0])){
                    peopleList.add(friends[i][0]);
                }
            }
        }

        for (int i = 0; i < visitors.length; i++) {
            if(!peopleList.contains(visitors[i])){
                peopleList.add(visitors[i]);
            }
        }

        //peopleList에서 아는사람 지우기
        for (int i = 0; i < peopleList.size(); i++) {
            for (int j = 0; j < friendList.size(); j++) {
                if(peopleList.get(i).contains(friendList.get(j))){
                    peopleList.remove(i);
                }
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

        // resultList 점수등록
        for (int i = 0; i < peopleList.size(); i++) {
            int kScore = 0;
            int vScore = 0;

            for (int j = 0; j < tenList.size(); j++) {
                if(peopleList.get(i).equals(tenList.get(j))){
                    kScore = kScore + 1;
                }
            }

            for (int k = 0; k < oneList.size(); k++) {
                if(peopleList.get(i).equals(oneList.get(k))){
                    vScore = vScore + 1;
                }
            }
            scoreList.add(kScore*10 + vScore*1);
        }

        // recommendList에 이름과 점수를 각각 add
        for (int i = 0; i < peopleList.size(); i++) {
            People p = new People();
            p.name = peopleList.get(i);
            p.score = scoreList.get(i);
            recommendList.add(p);
        }

        //내림차순 정렬
        Collections.sort(recommendList, Comparator.reverseOrder());

        answer = new String[recommendList.size()];

        for (int i = 0; i < recommendList.size(); i++) {
            answer[i] = recommendList.get(i).name;
            System.out.println(answer[i]);
        }

        return answer;
    }

}
