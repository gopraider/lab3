package enums;

public enum Afflication {
    WITH_ME("Со мной"),
    WITH_TRIMBERS("В числе дикарей"),
    LIKE_FOOD("В качестве жертвы");
    private String Aff;
    Afflication(String type){
        Aff=type;
    }
    public String Type(){
        return this.Aff;
    }

}
