package test;

import java.util.ArrayList;
import java.util.List;

public class 배열만들기2 {

    class Solution {
        public int[] solution(int l, int r) {
            
            List<Integer> answer = new ArrayList<>();
            
            for(int i = l; i <= r ; i++) {
                String toStr = String.valueOf(i); 
                
                boolean valid = false;
                for(int j = 0; j < toStr.length(); j++) {
                    if(toStr.charAt(j) != '5' && toStr.charAt(j) != '0') {
                        valid = false;
                        break;
                    }else {
                    	valid = true;
                    }
                }
                
                if(valid) {
                    int toInt = Integer.parseInt(toStr);
                    answer.add(toInt);
                }
            }
            
            if(answer.isEmpty()) {
                return new int[]{-1};
            }
            
            int[] answerArray = new int[answer.size()];
            
            for(int i = 0; i < answer.size(); i++) {
                answerArray[i] = answer.get(i);
            }
            
            return answerArray;
        }
    }
}
