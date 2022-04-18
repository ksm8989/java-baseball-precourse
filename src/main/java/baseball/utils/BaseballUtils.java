package baseball.utils;

import java.util.ArrayList;

public class BaseballUtils {

    /*
    * 입력받은 Input String 을 Integer ArrayList로 변환
    * */
    public static ArrayList<Integer> convertStringToArray(String input){
        ArrayList<Integer> convertedInput = new ArrayList<>();
        for(int i=0; i<input.length(); i++){
            convertedInput.add(Integer.parseInt(input.substring(i, i+1)));
        }

        return convertedInput;
    }
}
