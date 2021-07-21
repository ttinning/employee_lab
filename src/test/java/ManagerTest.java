import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Gary", "JSC1992C", 100000, "DevOps");
    }

    @Test
    public void hasName() {
        assertEquals("Gary", manager.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("JSC1992C", manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(100000, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDepartmentName() {
        assertEquals("DevOps", manager.getDepartmentName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(10000);
        assertEquals(110000, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(1000, manager.payBonus(), 0.01);
    }

    @Test
    public void cannotBeNegativeSalary() {
        manager.raiseSalary(-100);
        assertEquals(100000, manager.getSalary(), 0.01);
    }

    @Test
    public void changeName() {
        manager.setName("Tristan");
        assertEquals("Tristan", manager.getName());
    }

    @Test
    public void changeNameUnsuccessful() {
        manager.setName(null);
        assertEquals("Gary", manager.getName());
    }

}
