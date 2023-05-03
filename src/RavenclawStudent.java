public class RavenclawStudent extends HogwartsStudent {

    public int smart;
    public int wise;
    public int witty;
    public int fullCreativity;
    public RavenclawStudent(String name, int magicPower, int transgressionDistance, int smart, int wise, int witty, int fullCreativity) {
        super(name, magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullCreativity = fullCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullCreativity() {
        return fullCreativity;
    }

    public void setFullCreativity(int fullCreativity) {
        this.fullCreativity = fullCreativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{"
                + super.toString()
                + " smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", fullCreativity=" + fullCreativity +
                '}';
    }
}
