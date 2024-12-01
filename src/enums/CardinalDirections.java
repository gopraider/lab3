package enums;

public enum CardinalDirections {
    NORTH_WESTERN("Северо-западной"),
    ANOTHER("Те"),
    ALLIN("Всей");
    private String Direct;
    CardinalDirections(String type){
        Direct=type;
    }
    public String Type(){
        return this.Direct;
    }

}
