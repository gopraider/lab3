package Events;

import Person.Person;

import java.util.Objects;

public class CannibalFest extends Event{


    @Override
    public void Participated(Person p1){
        System.out.println(p1.getName() + " участвовал в Канибальском пире " + p1.getAffilition());
    }
    @Override
    public String toString(){
        return super.getName();
    }

    @Override
    public int hashCode() {
            return Objects.hash(super.getName());

    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event=(Event) o;
        return super.getName()==((CannibalFest) o).getName();
    }
}
