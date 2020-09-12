package com.edu.twond;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Six {

    public String[] solution(String[][] forms) {

        List<String> nameList = new ArrayList<>();
        List<String> mailList = new ArrayList<>();
        List<String> answerList = new ArrayList<>();
        List<String> sameList = new ArrayList<>();
        String[] answer = {};

        boolean check = false;

        for (int i = 0; i < forms.length; i++) {
            for (int j = 0; j < forms[i][1].length() - 1; j++) {
                nameList.add(forms[i][1].substring(j, j + 2));
                mailList.add(forms[i][0]);
            }
        }

        int cnt = 0;

        for (int i = 0; i < nameList.size(); i++) {
            cnt = 0;
            for (int j = 0; j < nameList.size(); j++) {
                if (nameList.get(i).contains(nameList.get(j))) {
                    cnt = cnt + 1;
                }
            }
            if (cnt > 1 && !sameList.contains(nameList.get(i))) {
                sameList.add(nameList.get(i));
            }
        }

        for (int i = 0; i < sameList.size(); i++) {
            System.out.println(sameList.get(i));
        }

        for (int i = 0; i < forms.length; i++) {
            for (int j = 0; j < sameList.size(); j++) {
                if (forms[i][1].contains(sameList.get(j))){
                    answerList.add(forms[i][0]);
                }
            }
        }
        answer = answerList.toArray(new String[answerList.size()]);
//        answer = answerList.toArray();

//        Collections.sort(answerList);
        Arrays.sort(answer);

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

        return answer;
    }

}
