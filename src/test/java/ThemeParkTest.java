import attractions.*;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Park park;
    Playground playground;
    Dodgems dodgems;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;
    Visitor visitor;


    @Before
    public void setUp() throws Exception {
        playground = new Playground("Sesame's Treat",5);
        dodgems = new Dodgems("Dodge City", 4);
        rollerCoaster = new RollerCoaster("WavesRollAtTheCoast-er", 5);

        candyflossStall = new CandyflossStall("Don't Forget to Floss", "W Wonka", ParkingSpot.A2, 4);
        iceCreamStall = new IceCreamStall("N-Ice Cream", "Dr V Fries", ParkingSpot.A3, 5);

        ArrayList<IReviewed> iRevieweds = new ArrayList<>();
        iRevieweds.add(playground);
        iRevieweds.add(dodgems);
        iRevieweds.add(rollerCoaster);
        iRevieweds.add(candyflossStall);
        iRevieweds.add(iceCreamStall);
        themePark = new ThemePark(iRevieweds);

        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(playground);
        attractions.add(dodgems);
        attractions.add(rollerCoaster);
        themePark.setAttractions(attractions);

        ArrayList<Stall> stalls = new ArrayList<>();
        stalls.add(candyflossStall);
        stalls.add(iceCreamStall);
        themePark.setStalls(stalls);

        visitor = new Visitor(20,2.00, 20.00);

    }

    @Test
    public void canGetAllReviews() {
        assertEquals(5, themePark.getAllReviewed().size());
    }

    @Test
    public void canGetAllAttractions() {
        assertEquals(3, themePark.getAttractions().size());
    }

    @Test
    public void canGetAllStalls() {
        assertEquals(2, themePark.getStalls().size());
    }

}
