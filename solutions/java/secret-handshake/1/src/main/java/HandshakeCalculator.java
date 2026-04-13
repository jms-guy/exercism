import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        String binary = Integer.toBinaryString(number);
        String reversedStr = new StringBuilder(binary).reverse().toString();
        char []bits = reversedStr.toCharArray();

        int place = 0;
        List<Signal> actions = new ArrayList<>();

        for (char b : bits) {
            if (place > 4) {
                break;
            }
            if (place == 4 && b == '1') {
                Collections.reverse(actions);
                break;
            }
            if (b == '1') {
                actions.add(Signal.values()[place]);
            }
            place++;
        }
        return actions;
    } 
}
