package lesson10.labs.prob7.soln2;

import lesson10.labs.prob7.Employee;
import lesson10.labs.prob7.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Asme on 9/25/2016.
 */
public class AsStringTest {

    @Test
    public void testsalaryGreaterThan100000(){
        assertEquals(true, Main.salaryGreaterThan100000(new Employee("John", "Sims", 110000)));
    }

    @Test
    public void testLastNameAfterM(){
        assertEquals(true,Main.lastNameAfterM(new Employee("John", "Sims", 110000)));
    }
    @Test
    public void testFullName(){
        assertEquals("John Sims",Main.fullName(new Employee("John", "Sims", 110000)));
    }


}
