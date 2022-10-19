import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenderTest {
    Controllers cr = new Controllers();

    @Test
    public void testGenderMale() {
        String gender = "Male";
        String expected = "11";

        boolean resultExpected=true;
        boolean resultActual= cr.codeByGender(gender).equals(expected);
        Assertions.assertEquals(resultExpected, resultActual);
    }

    @Test
    public void testGenderFemale() {
        String gender = "Female";
        String expected = "22";

        boolean resultExpected=true;
        boolean resultActual= cr.codeByGender(gender).equals(expected);
        Assertions.assertEquals(resultExpected, resultActual);
    }

    @Test
    public void testGenderNull() {
        String gender = "";
        String expected = "0";

        boolean resultExpected=true;
        boolean resultActual= cr.codeByGender(gender).equals(expected);
        Assertions.assertEquals(resultExpected, resultActual);
    }
}
