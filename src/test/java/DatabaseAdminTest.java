import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    private DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Tristan", "NI23333SS", 10000);
    }

    @Test
    public void hasName() {
        assertEquals("Tristan", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("NI23333SS", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(10000, databaseAdmin.getSalary(), 0.01);
    }


    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(10000);
        assertEquals(20000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(100, databaseAdmin.payBonus(), 0.01);
    }
}
