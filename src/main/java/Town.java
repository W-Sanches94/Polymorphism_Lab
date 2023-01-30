import java.util.ArrayList;

public class Town {

    private ArrayList<Building> Building;

    public Town(){
        this.Building = new ArrayList<>();
    }

    public void addBuilding(Building building){
        this.Building.add(building);
    }

}
