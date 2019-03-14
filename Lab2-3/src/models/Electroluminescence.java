public class Electroluminescence extends ElectricalPhenomena {

    private int brightness; // 0 -off ; 1 - low; 2 -middle; 3 -hight;

    public Electroluminescence() {

    }


    public Electroluminescence(String name, int durationOfPhenomenon, Ampearage ampearage, int brightness) {
        super(name, durationOfPhenomenon, ampearage);
        this.brightness = brightness;
    }

    @Override
    public String toString() {
        return super.toString() + " Brightness : " + brightness;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
}


