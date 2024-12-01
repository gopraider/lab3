package Places;

import Person.Person;

public abstract class Place {
    private String name;
    private String reason;
    abstract void enterplace(Person p1);

    public void setname(String name){
        this.name=name;
    };

    public String getname(){
        return this.name;
    };

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }
}
