import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class NIKTest {
    Controllers cr = new Controllers();

    @Test
    public void testValidateNIK_not16chars() {
        String NIK = "123456";
        boolean expected = false;

        boolean actual = cr.validateNIK(NIK);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testValidateNIK_is16chars_andValid() {
        String NIK = "3204285502020017";
        boolean expected = true;

        boolean actual = cr.validateNIK(NIK);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testValidateNIK_is16chars_andInvalid() {
        String NIK = "3204285502020a17";
        boolean expected = false;

        boolean actual = cr.validateNIK(NIK);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testValidateNIK_moreThan16Chars() {
        String NIK = "319894798178974381784371";
        boolean expected = false;

        boolean actual = cr.validateNIK(NIK);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testValidateNIK_withAlphabet() {
        String NIK = "a763716672";
        boolean expected = false;

        boolean actual = cr.validateNIK(NIK);
        Assertions.assertEquals(expected, actual);
    }
}
