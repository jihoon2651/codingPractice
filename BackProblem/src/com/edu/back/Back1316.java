package com.edu.back;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Back1316 {

    public boolean solution(String word){

        String alpha = "";

        List<String> wordList = new ArrayList<String>();
        List<Integer> idxList = new ArrayList<Integer>();

        for (int i = 0; i < word.length(); i++) {
            wordList.add(word.substring(i,i+1));
        }

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < wordList.size(); j++) {
                if (wordList.get(i).equals(wordList.get(j))) {
                    idxList.add(j);
                }
            }

            for (int k = 0; k < idxList.size() - 1; k++) {
                if (idxList.get(k + 1) - idxList.get(k) > 1) {
                    return false;
                }
            }

        }
        return true;
    }
}
