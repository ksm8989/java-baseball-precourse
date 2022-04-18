package baseball.service;

import java.util.ArrayList;
import baseball.constant.NumberConst;
import baseball.view.BaseballConsoleView;

public class BaseballService {

    public static boolean compareInputNumberAndComputerNumber(ArrayList inputNum, ArrayList computerNum) {
        int strike = 0;
        int ball = 0;
        for(int i=0; i<NumberConst.NUM_SIZE; i++){
            if(inputNum.get(i).equals(computerNum.get(i))){
                strike ++;
                continue;
            }
            if(computerNum.contains(inputNum.get(i))){
                ball ++;
                continue;
            }
        }
        return BaseballConsoleView.printScore(strike, ball);
    }
}
