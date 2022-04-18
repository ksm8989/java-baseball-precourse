package baseball;

import baseball.constant.NumberConst;
import baseball.view.BaseballConsoleView;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseballServiceTest extends NsTest {
    @Test
    @DisplayName("게임_승리_실패_테스트")
    void 게임_승리_실패_테스트(){
        int strike = 0;
        int ball = 0;

        List<Integer> inputNum = Arrays.asList(1, 2, 3);
        List<Integer> computerNum =  Arrays.asList(2, 4, 3);

        for(int i = 0; i< NumberConst.NUM_SIZE; i++){
            if(inputNum.get(i).equals(computerNum.get(i))){
                strike ++;
                continue;
            }
            if(computerNum.contains(inputNum.get(i))){
                ball ++;
                continue;
            }
        }

        assertThat(BaseballConsoleView.printScore(strike, ball)).isTrue();

    }

    @Override
    protected void runMain() {
        Application.main(new String[]{});
    }
}
