import org.junit.Test;
import powerpackage.PowerFinder;

public class PowerFinderTest {
    @Test
    public void oneRaisedToOneIsOne() {
        assert PowerFinder.powerOf(1,1) == 1;
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        assert PowerFinder.powerOf(2,1) == 2;
    }

    @Test
    public void twoRaisedToTwoIsFour() {
        assert PowerFinder.powerOf(2, 2) == 4;
    }

    @Test
    public void threeRaisedTOTwoIsNine() { assert PowerFinder.powerOf(3, 2) == 3*3; }
}
