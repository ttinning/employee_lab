import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Gandave", "JSC1992C", 100000, "Everything", 10000);
    }


    @Test
    public void hasName() {
        assertEquals("Gandave", director.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("JSC1992C", director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(100000, director.getSalary(), 0.01);
    }

    @Test
    public void hasDepartmentName() {
        assertEquals("Everything", director.getDepartmentName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(10000);
        assertEquals(110000, director.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(2000, director.payBonus(), 0.01);
    }

    @Test
    public void hasABudget() {
        assertEquals(10000, director.getBudget(), 0.01);
    }


}
