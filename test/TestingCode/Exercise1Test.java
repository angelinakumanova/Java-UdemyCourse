package TestingCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise1Test {

    @Test
    public void testAlternateCapsWithCat() {
        String output = Exercise1.alternateCaps("cat");
        assertEquals("cAt", output);
    }

    @Test
    public void testAlternateCapsWithApple() {
        String output = Exercise1.alternateCaps("apple");
        assertEquals("aPpLe", output);
    }

    @Test
    public void testAlternateCapsWithBlank() {
        String output = Exercise1.alternateCaps("");
        assertEquals("", output);
    }

    @Test
    public void testAlternateCapsWithAPPLE() {
        String output = Exercise1.alternateCaps("APPLE");
        assertEquals("APPLE", output);
    }

    @Test
    public void testAlternateCapsWithOrANge() {
        String output = Exercise1.alternateCaps("OrANge");
        assertEquals("ORANgE", output);
    }

    @Test
    public void testAlternateCapsWithUser120() {
        String output = Exercise1.alternateCaps("User120");
        assertEquals("USeR120", output);
    }

}
