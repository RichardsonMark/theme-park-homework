import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

     ArrayList<IReviewed> iRevieweds;
     ArrayList<Attraction> attractions;
     ArrayList<Stall> stalls;

    public ThemePark(ArrayList<IReviewed> iRevieweds) {
        this.iRevieweds = iRevieweds;
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();

    }

    public ArrayList<IReviewed> getAllReviewed() {
        return iRevieweds;
    }


    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public void setAttractions(ArrayList<Attraction> attractions) {
        this.attractions = attractions;
    }

    public void setStalls(ArrayList<Stall> stalls) {
        this.stalls = stalls;
    }

    public void visit(Visitor visitor, Attraction attraction) {
        visitor.addVisitedAttractions(attraction);
        attraction.incrementVisitCount();
    }

}
