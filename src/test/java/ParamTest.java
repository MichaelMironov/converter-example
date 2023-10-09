import org.example.annotation.Report;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParamTest {

    @ParameterizedTest
    @ValueSource(strings = {"10, 3", "12, 4"})
    void test(@Report(length = 50) String report) {
        System.out.println("Generated text in report" + report);
    }
}
