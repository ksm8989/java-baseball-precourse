package baseball.controller;

import baseball.service.BaseballService;
import baseball.service.NumberService;
import baseball.view.BaseballConsoleView;
import baseball.utils.BaseballUtils;
import baseball.constant.CodeConst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseballController {

    private ArrayList computerNumberList;
    private String exitCode;  // "1" -> start ,  "2" -> end

    public BaseballController() {
        generateComputerNumberList();
        this.exitCode = CodeConst.START_CODE;
    }

    private void generateComputerNumberList(){
        this.computerNumberList = NumberService.generateNumber();
    }

    public void start() {
        while (CodeConst.START_CODE.equals(exitCode)) {
            String inputNumber = BaseballConsoleView.inputNumber();
            validateInput(inputNumber);
            ArrayList inputList = BaseballUtils.convertStringToArray(inputNumber);

            if(BaseballService.compareInputNumberAndComputerNumber(inputList, this.computerNumberList)){
                gameEnd();
                restart();
            }
        }
    }

    private void restart() {
        exitCode = BaseballConsoleView.restartGame();
        if (CodeConst.START_CODE.equals(exitCode)) {
            generateComputerNumberList();
        }
    }

    private void gameEnd() {
        BaseballConsoleView.endGame();
    }

    private void validateInput(String input) {
        NumberService.validateIsNumber(input);
        NumberService.validateNumberRange(input);
        NumberService.validateLength(input);
    }
}
