import java.util.LinkedHashMap;
import java.util.ArrayList;

class ResistorColor {
    private LinkedHashMap<String, Integer> resistors;

    public ResistorColor() {
        this.resistors = new LinkedHashMap<>();
        this.resistors.put("black", 0);
        this.resistors.put("brown", 1);
        this.resistors.put("red", 2);
        this.resistors.put("orange", 3);
        this.resistors.put("yellow", 4);
        this.resistors.put("green", 5);
        this.resistors.put("blue", 6);
        this.resistors.put("violet", 7);
        this.resistors.put("grey", 8);
        this.resistors.put("white", 9);
    }
    
    public int colorCode(String color) {
        return this.resistors.get(color);
    }

    ArrayList<String> colors() {
        ArrayList<String> result = new ArrayList<String>();
        this.resistors.forEach( (k, v) -> {result.add(k); } );
        return result;
    }
}
