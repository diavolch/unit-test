package seminars.third.hw;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SomeServiceTest {
    @Test
    void checkEvenNumbers() {
        SomeService someService = new SomeService();
        assertThat(someService.evenOddNumber(2)).isEqualTo(true);
    }
    @Test
    void checkNotEvenNumbers() {
        SomeService someService = new SomeService();
        assertThat(someService.evenOddNumber(3)).isEqualTo(false);
    }
    @Test
    void checkNumInInterval() {
        SomeService someService = new SomeService();
        assertThat(someService.numberInInterval(30)).isEqualTo(true);
    }
    @Test
    void checkNumNotInInterval() {
        SomeService someService = new SomeService();
        assertThat(someService.numberInInterval(3)).isEqualTo(false);
    }
}