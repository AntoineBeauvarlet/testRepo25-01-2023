import UnitTesting.Person;
import UnitTesting.ExempleCode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Test_Java {
    Person person = new Person();

    @BeforeEach
    void setupPerson(){
        person.setAge(36);
        person.setName("daniel");
    }

    @Test
    void createUserBob(){
        person.setName("bob");

        assertEquals("bob",person.getName());
    }

    @Test
    void testName(){
        assertEquals("daniel",person.getName());
    }
    @Test
    void testAge(){
        person.setAge(26);
        assertTrue(person.getAge()<30);
    }

    @Test
    void testSomme(){
        assertEquals(4,ExempleCode.somme(2,2));
    }
    @Test
    void testProduct(){
        assertEquals(6,ExempleCode.product(2,3));
    }
    @Test
    void testTest1(){
        assertTrue(ExempleCode.test1(false));

    }
}
