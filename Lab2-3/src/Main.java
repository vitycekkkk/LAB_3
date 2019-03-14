import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ElectricalManager electricalManager = new ElectricalManager();

        Lightning lightning = new Lightning("Lightning" , 122 , Ampearage.HIGHT, 11 );
        ShortCircuit shortCircuit = new ShortCircuit("ShortCircuit" , 140 , Ampearage.LOW, "resistor");
        Electrophoresis electrophoresis = new Electrophoresis("Elecrophoresis" , 1800 , Ampearage.LOW , "Anaphoresis");
        Electroluminescence electroluminescence = new Electroluminescence("Electroluminescence" , 10080 , Ampearage.LOW, 3);

        List<ElectricalPhenomena> electricalPhenomena = new ArrayList<>();
        electricalPhenomena.add(lightning);
        electricalPhenomena.add(shortCircuit);
        electricalPhenomena.add(electrophoresis);
        electricalPhenomena.add(electroluminescence);

        electricalManager.sortByDurationOfPhenomenon(electricalPhenomena, false);
        System.out.println(electricalPhenomena);

        electricalManager.sortByName(electricalPhenomena);
        System.out.println(electricalPhenomena);



    }
}