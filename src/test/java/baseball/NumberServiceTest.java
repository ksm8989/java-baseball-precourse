package baseball;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static baseball.service.NumberService.generateNumber;
public class NumberServiceTest extends NsTest {

    @Test
    @DisplayName("입력값_숫자_테스트")
    void 입력값_숫자_테스트(){
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("1t4"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    @DisplayName("입력값_범위_테스트")
    void 입력값_범위_테스트(){
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("204"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    @DisplayName("랜덤_생성_숫자_테스트")
    void 랜덤_생성_숫자_테스트(){
        assertThat(generateNumber()).size().isEqualTo(3);
    }


    @Override
    protected void runMain() {
        Application.main(new String[]{});
    }
}
