public class Hufflepuff extends HogwartsStudent {

    public int hardworking;
    public int loyal;
    public int honest;
    public Hufflepuff(String name, int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
    @Override
    public String toString() {
        return "Hufflepuff{ "+super.toString() + "hardworking=" + hardworking + ", loyal=" + loyal + ", honest=" + honest +
                '}';
    }
}
