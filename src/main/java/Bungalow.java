import java.time.LocalDate;

public class Bungalow extends Building{

    private boolean centralHeating;

    public Bungalow (String name, int numberOfRooms, LocalDate dateOfConstruction, boolean centralHeating){
        super (name, numberOfRooms, dateOfConstruction);
        this.centralHeating = centralHeating;
    }


}
