import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        calculator calc = new calculator();
        assertEquals(5, calc.add(2, 3));
    }
}