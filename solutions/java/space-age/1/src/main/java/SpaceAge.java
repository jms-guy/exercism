class SpaceAge {
    private double seconds;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return this.seconds;
    }

    double calcYears(double orbitalPeriod) {
        double days = (365.25 * orbitalPeriod);
        double secondsInYear = (days * 24 * 60 * 60);
        return (this.seconds / secondsInYear);
    }

    double onEarth() {
        return calcYears(1.0); 
    }

    double onMercury() {
        return calcYears(0.2408467);
    }

    double onVenus() {
        return calcYears(0.61519726);
    }

    double onMars() {
        return calcYears(1.8808158);
    }

    double onJupiter() {
        return calcYears(11.862615);
    }

    double onSaturn() {
        return calcYears(29.447498);
    }

    double onUranus() {
        return calcYears(84.016846);
    }

    double onNeptune() {
        return calcYears(164.79132);
    }

}
