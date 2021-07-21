import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before() {
        developer = new Developer("Aly", "NI1234JC", 10000);
    }

    @Test
    public void hasName() {
        assertEquals("Aly", developer.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("NI1234JC", developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(10000, developer.getSalary(), 0.01);
    }


    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(10000);
        assertEquals(20000, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(100, developer.payBonus(), 0.01);
    }
}
