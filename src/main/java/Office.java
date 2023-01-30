import java.time.LocalDate;

public class Office extends Building{

    private String companyName;

    public Office(String name, int numberOfRooms, LocalDate dateOfConstruction){
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
}
