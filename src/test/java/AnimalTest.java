import com.example.Animal;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(Parameterized.class)
public class AnimalTest {
    private final String animalKind;
    private final List<String> expectedListOfFood;

    public AnimalTest(String animalKind, List<String> expectedListOfFood) {
        this.animalKind = animalKind;
        this.expectedListOfFood = expectedListOfFood;
    }

    @Parameterized.Parameters
    public static Object[][] setTestsParams() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void getFoodTest() throws Exception {
        MatcherAssert.assertThat("Неправильный набор еды",
                new Animal().getFood(animalKind),
                equalTo(this.expectedListOfFood)
        );
    }
}
