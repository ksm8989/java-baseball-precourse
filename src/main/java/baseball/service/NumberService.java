package baseball.service;
import camp.nextstep.edu.missionutils.Randoms;
import baseball.constant.NumberConst;
import baseball.constant.MessageConst;
import baseball.utils.BaseballUtils;
import java.util.ArrayList;

public class NumberService {



    public static ArrayList generateNumber(){

        ArrayList randomNumber = new ArrayList<Integer>();
        while(randomNumber.size() < NumberConst.NUM_SIZE) {
            int digit = Randoms.pickNumberInRange(NumberConst.MIN_NUM, NumberConst.MAX_NUM); // 1~9까지
            if (!randomNumber.contains(digit)) {
                randomNumber.add(digit);
            }
        }
        return randomNumber;
    }

    public static void validateLength(String value){
        if (value.length() != NumberConst.NUM_SIZE) {
            throw new IllegalArgumentException(MessageConst.INPUT_LENGTH_FAIL);
        }
    }

    public static void validateIsNumber(String value){
        try{
            Integer.parseInt(value);
        }catch(NumberFormatException e){
            throw new IllegalArgumentException(MessageConst.INPUT_TYPE_FAIL);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void validateNumberRange(String value){
        ArrayList<Integer> numbers = BaseballUtils.convertStringToArray(value);
        for(int i=0; i<numbers.size(); i++){
            if(numbers.get(i) > NumberConst.MAX_NUM || numbers.get(i) < NumberConst.MIN_NUM){
                throw new IllegalArgumentException(MessageConst.INPUT_RANGE_FAIL);
            }
        }

    }

}
