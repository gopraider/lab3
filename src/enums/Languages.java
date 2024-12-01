package enums;

public enum Languages {
    ENGLISH("По-Английски"),
    FRENCH("По-Французски");
    private String Lang;
    Languages(String type){
        Lang=type;
    }
    public String Type(){
        return this.Lang;
    }

}
