package enums;

public enum Reasons {
    TRIMBERS_PLACE("служившее, местом сборища его соплеменников"),
    NOTHING("");

    private String res;
    Reasons(String type){
        res=type;
    }
    public String Type(){
        return this.res;
    }

}
