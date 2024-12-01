package Person;

import Events.CannibalFest;
import Events.Event;
import Interfaces.Followable;
import Places.Place;

import java.util.Objects;

public class Cruzo extends Person implements Followable {

    public Cruzo(String name){
        super.setName(name);
        super.setAffilition("");
    }
    public Cruzo(){
        super.setName("я");
        super.setAffilition("");
    }
    @Override
    public void FollowTo(Person p1, Place place){
        System.out.println(super.getName() + " собрался с духом сводить " +  p1.getName()+   " на " +  place.getname());
    }
    @Override
    public void recognize(Place place){}
    @Override
    public void happen(String Someone){
        System.out.println("Оказалось," + super.getName() + " бывал раньше в " + Someone);

    }
    @Override
    public void say(){
        System.out.println(super.getName() + " cказал, что ");
    }
    @Override
    public String toString(){
        return super.getName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getName(), super.getAffilition());

    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        return super.getName()==((Cruzo) o).getName();
    }
}
