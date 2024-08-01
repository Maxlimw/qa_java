import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    private final String sex;


    public LionParametrizedTest(String sex) {
        this.sex = sex;

    }

    @Parameterized.Parameters
    public static Object[][] createTestsParametrs() {
        return new Object[][]{
                {"Антон"},
                {"null"},
                {"Кошка"},
        };
    }

    @Mock
    private Feline feline;

    @Test
    public void testCreateFailLion() {
        boolean thrown = false;
        try {
            Lion lion = new Lion(sex, feline);
        } catch (Exception exception) {
            thrown = true;
            assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
        }
        assertTrue("Ожидалось исключение для несуществующего пола", thrown);
    }
}
