package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor2;


    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(28, 2.05, 50.00);
        visitor2 = new Visitor(28, 1.95, 50.00);

    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void canChargeDefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.0);;
    }

    @Test
    public void canChargeDependOnHeight_2mPlus() {
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.0);
    }

    @Test
    public void canChargeDependOnHeight_under2m() {
        assertEquals(8.40, rollerCoaster.priceFor(visitor2), 0.0);
    }
}
