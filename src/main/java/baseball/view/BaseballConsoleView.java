package baseball.view;
import camp.nextstep.edu.missionutils.Console;
import baseball.constant.MessageConst;
public class BaseballConsoleView {



    public static String inputNumber() {
        System.out.println(MessageConst.INPUT_NUMBER);
        return Console.readLine();
    }

    public static String restartGame() {
        System.out.println(MessageConst.GAME_RESTART);
        return Console.readLine();
    }

    public static void endGame() {
        System.out.println(MessageConst.GAME_END);
    }

    public static boolean printScore(int strike, int ball){
        System.out.println(MessageConst.getScoreMessage(strike, ball));
        if(strike == 3){
            return true;
        }
        return false;
    }
}
