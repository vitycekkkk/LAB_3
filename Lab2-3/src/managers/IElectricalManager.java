import java.util.List;

public interface IElectricalManager {

    public void sortByDurationOfPhenomenon(List<ElectricalPhenomena> electricalPhenomena, boolean reverse);

    public void sortByName(List<ElectricalPhenomena> electricalPhenomena, boolean reverse);

    void sortByName(List<ElectricalPhenomena> electricalPhenomena);
}
