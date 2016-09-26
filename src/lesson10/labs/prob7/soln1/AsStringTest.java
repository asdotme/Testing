package lesson10.labs.prob7.soln1;

import lesson10.labs.prob7.Employee;
import lesson10.labs.prob7.Main;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by Asme on 9/25/2016.
 */
public class AsStringTest {

    @Test
    public void testAsString() {
        Stream<Employee> emps = Arrays.asList(
                new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000)).stream();
        Main m=new Main();
        assertEquals("Alice Richards, Joe Stevens, John Sims, Steven Walters",m.asString1(emps));


    }
}
