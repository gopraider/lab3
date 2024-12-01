package Events;

import Person.Person;

public abstract class Event {
    private String name;
    abstract void Participated(Person p1);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
