package Places;

import Interfaces.Directionable;
import Person.Person;
import enums.CardinalDirections;

import java.util.Objects;


public class PartOfIsland extends Place implements Directionable {

    public PartOfIsland(){
        super.setname("части острова");
    }
    public PartOfIsland(String reason){
        super.setname("части острова");
        super.setReason(reason);
    }
    @Override
    public void SetDirect(String name){
        super.setname(name + " части острова");
    }
    @Override
    public void enterplace(Person p1){
        System.out.println(p1.getName() + " Бывал на " + super.getname() + " " + p1.getAffilition() + super.getReason());
    }
    @Override
    public String toString(){
        return super.getname() + " " + super.getReason();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getname(), super.getReason());

    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.getname()==((PartOfIsland) o).getname() && super.getReason()==((PartOfIsland) o).getReason();
    }

}
