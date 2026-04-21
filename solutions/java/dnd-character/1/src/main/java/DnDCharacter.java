import java.util.List;
import java.util.ArrayList;
import java.util.Random;

class DnDCharacter {
    private int strength;
    private int dexterity;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int constitution;
    private int healthPoints;
    private Random rand = new Random();

    public DnDCharacter() {
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());
        this.constitution = ability(rollDice());
        this.healthPoints = (10 + modifier(this.constitution));
    }

    int ability(List<Integer> scores) {
        ArrayList<Integer> newArray = new ArrayList<>(scores);
        int sum = 0;
        newArray.sort(null);
        newArray.remove(0);
        
        for (int i = 0; i < newArray.size(); i++) {
            sum += newArray.get(i);
        }
        return sum;
    }

    List<Integer> rollDice() {
        List<Integer> rolls = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            rolls.add(this.rand.nextInt(6) + 1);
        }
        return rolls;
    }

    int modifier(int input) {
        return Math.floorDiv((input - 10), 2);
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return this.healthPoints;
    }
}
