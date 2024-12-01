package Person;

import Places.PartOfIsland;
import Places.Place;

public abstract class Person {
    private String name;
    private String affilition;
    abstract void recognize(Place place);
    abstract void happen(String Someone);
    abstract void say();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAffilition() {
        return affilition;
    }

    public void setAffilition(String affilition) {
        this.affilition = affilition;
    }
}
