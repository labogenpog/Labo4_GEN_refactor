package ch.heigvd.gen2019;

public enum Color {
    blue, red, yellow; //each is an instance of Color

    private Color(){}

    static public String printColor(int value){
        if (value > Color.values().length) {
            return "no color";
        } else {
            return (Color.values()[value-1].toString());
        }

    }
}
