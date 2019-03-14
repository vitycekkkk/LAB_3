public class Electrophoresis extends ElectricalPhenomena {

    private String type;

    public Electrophoresis() {

    }


    public Electrophoresis(String name, int durationOfPhenomenon, Ampearage ampearage, String type) {
        super(name, durationOfPhenomenon, ampearage);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + " Type : " + type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
