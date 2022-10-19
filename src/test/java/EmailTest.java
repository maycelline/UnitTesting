import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class EmailTest {

    Controllers cr = new Controllers();

    @Test
    public void testEmailNotUsingAt(){
        String email = "randomwordatgmailcom";

        boolean resultExpected=false;
        boolean actual = cr.validateEmail(email);
        Assertions.assertEquals(resultExpected, actual);
    }

    @Test
    public void testEmailUsingAt(){
        String email = "kaisar.valentino123@gmail.com";

        boolean resultExpected=true;
        boolean actual = cr.validateEmail(email);
        Assertions.assertEquals(resultExpected, actual);
    }

    @Test
    public void testEmailIsNull(){
        String email = "";

        boolean resultExpected=false;
        boolean actual = cr.validateEmail(email);
        Assertions.assertEquals(resultExpected, actual);
    }


}
