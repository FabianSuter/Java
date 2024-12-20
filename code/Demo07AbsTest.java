public class Demo07AbsTest {
    @Test
    @DisplayName("Positive Number")
    void testPositiveValue() {
        long in = 23;
        long out = 23;
        assertEquals(out, Demo07Abs.abs(in));
    }

    @Test //Exception muss auftreten => PASS
    @DisplayName("Max Negative Number")
    void testMaxNegativeValue() {
        long in = Long.MIN_VALUE;
        assertThrows(RuntimeException.class, () -> Demo07Abs.abs(in));
    }
}
