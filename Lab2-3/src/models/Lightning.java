public class Lightning extends ElectricalPhenomena {

    private int length;

    public Lightning(){
    }


    public Lightning(String name, int durationOfPhenomenon, Ampearage ampearage, int length) {
        super(name, durationOfPhenomenon, ampearage);
        this.length = length;
    }

    @Override
    public String toString() {
        return super.toString() + " Length : " + length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
