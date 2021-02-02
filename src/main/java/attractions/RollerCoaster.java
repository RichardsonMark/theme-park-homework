package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        Boolean oldEnoughForRollercoaster = visitor.getAge() >= 12;
        Boolean tallEnoughForRollercoaster = visitor.getAge() >= 12;
        return oldEnoughForRollercoaster && tallEnoughForRollercoaster;
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() >= 2.0) {
            return defaultPrice() * 2;
        }
        return 8.40;
    }
}
