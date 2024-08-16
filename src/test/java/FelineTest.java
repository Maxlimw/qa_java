import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void getFamilyTest() {
        feline.getFamily();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensTest() {
        feline.getKittens();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensTestShouldReturnKittensCount() {
        int expected = 2;
        int actual = feline.getKittens(2);
        assertEquals(expected, actual);
    }

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expected = feline.eatMeat();
        assertEquals(expected, List.of("Животные", "Птицы", "Рыба"));
    }
}
