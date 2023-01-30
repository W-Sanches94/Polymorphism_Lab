import java.time.LocalDate;

public class Office extends Building{

    private String companyName;
    private int totalWaterDispensers;

    public Office(String name, int numberOfRooms, LocalDate dateOfConstruction){
        super (name,numberOfRooms, dateOfConstruction);
        this.companyName = companyName;
        this.totalWaterDispensers = totalWaterDispensers;
    }
}
