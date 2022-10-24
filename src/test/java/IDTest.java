import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IDTest {
    Controllers cr = new Controllers();
    User user;

    @Test
    public void testUserAllValid() {
        user = new User("3204285502020007", "Maycelline Selvyanti Sudarsono", "meycakep@gmail.com", "089636981078","Female",20,"Cikutra Higland");

        String resultExpected = "007202222";
        String resultActual = cr.generateID(user);
        Assertions.assertEquals(resultExpected, resultActual);
    }

    @Test
    public void testUserNIKInvalid() {
        user = new User("3204285a02020007", "Maycelline Selvyanti Sudarsono", "meycakep@gmail.com", "089636981078","Female",20,"Cikutra Higland");

        String resultExpected = "";
        String resultActual = cr.generateID(user);
        Assertions.assertEquals(resultExpected, resultActual);
    }

    @Test
    public void testUser_OneNULL() {
        user = new User("", "Maycelline Selvyanti Sudarsono", "meycakep@gmail.com", "089636981078","Female",20,"Cikutra Higland");

        String resultExpected = "";
        String resultActual = cr.generateID(user);
        Assertions.assertEquals(resultExpected, resultActual);
    }

}
