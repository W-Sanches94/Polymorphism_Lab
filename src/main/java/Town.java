import java.util.ArrayList;

public class Town {

    private ArrayList<Building> Building;

    public Town(){
        this.Building = new ArrayList<>();
    }

    public void addBuilding(Building building){
        this.Building.add(building);
    }

    public void RemoveBuilding(Building building){
        this.Building.remove(building);
    }

    public int countBuilding(){
        return Building.size();
    }

}
