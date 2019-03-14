public class ElectricalPhenomena {

    private Ampearage ampearage;
    private String name;
    private int durationOfPhenomenon;

    public ElectricalPhenomena() {
    }

    public ElectricalPhenomena(String name, int durationOfPhenomenon, Ampearage ampearage) {
        this.name = name;
        this.durationOfPhenomenon = durationOfPhenomenon;
        this.ampearage = ampearage;
    }

    @Override
    public String toString() {
        return "ElectricalPhenomena{" +
                "name='" + name + '\'' +
                ", durationOfPhenomenon=" + durationOfPhenomenon +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationOfPhenomenon() {
        return durationOfPhenomenon;
    }

    public void setDurationOfPhenomenon(int durationOfPhenomenon) {
        this.durationOfPhenomenon = durationOfPhenomenon;
    }

    public Ampearage getAmpearage() {
        return ampearage;
    }

    public void setAmpearage(Ampearage ampearage) {
        this.ampearage = ampearage;
    }
}