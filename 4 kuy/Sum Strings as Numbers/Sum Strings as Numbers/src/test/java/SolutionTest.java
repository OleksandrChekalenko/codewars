import org.example.MyKata;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class SolutionTest {
    @Test
    void test() {
         assertEquals("579", MyKata.sumStrings("123", "456"));
    }

    @Test
    void testEmpty() {
         assertEquals("123", MyKata.sumStrings("123", ""));
    }

    @Test
    void testBig() {
         assertEquals("1610271613292266961232", MyKata.sumStrings("805135806646133480616", "805135806646133480616"));
    }

    @Test
    void testDiff() {
        assertEquals("8051353480632", MyKata.sumStrings("8051353480616", "16"));
    }

    @Test
    void testDiffZero() {
        assertEquals("2010738273", MyKata.sumStrings("3247", "002010735026"));
    }
}