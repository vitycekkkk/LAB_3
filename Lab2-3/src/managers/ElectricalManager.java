import java.util.List;
import java.util.stream.Collectors;

public class ElectricalManager implements IElectricalManager {

    private List<ElectricalPhenomena> electricalPhenomena;

    public ElectricalManager() {

    }

    public ElectricalManager(List<ElectricalPhenomena> electricalPhenomena) {
        this.electricalPhenomena = electricalPhenomena;
    }

    public List<ElectricalPhenomena> getElectricalPhenomena() {
        return electricalPhenomena;
    }

    public void setElectricalPhenomena(List<ElectricalPhenomena> electricalPhenomena) {
        this.electricalPhenomena = electricalPhenomena;
    }

    @Override
    public void sortByDurationOfPhenomenon(List<ElectricalPhenomena> electricalPhenomena, boolean reverse) {

    }

    @Override
    public void sortByName(List<ElectricalPhenomena> electricalPhenomena, boolean reverse) {

    }

    @Override
    public void sortByName(List<ElectricalPhenomena> electricalPhenomena) {

    }

    public List<ElectricalPhenomena> findByAmpearage(Ampearage ampearage){
        List<ElectricalPhenomena> electricalPhenomenaList = electricalPhenomena;
        List<ElectricalPhenomena> findElectricalPhenomenaList = electricalPhenomenaList.stream().filter(electricalPhenomena -> electricalPhenomena.getAmpearage() == ampearage).collect(Collectors.toList());
        return findElectricalPhenomenaList;
    }


}
