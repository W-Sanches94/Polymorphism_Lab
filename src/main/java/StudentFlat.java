import java.time.LocalDate;

public class StudentFlat extends Building {

    private long numberOfPartiesHosted;
    private boolean OngoingParty;

    public StudentFlat(String name, int numberOfRooms, LocalDate dateOfConstruction, boolean centralHeating) {
        super(name, numberOfRooms, dateOfConstruction);
        this.numberOfPartiesHosted = numberOfPartiesHosted;
    }

    //GETTERS & SETTERS
    public long getNumberOfPartiesHosted() {
        return numberOfPartiesHosted;
    }

    public void setNumberOfPartiesHosted(long numberOfPartiesHosted) {
        this.numberOfPartiesHosted = numberOfPartiesHosted;
    }
}