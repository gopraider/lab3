package Interfaces;

import Person.Person;
import Places.Place;

public interface Followable {
    abstract void FollowTo(Person p1,Place place);
}
