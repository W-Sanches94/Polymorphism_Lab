import java.time.LocalDate;

public abstract class Building {

    protected String name;
    protected int numberOfRooms;
    protected LocalDate dateOfConstruction;

    public Building (String name, int numberOfRooms, LocalDate dateOfConstruction){
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.dateOfConstruction = dateOfConstruction;
    }

    // GETTERS & SETTERS


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public LocalDate getDateOfConstruction() {
        return dateOfConstruction;
    }

    public void setDateOfConstruction(LocalDate dateOfConstruction) {
        this.dateOfConstruction = dateOfConstruction;
    }
}
