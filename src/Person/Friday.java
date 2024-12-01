package Person;

import Interfaces.Eatable;
import Interfaces.TakeItems;
import Interfaces.UnKnowable;
import Places.PartOfIsland;
import Places.Place;

import java.util.ArrayList;
import java.util.Objects;

public class Friday extends Person implements Eatable, UnKnowable, TakeItems {
    public Friday(){
        super.setName("Пятница");
    }
    public Friday(String name){
        super.setName(name);
    }
    @Override
    public void EatPeople(ArrayList<Integer>k, Integer sum){
        System.out.println( "То, Съели и убили " + Integer.toString(sum) + " человек, а именно " +Integer.toString(k.get(0)) + " мужчин, " + Integer.toString(k.get(1)) + " женщин, " + Integer.toString(k.get(2)) + " детей");
    }
    public Friday(String name, String Aff){
        super.setName(name);
        super.setAffilition(Aff);
    }
    @Override
    public void recognize(Place place){
        System.out.println(super.getName() + " узнал " + place.getname());
    }
    @Override
    public void happen(String Someone){
        System.out.println("Оказалось," + super.getName() + " бывал раньше в " + Someone);

    }
    @Override
    public void say(){
        System.out.print(super.getName() + " сказал, что когда ");

    }
    @Override
    public void UnKnown (String Lang){
        System.out.println("Он не знал, как сказать " + Lang);

    }
    @Override
    public void CountItems(String name, Integer count){
        System.out.println("Поэтому сложил " + Integer.toString(count) + " " + name + " возле друг друга, чтобы объяснить");

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

        return super.getName()==((Friday) o).getName();
    }
}
