package com.edu.twond;

import java.util.ArrayList;
import java.util.List;

public class Four{

    public boolean[] solution(String[] infos, String[] actions) {
        boolean[] answer = new boolean[actions.length];

        boolean loginCheck = false;
        boolean addCheck = false;

        List<String> idList = new ArrayList<>();
        List<String> pwdList = new ArrayList<>();

        for (int i = 0; i < infos.length; i++) {
            idList.add(infos[i].split(" ")[0]);
            pwdList.add(infos[i].split(" ")[1]);
        }

//        for (int i = 0; i < pwdList.size(); i++) {
//            System.out.println(pwdList.get(i));
//        }

        for (int i = 0; i < actions.length; i++) {
        	
            if(actions[i].contains("LOGIN")){

                for (int j = 0; j < idList.size(); j++) {
                    if(actions[i].split(" ")[1].equals(idList.get(j))){
                        if(actions[i].split(" ")[2].equals(pwdList.get(j))){
                            if(loginCheck == true){
                                break;
                            }else{
                                loginCheck = true;
                                answer[i] = true;
                                break;
                            }
                        }
                    }
                }

            }else if(actions[i].contains("ADD")){
                if(loginCheck == true){
                    addCheck = true;
                    answer[i] = true;
                }
            }else if(actions[i].contains("ORDER")){
                if(addCheck == true){
                    addCheck = false;
                    answer[i] = true;
                }
            }

        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

        return answer;
    }

}
