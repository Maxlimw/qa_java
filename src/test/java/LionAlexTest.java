import com.example.Feline;
import com.example.LionAlex;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensOfAlex() throws Exception {
        MatcherAssert.assertThat("У льва Алекса нет львят",
                new LionAlex("Самец", feline).getKittens(),
                equalTo(0)
        );
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        MatcherAssert.assertThat("Лев Алекс живет в другом месте",
                new LionAlex("Самец", feline).getPlaceOfLiving(),
                equalTo("Нью-Йоркский зоопарк")
        );
    }

    @Test
    public void getFriendsTest() throws Exception {
        List<String> expectedList = List.of(
                "Зебра Марти",
                "Бегемотиха Глория",
                "Жираф Мелман"
        );
        MatcherAssert.assertThat("Это не друзья Алекса",
                new LionAlex("Самец", feline).getFriends(),
                equalTo(expectedList)
        );
    }
}