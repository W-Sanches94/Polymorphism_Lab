import java.time.LocalDate;

public class StudentFlat extends Building {

    private long numberOfPartiesHosted;
    private boolean OngoingParty;

    public StudentFlat(String name, int numberOfRooms, LocalDate dateOfConstruction,long numberOfPartiesHosted) {
        super(name, numberOfRooms, dateOfConstruction);
        this.numberOfPartiesHosted = numberOfPartiesHosted;
        this.OngoingParty = false;
    }

    public String stateFunction(){
        return this.name + " building was founded in " + dateOfConstruction + " and has " + numberOfRooms + " rooms.";
    }

    public String stateFunction(String additionalInfo){
        return this.name + " building was founded in " + dateOfConstruction + " and has " + numberOfRooms + " rooms. It has survived " + numberOfPartiesHosted + " parties.";
    }

    //GETTERS & SETTERS
    public long getNumberOfPartiesHosted() {
        return numberOfPartiesHosted;
    }

    public void setNumberOfPartiesHosted(long numberOfPartiesHosted) {
        this.numberOfPartiesHosted = numberOfPartiesHosted;
    }

    //update setters
}