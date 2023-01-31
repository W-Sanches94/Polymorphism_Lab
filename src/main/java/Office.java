import java.time.LocalDate;

public class Office extends Building{

    private String companyName;

    public Office(String name, int numberOfRooms, LocalDate dateOfConstruction, String companyName){
        super (name,numberOfRooms, dateOfConstruction);
        this.companyName = companyName;
    }

    //GETTERS & SETTERS

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String stateFunction(){
        return this.name + " building was founded in " + dateOfConstruction + " and has " + numberOfRooms + " rooms.";
    }

    public String stateFunction(String AdditionalInfo){
        return this.name + " building was founded in " + dateOfConstruction + " and has " + numberOfRooms + " rooms. It is owned by " + companyName + ".";
    }
}
