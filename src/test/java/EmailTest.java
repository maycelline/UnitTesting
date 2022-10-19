import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class EmailTest {

    Controllers cr = new Controllers();

    @Test
    public void testEmailUsingAt(){
        String email = "randomwordatgmailcom";

        boolean resultExpected=false;
        boolean actual = cr.validateEmail(email);
        Assertions.assertEquals(resultExpected, actual);
    }

}
