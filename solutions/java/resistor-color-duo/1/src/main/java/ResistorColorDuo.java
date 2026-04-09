import java.util.stream.*;
import java.util.Arrays;

class ResistorColorDuo {

    public enum Colors {
        black, brown, red, orange, yellow, green, blue, violet, grey, white
    }
    
    int value(String[] colors) {
        int counter = 0;
        StringBuilder sb = new StringBuilder("");
        for (String color : colors) {
            counter++;
            sb.append(Colors.valueOf(color).ordinal());
            if (counter == 2) {
                break;
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
