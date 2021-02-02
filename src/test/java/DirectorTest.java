import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("David Brown", "TN125643B", 60000.00, "Accounts", 5000.00);
    }

    @Test
    public void hasName(){
        assertEquals("David Brown", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("TN125643B", director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(60000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canSetName() {
        director.setName("David Broon");
        assertEquals("David Broon", director.getName());

    }

    @Test
    public void cannotSetNameToNull() {
        director.setName(null);
        assertEquals("David Brown", director.getName());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Accounts", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(5000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1200.00);
        assertEquals( 62000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(600, director.payBonus(), 0.01);
    }
}
