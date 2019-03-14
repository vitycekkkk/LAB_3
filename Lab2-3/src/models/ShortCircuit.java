public class ShortCircuit extends  ElectricalPhenomena {

    private String detail;

    public ShortCircuit () {
    }


    public ShortCircuit(String name, int durationOfPhenomenon, Ampearage ampearage, String detail) {
        super(name, durationOfPhenomenon, ampearage);
        this.detail = detail;
    }

    @Override
    public String toString() {
        return super.toString() + " Detail : " + detail;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
