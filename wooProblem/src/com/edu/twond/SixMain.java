package com.edu.twond;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SixMain {

    public static void main(String[] args) {

        String[][] forms = {{"jm@email.com", "제이엠"},
                {"jason@email.com", "제이슨"},
                {"woniee@email.com", "워니"},
                {"mj@email.com", "엠제이"},
                {"nowm@email.com", "이제엠"}};

        Six six = new Six();

        six.solution(forms);

//        for (int i = 0; i < nameList.size(); i++) {
//            if(!sameList.contains(nameList.get(i))){
//                sameList.add(nameList.get(i));
//            }
//        }


    }
}
