package baseball.constant;
import baseball.constant.NumberConst;
public class MessageConst {
    public static final String INPUT_NUMBER = "숫자를 입력해주세요 : ";
    public static final String GAME_RESTART = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    public static final String GAME_END = NumberConst.NUM_SIZE + "개의 숫자를 모두 맞히셨습니다! 게임 종료";

    public static final String INPUT_LENGTH_FAIL = NumberConst.NUM_SIZE + "자리의 숫자를 입력하세요.";
    public static final String INPUT_TYPE_FAIL = "숫자를 입력하세요.";
    public static final String INPUT_RANGE_FAIL = NumberConst.MIN_NUM + " 이상 " + NumberConst.MAX_NUM + " 이하의 숫자를 입력하세요";

    private static final String STRIKE = "스트라이크";
    private static final String BALL = "볼";
    private static final String NOTHING = "낫싱";

    public static String getScoreMessage(int strike, int ball){
        if(strike == 0 && ball == 0){
            return NOTHING;
        }

        if(ball == 0){
            return strike +  STRIKE;
        }

        if(strike == 0){
            return ball + BALL;
        }

        return ball + BALL + " " +  strike +  STRIKE;
    }

}
