package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        Boolean oldEnoughForRollercoaster = visitor.getAge() >= 12;
        Boolean tallEnoughForRollercoaster = visitor.getAge() >= 12;
        return oldEnoughForRollercoaster && tallEnoughForRollercoaster;
    }
}
