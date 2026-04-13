import java.util.ArrayList;

class NaturalNumber {
    private Classification category;
    
    public NaturalNumber(int number) throws IllegalArgumentException {
        if (number <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        ArrayList<Integer> factors = getFactors(number);
        this.category = classifyNumber(factors, number);
    }

    public Classification getClassification() {
        return this.category;
    }

    private Classification classifyNumber(ArrayList<Integer> factors, int number) {
        if (factors.size() == 1) {
            return Classification.DEFICIENT;
        }
        
        int sum = 0;
        for (Integer f : factors) {
            sum += f;
        }

        return (sum == number) ? Classification.PERFECT : (sum > number) ? Classification.ABUNDANT : Classification.DEFICIENT;
    }

    private ArrayList<Integer> getFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        
        for (int i = 1; i <= Math.sqrt(number) ; i++) {
            if (number % i == 0) {
                factors.add(i);
                if (!factors.contains(number / i) && (number / i) != number) {
                    factors.add((number / i));
                }
            }
        }

        return factors;
    }
}
