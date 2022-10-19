import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IDTest {
    Controllers cr = new Controllers();

    @Test
    public void testNIKNull() {
        String nik = "";
        String gender = "Male";
        String expected = "NIK not valid!";

        boolean resultExpected=true;
        boolean resultActual= cr.generateID(nik,gender).equals(expected);
        Assertions.assertEquals(resultExpected, resultActual);
    }

    @Test
    public void testGenderNull() {
        String nik = "1234567891234567";
        String gender = "Not Defined";
        String expected = "Gender not valid!";

        boolean resultExpected=true;
        boolean resultActual= cr.generateID(nik,gender).equals(expected);
        Assertions.assertEquals(resultExpected, resultActual);
    }
}
