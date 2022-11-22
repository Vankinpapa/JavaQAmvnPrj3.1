import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.BonusService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    void shouldCalculateForRegisteredAndUnderLimit(int expected, int amount, boolean registered) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }
}
