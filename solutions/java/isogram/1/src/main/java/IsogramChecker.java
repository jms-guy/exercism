import java.util.HashMap;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        HashMap<Character, Boolean> letterMap = new HashMap<>();
        char[] asArray = phrase.toCharArray();

        for (char c : asArray) {
            if (Character.isLetter(c))
                if (letterMap.get(Character.toLowerCase(c)) == null) {
                    letterMap.put(Character.toLowerCase(c), true);
                    continue;
                } else {
                    return false;
                }
        }
        return true;
    }

}
